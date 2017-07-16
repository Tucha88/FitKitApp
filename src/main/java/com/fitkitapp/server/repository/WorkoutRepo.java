package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Boris on 15.07.2017.
 */
public interface WorkoutRepo extends JpaRepository<Workout,Long> {
}
