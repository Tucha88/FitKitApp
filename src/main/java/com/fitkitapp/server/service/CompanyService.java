package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Company;
import com.fitkitapp.server.models.Employees;
import com.fitkitapp.server.models.Gym;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
public interface CompanyService {
    Company findCompanyByEmail(String name);

    Company createNewCompany(Company company);

    Gym createNewGym(Gym gym, String companyName);

    Gym findGymById(Long id);

    ArrayList<Gym> getAllGyms(String companyName);

    boolean addAdministratorToGym(String token, Long gymId, Employees employees);
}
