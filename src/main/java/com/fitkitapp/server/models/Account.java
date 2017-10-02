package com.fitkitapp.server.models;

import com.fitkitapp.server.settings.validation.UniqueEmail;
import com.fitkitapp.server.settings.validation.UniqueUsername;

import javax.persistence.*;

/**
 * Created by Boris on 30.09.2017.
 */
@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @UniqueUsername(message = "Username already exists")
    @Column(unique = true)
    private String username;

    @UniqueEmail(message = "Email already in use")
    private String email;

    private String password;

    //    @NotNull
    private boolean enabled = true;

    //    @NotNull
    private boolean credentialsexpired = false;

    //    @NotNull
    private boolean expired = false;

    //    @NotNull
    private boolean locked = false;


    public Account() {
    }

    public Account(String username, String email, String password,
                   boolean enabled, boolean credentialsexpired, boolean expired, boolean locked) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.credentialsexpired = credentialsexpired;
        this.expired = expired;
        this.locked = locked;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isCredentialsexpired() {
        return credentialsexpired;
    }

    public void setCredentialsexpired(boolean credentialsexpired) {
        this.credentialsexpired = credentialsexpired;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
