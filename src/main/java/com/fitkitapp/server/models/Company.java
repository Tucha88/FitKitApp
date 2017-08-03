package com.fitkitapp.server.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created on 10.07.2017.
 * <p>Company class</p>
 * Top most entity to create and mange gyms
 * @author boris
 */
@Entity
@Table(name = "Company")
public class Company implements Serializable {

    private static final long serialVersionUID = 111111113L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Gym> gyms = new ArrayList<>();

    @Column(name = "COMPANY_NAME")
    private String companyName;

    private String password;

    public Company() {
    }

    public Company(Collection<Gym> gyms, String companyName, String password) {

        this.gyms = gyms;
        this.companyName = companyName;
        this.password = password;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(Collection<Gym> gyms) {
        this.gyms = gyms;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addGym(Gym gym) {
        this.gyms.add(gym);
    }
}
