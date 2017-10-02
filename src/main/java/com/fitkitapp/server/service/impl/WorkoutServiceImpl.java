package com.fitkitapp.server.service.impl;

import com.fitkitapp.server.models.Exercise;
import com.fitkitapp.server.repository.ExerciseRepo;
import com.fitkitapp.server.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Boris on 02.10.2017.
 */
public class WorkoutServiceImpl implements WorkoutService {
    @Autowired
    private ExerciseRepo exerciseRepo;

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseRepo.findAll();
    }

    @Override
    public Exercise addExercise(Exercise exercise) {
        return null;
    }
}
