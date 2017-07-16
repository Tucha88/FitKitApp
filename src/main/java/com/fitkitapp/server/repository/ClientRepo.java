package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 14.07.2017.
 */
@Repository
public interface ClientRepo extends JpaRepository<Client,Long>{
}
