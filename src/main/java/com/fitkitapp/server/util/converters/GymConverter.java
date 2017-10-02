package com.fitkitapp.server.util.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Gym;

/**
 * Created by Boris on 09.08.2017.
 * json converter for Gym class
 */
public class GymConverter extends StdConverter<Gym, Long> {
    @Override
    public Long convert(Gym gym) {
        return gym.getId();
    }
}
