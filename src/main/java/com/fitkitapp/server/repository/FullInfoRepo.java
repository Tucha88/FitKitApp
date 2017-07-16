package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.FullInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 14.07.2017.
 */
@Repository
public interface FullInfoRepo extends JpaRepository<FullInfo,Long>{
}
