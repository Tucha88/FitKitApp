package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 14.07.2017.
 */
@Repository
public interface PermissionRepo extends JpaRepository<Permission,Long> {
}
