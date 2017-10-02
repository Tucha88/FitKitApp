package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 14.07.2017.
 */
@Repository
public interface ClientRepo extends JpaRepository<Client,Long>{
    @Query("SELECT a FROM Client a WHERE a.email = :email")
    Client findByEmail(@Param("email") String email);

    Client findByLogin(String login);

    Client findClientById(Long id);
}
