package com.fitkitapp.server.settings.validation;

import com.fitkitapp.server.repository.ClientRepo;
import com.fitkitapp.server.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Boris on 29.09.2017.
 */
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public void initialize(UniqueUsername uniqueUsername) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (clientRepo == null && employeeRepo == null) {
            return true;
        } else if (clientRepo.findByLogin(s) != null) {
            return false;
        } else
            return employeeRepo.findEmployeesByLogin(s) == null;
    }
}
