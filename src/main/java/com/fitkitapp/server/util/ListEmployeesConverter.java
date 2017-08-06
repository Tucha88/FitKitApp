package com.fitkitapp.server.util;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Employees;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Boris on 06.08.2017.
 */
public class ListEmployeesConverter extends StdConverter<List<Employees>, List<Long>> {

    @Override
    public List<Long> convert(List<Employees> employees) {

        return employees.stream().map(Employees::getId).collect(Collectors.toList());
    }
}
