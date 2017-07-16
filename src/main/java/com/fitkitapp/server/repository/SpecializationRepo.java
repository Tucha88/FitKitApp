package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Boris on 15.07.2017.
 */
public interface SpecializationRepo extends JpaRepository<Specialization,Long> {
}
