package com.fitkitapp.server.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fitkitapp.server.util.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created on 10.07.2017.
 * <p>Gym class</p>
 * @author boris
 */
@Entity
@Table(name = "Gym")
public class Gym implements Serializable, Comparable<Gym> {
    private static final long serialVersionUID = 111111117L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonSerialize(converter = ListEmployeesConverter.class)
    private Collection<Employees> employees = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JsonSerialize(converter = ListClientConverter.class)
    private Collection<Client> clients = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JsonSerialize(converter = ListAbonnementsConverter.class)
    private Collection<Abonnement> abonnements = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JsonSerialize(converter = ListPostsConvernter.class)
    private Collection<Post> posts = new ArrayList<>();

    @ManyToOne(cascade = {CascadeType.ALL})
    private Permission permission;

    @OneToOne(cascade = {CascadeType.ALL})
    private FullInfo fullInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company", referencedColumnName = "ID")
    @JsonSerialize(converter = CompanyConverter.class)
    private Company company;


    public Gym() {
    }

    public Gym(Collection<Employees> employees, Collection<Client> clients, Collection<Abonnement> abonnements,
               Collection<Post> posts, Permission permission, FullInfo fullInfo, Company company) {

        this.employees = employees;
        this.clients = clients;
        this.abonnements = abonnements;
        this.posts = posts;
        this.permission = permission;
        this.fullInfo = fullInfo;
        this.company = company;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employees> employees) {
        this.employees = employees;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }

    public Collection<Abonnement> getAbonnements() {
        return abonnements;
    }

    public void setAbonnements(Collection<Abonnement> abonnements) {
        this.abonnements = abonnements;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {
        Gym gym = obj instanceof Gym ? (Gym) obj : null;
        if (gym == null) {
            return false;
        }
        return gym.getId() == this.getId();
    }

    @Override
    public int compareTo(Gym o) {
        return o.getId() == this.getId() ? 0 : 1;
    }

    public void addEmployee(Employees employees) {
        this.employees.add(employees);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
