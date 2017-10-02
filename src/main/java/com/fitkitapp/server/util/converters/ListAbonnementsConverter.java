package com.fitkitapp.server.util.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Abonnement;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Boris on 06.08.2017.
 */
public class ListAbonnementsConverter extends StdConverter<List<Abonnement>, List<Long>> {
    @Override
    public List<Long> convert(List<Abonnement> abonnements) {
        return abonnements.stream().map(Abonnement::getId).collect(Collectors.toList());
    }
}
