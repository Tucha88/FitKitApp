package com.fitkitapp.server.util.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Exercise;
import com.fitkitapp.server.models.SRWD;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Boris on 02.10.2017.
 */
public class ExerciseMapConverter extends StdConverter<Map<Exercise, SRWD>, Map<Long, Long>> {
    @Override
    public Map<Long, Long> convert(Map<Exercise, SRWD> exerciseSRWDMap) {
        return exerciseSRWDMap.entrySet().stream().collect(Collectors.toMap(e -> e.getKey().getId(), e -> e.getValue().getId()));
    }
}
