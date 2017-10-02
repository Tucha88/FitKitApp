package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Exercise;

import java.util.List;

/**
 * Created by Boris on 02.10.2017.
 */
public interface WorkoutService {
    List<Exercise> getAllExercises();

    Exercise addExercise(Exercise exercise);
}
