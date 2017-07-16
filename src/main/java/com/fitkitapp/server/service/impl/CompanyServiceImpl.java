package com.fitkitapp.server.service.impl;

import com.fitkitapp.server.models.Company;
import com.fitkitapp.server.repository.CompanyRepo;
import com.fitkitapp.server.service.CompanyService;
import com.fitkitapp.server.util.Utils;
import com.fitkitapp.server.util.UtilsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {


    private final Utils utils;
    private final CompanyRepo companyRepo;

    @Autowired
    public CompanyServiceImpl(Utils utils, CompanyRepo companyRepo) {
        this.utils = utils;
        this.companyRepo = companyRepo;
    }

    @Override
    public Company findCompanyByEmail(String name) {
        Company company = companyRepo.findByCompanyName(name);
        return company;
    }

    @Override
    public Company createNewCompany(Company company) {
        company.setPassword(utils.hashPassword(company.getPassword()));
        companyRepo.save(company);
        companyRepo.flush();
        return company;
    }
}
