package com.fitkitapp.server.service.impl;

import com.fitkitapp.server.models.*;
import com.fitkitapp.server.repository.CompanyRepo;
import com.fitkitapp.server.repository.GymRepo;
import com.fitkitapp.server.service.CompanyService;
import com.fitkitapp.server.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {


    private final Utils utils;
    private final CompanyRepo companyRepo;
    private final GymRepo gymRepo;

    @Autowired
    public CompanyServiceImpl(Utils utils, CompanyRepo companyRepo, GymRepo gymRepo) {
        this.utils = utils;
        this.companyRepo = companyRepo;
        this.gymRepo = gymRepo;
    }

    @Override
    public Company findCompanyByEmail(String name) {
        return companyRepo.findByCompanyName(name);
    }

    @Override
    public Company createNewCompany(Company company) {
        if (companyRepo.findByCompanyName(company.getCompanyName()) != null) {
            return null;
        }
        company.setPassword(utils.hashPassword(company.getPassword()));
        companyRepo.save(company);
        companyRepo.flush();
        return company;
    }

    @Override
    public Gym createNewGym(Gym gym, String companyName) {
        Company companyFind = companyRepo.findByCompanyName(companyName);
        if (companyFind == null) {
            return null;
        }
        companyFind.addGym(gym);
        gym.setCompany(companyFind);
        companyRepo.saveAndFlush(companyFind);
        return gym;
    }

    @Override
    public Gym findGymById(Long id) {
        return gymRepo.findGymById(id);
    }

    @Override
    public ArrayList<Gym> getAllGyms(String companyName) {
        ArrayList<Gym> gyms = new ArrayList<>();
        gyms.addAll(companyRepo.findByCompanyName(companyName).getGyms());
        return gyms;
    }

    @Override
    public boolean addAdministratorToGym(String token, Long gymId, Employees employees) {
        Company company = companyRepo.findByCompanyName(utils.parsJwt(token));
        Gym gym = gymRepo.findGymById(gymId);
        if (gym.getCompany().getId().longValue() == company.getId().longValue()) {
            employees.setRole(new Role("Super Admin"));
            Permission permission = new Permission(true, true, true, true, true, true, true, true, true, true
                    , true, true, true, true, true, true, true, true);

            employees.setPermissions(permission);
            gym.addEmployee(employees);
            employees.setGym(gym);
            gymRepo.saveAndFlush(gym);
            return true;
        }
        return false;
    }
}
