package com.fitkitapp.server.util;

import org.springframework.stereotype.Service;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
public interface Utils {

    String hashPassword(String rawPassword);

    String parsJwt(String token);

    String buildJwt(String email);

    Boolean isPasswordCorrect(String newPassword, String hashedPassword);
}
