package com.fitkitapp.server.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Boris on 16.07.2017.
 */
@Service
public class UtilsImpl implements Utils {



    @Override
    public String hashPassword(String rawPassword) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(rawPassword);
    }

    @Override
    public String parsJwt(String token) {
        String email = Jwts.parser()
                .setSigningKey("ujhswljbnwygh2379633278uYYGHBGYG")
                .parseClaimsJws(token)
                .getBody()
                .get("sub", String.class);
        return email;
    }

    @Override
    public String buildJwt(String email) {
        return Jwts.builder()
                .setSubject(email)
                .claim("roles", "user")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "ujhswljbnwygh2379633278uYYGHBGYG").compact();
    }

    @Override
    public Boolean isPasswordCorrect(String newPassword, String hashedPassrod) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(newPassword, hashedPassrod);
    }
}
