package com.fitkitapp.server.settings.validation;

import com.fitkitapp.server.repository.AccountRepo;
import com.fitkitapp.server.repository.ClientRepo;
import com.fitkitapp.server.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Boris on 30.09.2017.
 */
@Component
public class ServiceUtils {

    private static ServiceUtils instance;

    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private AccountRepo accountRepo;

    public static ClientRepo getClientRepo() {
        return instance.clientRepo;
    }

    public static EmployeeRepo getEmployeeRepo() {
        return instance.employeeRepo;
    }

    public static AccountRepo getAccountRepo() {
        return instance.accountRepo;
    }

    @PostConstruct
    public void fillInstance() {
        instance = this;
    }
}
