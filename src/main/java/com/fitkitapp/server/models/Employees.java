package com.fitkitapp.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Employees class</p>
 * Entity who works in gym (admin, trainer etc...)
 * @author boris
 */
@Entity
@Table(name = "Employees")
public class Employees extends Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "ROLE")
    private Role role;
    @JoinColumn(name = "PERMISSIONS_IDS")
    private ArrayList<Permission> permissions;
    @ManyToMany
    @JoinColumn(name = "CLIENTS_IDS")
    private ArrayList<Client> clients = new ArrayList<>();
    @JoinColumn(name = "SPECIALIZATION_ID")
    private Specialization specialization;
    private String aboutMe;

    public Employees() {
    }

    public Employees(String firstName, String lastName, Gender gender, String login, String password,
                     String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym,
                     Role role, ArrayList<Permission> permissions, String aboutMe, ArrayList<Client> clients,
                     Specialization specialization) {
        super(firstName, lastName, gender, login, password, email, phoneNumber, dateOfBirth, avatar, gym);
        this.role = role;
        this.permissions = permissions;
        this.aboutMe = aboutMe;
        this.clients = clients;
        this.specialization = specialization;
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

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
