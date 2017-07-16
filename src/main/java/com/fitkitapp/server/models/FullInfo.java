package com.fitkitapp.server.models;

import javax.persistence.*;

/**
 * Created on 10.07.2017.
 * <p>FullInfo class</p>
 * Contains all information about gym
 * @author boris
 */
@Entity
@Table(name = "FullInfo")
public class FullInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fullInfoId;
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

    public Long getFullInfoId() {

        return fullInfoId;
    }

    public void setFullInfoId(Long fullInfoId) {
        this.fullInfoId = fullInfoId;
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
