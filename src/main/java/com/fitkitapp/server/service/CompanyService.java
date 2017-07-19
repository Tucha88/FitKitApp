package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Company;
import org.springframework.stereotype.Service;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
public interface CompanyService {
    Company findCompanyByEmail(String name);

    Company createNewCompany(Company company);
}
