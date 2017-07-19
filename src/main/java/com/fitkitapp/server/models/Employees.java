package com.fitkitapp.server.models;

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
    @OneToOne
    private Role role;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Permission> permissions;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Client> clients = new ArrayList<>();
    @ManyToOne
    private Specialization specialization;
    private String aboutMe;

    public Employees() {
    }

    public Employees(Role role, Collection<Permission> permissions, Collection<Client> clients, Specialization specialization, String aboutMe) {

        this.role = role;
        this.permissions = permissions;
        this.clients = clients;
        this.specialization = specialization;
        this.aboutMe = aboutMe;
    }

    public Employees(String firstName, String lastName, Gender gender, String login, String password, String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym, Role role, Collection<Permission> permissions, Collection<Client> clients, Specialization specialization, String aboutMe) {
        super(firstName, lastName, gender, login, password, email, phoneNumber, dateOfBirth, avatar, gym);
        this.role = role;
        this.permissions = permissions;
        this.clients = clients;
        this.specialization = specialization;
        this.aboutMe = aboutMe;
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

    public Collection<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Collection<Permission> permissions) {
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
