package com.fitkitapp.server.service.impl;

import com.fitkitapp.server.models.Employees;
import com.fitkitapp.server.models.Gym;
import com.fitkitapp.server.models.Post;
import com.fitkitapp.server.repository.ClientRepo;
import com.fitkitapp.server.repository.CompanyRepo;
import com.fitkitapp.server.repository.EmployeeRepo;
import com.fitkitapp.server.repository.GymRepo;
import com.fitkitapp.server.service.GymService;
import com.fitkitapp.server.util.Utils;

/**
 * Created by Boris on 09.08.2017.
 */
public class GymServiceImpl implements GymService {

    private final Utils utils;
    private final CompanyRepo companyRepo;
    private final GymRepo gymRepo;
    private final ClientRepo clientRepo;
    private final EmployeeRepo employeeRepo;

    public GymServiceImpl(Utils utils, CompanyRepo companyRepo, GymRepo gymRepo,
                          ClientRepo clientRepo, EmployeeRepo employeeRepo) {
        this.utils = utils;
        this.companyRepo = companyRepo;
        this.gymRepo = gymRepo;
        this.clientRepo = clientRepo;
        this.employeeRepo = employeeRepo;
    }

    @Override
    public String createPost(Post post, Long gymId, Long adminId) {
        Gym gym = gymRepo.findGymById(gymId);
        Employees employees = employeeRepo.findEmployeesById(adminId);
        if (gym == null || employees == null || employees.getGym().getId().longValue() != gym.getId().longValue()) {
            return "gym/admin not found";
        }
        if (!employees.getPermissions().getCreatePost()) {
            return "admin doesn't have permission";

        }
        gym.addPost(post);
        return "Post created";
    }

    @Override
    public String createNewEmployee(Employees employees, Long gymId, Long adminId) {
        Employees admin = employeeRepo.findEmployeesById(adminId);
        Gym gym = gymRepo.findGymById(gymId);
        if (gym == null || admin == null || admin.getGym().getId().longValue() != gym.getId().longValue()) {
            return "gym/admin not found";
        }
        if (!admin.getPermissions().getCRUDEmployees()) {
            return "admin doesn't have permission";
        }
        if (employeeRepo.findEmployeesByEmail(employees.getEmail()) != null) {
            return "employee already exists";
        }
        gym.addEmployee(employees);
        employees.setGym(gym);
        gymRepo.saveAndFlush(gym);
        employeeRepo.saveAndFlush(employees);
        return "Employee created";
    }

    @Override
    public Object getGymInfo(Long gymId, Long adminId) {
        Gym gym = gymRepo.findGymById(gymId);
        Employees employees = employeeRepo.findEmployeesById(adminId);
        if (gym == null || employees == null || employees.getGym().getId().longValue() != gym.getId().longValue()) {
            return "gym/admin not found";
        }
        return gym;
    }


}
