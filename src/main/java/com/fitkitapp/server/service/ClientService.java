package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Client;

/**
 * Created by Boris on 09.08.2017.
 */
public interface ClientService {

    Object registerNewClient(Client client);

    String loginClient(Client client);

    Object getUser(String s);
}
