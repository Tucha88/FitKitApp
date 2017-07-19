package com.fitkitapp.server.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created on 10.07.2017.
 * <p>Gym class</p>
 * @author boris
 */
@Entity
@Table(name = "Gym")
public class Gym implements Serializable {
    private static final long serialVersionUID = 111111117L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Employees> employees;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Client> clients;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Abonnement> abonnements;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Post> posts;

    @ManyToOne
    private Permission permission;

    @OneToOne
    private FullInfo fullInfo;

    @ManyToOne
    @JoinColumn(name = "company", referencedColumnName = "ID")
    private Company company;


    public Gym() {
    }

    public Gym(Collection<Employees> employees, Collection<Client> clients, Collection<Abonnement> abonnements, Collection<Post> posts, Permission permission, FullInfo fullInfo, Company company) {

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
}
