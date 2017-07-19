package com.fitkitapp.server.models;

/**
 * Created by Boris on 14.07.2017.
 */

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created on 14.07.2017.
 * <p>SRWD class</p>
 * contains Sets,Reps,Weight,Duration of Workout
 * @author boris
 */
@Entity
@Table(name = "SRWD")
public class SRWD implements Serializable {
    private static final long serialVersionUID = 13L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int sets;

    private int reps;

    private String weight;

    private String duration;


    public SRWD() {
    }

    public SRWD(int sets, int reps, String weight, String duration) {

        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.duration = duration;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
