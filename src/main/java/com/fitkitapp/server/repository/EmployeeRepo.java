package com.fitkitapp.server.repository;

import com.fitkitapp.server.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Boris on 14.07.2017.
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employees,Long> {
    Employees findEmployeesByEmail(String email);

    Employees findEmployeesById(Long id);

    Employees findEmployeesByLogin(String login);
}
