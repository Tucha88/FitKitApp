package com.fitkitapp.server.util;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Workout;

/**
 * Created by Boris on 02.10.2017.
 */
public class WorkoutConverter extends StdConverter<Workout, Long> {
    @Override
    public Long convert(Workout workout) {
        return workout.getId();
    }
}
