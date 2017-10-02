package com.fitkitapp.server.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fitkitapp.server.util.converters.ListClientConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Employees class</p>
 * Entity who works in gym (admin, trainer etc...)
 * @author boris
 */
@Entity
@Table(name = "Employees")
public class Employees extends Person implements Serializable {
    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Role role;
    @ManyToOne(cascade = CascadeType.ALL)
    private Permission permissions;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonSerialize(converter = ListClientConverter.class)
    private Collection<Client> clients = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    private Specialization specialization;
    private String aboutMe;
    @OneToOne
    private Account account;

    public Employees(String firstName, String lastName, Gender gender, String login, String password,
                     String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym,
                     Role role, Permission permissions, Collection<Client> clients,
                     Specialization specialization, String aboutMe, Account account) {
        super(firstName, lastName, gender, login, password, email, phoneNumber, dateOfBirth, avatar, gym);
        this.role = role;
        this.permissions = permissions;
        this.clients = clients;
        this.specialization = specialization;
        this.aboutMe = aboutMe;
        this.account = account;
    }

    public Employees() {
    }

    public Employees(String firstName, String lastName, Gender gender, String login, String password,
                     String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym, Role role,
                     Permission permissions, Collection<Client> clients, Specialization specialization, String aboutMe) {

        super(firstName, lastName, gender, login, password, email, phoneNumber, dateOfBirth, avatar, gym);
        this.role = role;
        this.permissions = permissions;
        this.clients = clients;
        this.specialization = specialization;
        this.aboutMe = aboutMe;
    }

    public Account getAccount() {

        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermissions() {
        return permissions;
    }

    public void setPermissions(Permission permissions) {
        this.permissions = permissions;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
