package com.fitkitapp.server.models;

/**
 * Created on 02.08.2017
 *
 * @author boris
 */
public class Token {
    private String token;
    private Long id;

    public Token() {
    }

    public Token(String token, Long id) {
        this.id = id;
        this.token = token;
    }

    public String getToken() {

        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
