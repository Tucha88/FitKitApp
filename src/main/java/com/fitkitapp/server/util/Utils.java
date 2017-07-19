package com.fitkitapp.server.util;

/**
 * Created by Boris on 16.07.2017.
 */
public interface Utils {

    String hashPassword(String rawPassword);

    String parsJwt(String token);

    String buildJwt(String email);

    Boolean isPasswordCorrect(String newPassword, String hashedPassword);
}
