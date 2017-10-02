package com.fitkitapp.server.service.impl;

import com.fitkitapp.server.models.Client;
import com.fitkitapp.server.repository.*;
import com.fitkitapp.server.service.ClientService;
import com.fitkitapp.server.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Boris on 09.08.2017.
 */
@Service
public class ClientServiceImpl implements ClientService {

    private final Utils utils;
    private final CompanyRepo companyRepo;
    private final GymRepo gymRepo;
    private final ClientRepo clientRepo;
    private final EmployeeRepo employeeRepo;
    private final AccountRepo accountRepo;

    @Autowired
    public ClientServiceImpl(Utils utils, CompanyRepo companyRepo, GymRepo gymRepo,
                             ClientRepo clientRepo, EmployeeRepo employeeRepo, AccountRepo accountRepo) {
        this.utils = utils;
        this.companyRepo = companyRepo;
        this.gymRepo = gymRepo;
        this.clientRepo = clientRepo;
        this.employeeRepo = employeeRepo;
        this.accountRepo = accountRepo;
    }


    @Override
    public Object registerNewClient(Client client) {
        client.setPassword(utils.hashPassword(client.getPassword()));
        clientRepo.save(client);
        client.setToken(utils.buildJwt(client.getEmail()));
        return client.getToken();
    }

    @Override
    public String loginClient(Client client) {
        Client client1 = clientRepo.findByEmail(client.getEmail());
        if (client1 == null) {
            return null;
        }
        if (!utils.isPasswordCorrect(client.getPassword(), client1.getPassword())) {
            return null;
        }
        client.setToken(utils.buildJwt(client.getEmail()));
        clientRepo.save(client1);
        return client.getToken();
    }

    @Override
    public Object getUser(String s) {
        return clientRepo.findByEmail(utils.parsJwt(s));
    }

}
