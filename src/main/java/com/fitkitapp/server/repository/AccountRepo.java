package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 30.09.2017.
 */
@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    Account findByEmail(String email);

    Account findByUsername(String username);

}
