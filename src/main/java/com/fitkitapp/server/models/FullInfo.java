package com.fitkitapp.server.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created on 10.07.2017.
 * <p>FullInfo class</p>
 * Contains all information about gym
 * @author boris
 */
@Entity
public class FullInfo implements Serializable {
    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String workingHours;
    private String description;

    public FullInfo() {
    }

    public FullInfo(String address, String workingHours, String description) {

        this.address = address;
        this.workingHours = workingHours;
        this.description = description;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
