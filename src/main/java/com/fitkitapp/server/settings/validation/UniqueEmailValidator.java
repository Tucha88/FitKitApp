package com.fitkitapp.server.settings.validation;

import com.fitkitapp.server.repository.AccountRepo;
import com.fitkitapp.server.repository.ClientRepo;
import com.fitkitapp.server.repository.EmployeeRepo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Boris on 30.09.2017.
 */
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private ClientRepo clientRepo;
    private EmployeeRepo employeeRepo;
    private AccountRepo accountRepo;

    @Override
    public void initialize(UniqueEmail uniqueEmail) {
        clientRepo = ServiceUtils.getClientRepo();
        employeeRepo = ServiceUtils.getEmployeeRepo();
        accountRepo = ServiceUtils.getAccountRepo();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (clientRepo == null && employeeRepo == null) {
            return true;
        }
        return clientRepo.findByEmail(s) == null && employeeRepo.findEmployeesByEmail(s) == null;
    }
}
