package com.fitkitapp.server.util.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Client;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Boris on 06.08.2017.
 */
public class ListClientConverter extends StdConverter<List<Client>, List<Long>> {
    @Override
    public List<Long> convert(List<Client> clients) {
        return clients.stream().map(Client::getId).collect(Collectors.toList());
    }
}
