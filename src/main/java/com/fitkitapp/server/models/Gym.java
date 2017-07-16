package com.fitkitapp.server.models;

import javax.persistence.*;
import java.util.ArrayList;
/**
 * Created on 10.07.2017.
 * <p>Gym class</p>
 * @author boris
 */
@Entity
@Table(name = "Gym")
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @OneToMany
    @JoinColumn(name = "EMPLOYEES_ID")
    private ArrayList<Employees> employees = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "CLIENTS_ID")
    private ArrayList<Client> clients = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "ABONNEMENTS_ID")
    private ArrayList<Abonnement> abonnements = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "POSTS_ID")
    private ArrayList<Post> posts = new ArrayList<>();
    @Column(name = "Permissions")
    private Permission permission;
    @JoinColumn(name = "FULL_INFO_ID")
    private FullInfo fullInfo;

    public Gym() {
    }

    public Gym(ArrayList<Employees> employees, ArrayList<Client> clients, ArrayList<Abonnement> abonnements,
               ArrayList<Post> posts, Permission permission, FullInfo fullInfo) {

        this.employees = employees;
        this.clients = clients;
        this.abonnements = abonnements;
        this.posts = posts;
        this.permission = permission;
        this.fullInfo = fullInfo;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Abonnement> getAbonnements() {
        return abonnements;
    }

    public void setAbonnements(ArrayList<Abonnement> abonnements) {
        this.abonnements = abonnements;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public FullInfo getFullInfo() {
        return fullInfo;
    }

    public void setFullInfo(FullInfo fullInfo) {
        this.fullInfo = fullInfo;
    }
}
