package com.fitkitapp.server.util;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Company;

/**
 * Created by Boris on 06.08.2017.
 */
public class CompanyConverner extends StdConverter<Company, Long> {
    @Override
    public Long convert(Company company) {
        return company.getId();
    }
}
