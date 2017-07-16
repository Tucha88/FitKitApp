package com.fitkitapp.server.models;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created on 10.07.2017.
 * <p>Company class</p>
 * Top most entity to create and mange gyms
 * @author boris
 */
@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long companyId;
    @Column
    @OneToMany
    @JoinColumn(name = "GYMS_ID")
    private ArrayList<Gym> gyms;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    private String password;

    public Company() {
    }

    public Company(ArrayList<Gym> gyms, String companyName, String password) {

        this.gyms = gyms;
        this.companyName = companyName;
        this.password = password;
    }

    public Long getCompanyId() {

        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public ArrayList<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(ArrayList<Gym> gyms) {
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
}
