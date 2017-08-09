package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 15.07.2017.
 */
@Repository
public interface GymRepo extends JpaRepository<Gym,Long>{
    Gym findGymById(Long id);
}
