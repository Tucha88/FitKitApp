package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Company;

/**
 * Created by Boris on 16.07.2017.
 */
public interface CompanyService {
    Company findCompanyByEmail(String name);

    Company createNewCompany(Company company);
}
