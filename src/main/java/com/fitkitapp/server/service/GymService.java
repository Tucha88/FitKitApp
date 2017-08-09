package com.fitkitapp.server.service;

import com.fitkitapp.server.models.Employees;
import com.fitkitapp.server.models.Post;

/**
 * Created by Boris on 09.08.2017.
 */
public interface GymService {
    String createPost(Post post, Long gymId, Long adminEmail);

    String createNewEmployee(Employees employees, Long gymId, Long adminId);

    Object getGymInfo(Long gymId, Long adminId);

}
