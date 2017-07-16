package com.fitkitapp.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Client class</p>
 * @author boris
 */
@Entity
@Table(name = "Client")
public class Client extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "STATUS_ID")
    private Status status;
    @JoinColumn(name = "ABONEMENT_ID")
    private Abonnement abonnement;
//    @OneToMany
    @JoinColumn(name = "PERSONAL_WORKOUT")
    private ArrayList<Workout> personalWorkout;
//    @OneToMany
    @JoinColumn(name = "BY_COACH_WORKOUT")
    private ArrayList<Workout> byCoachWorkout;
//    @OneToMany
    @JoinColumn(name = "STANDARD_WORKOUT")
    private ArrayList<Workout> standardWorkout;

    public Client() {
    }


    public Client(String firstName, String lastName, Gender gender, String login, String password,
                  String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym,
                  Status status, Abonnement abonnement, ArrayList<Workout> personalWorkout,
                  ArrayList<Workout> byCoachWorkout, ArrayList<Workout> standardWorkout) {
        super(firstName, lastName, gender, login, password, email, phoneNumber, dateOfBirth, avatar, gym);
        this.status = status;
        this.abonnement = abonnement;
        this.personalWorkout = personalWorkout;
        this.byCoachWorkout = byCoachWorkout;
        this.standardWorkout = standardWorkout;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public ArrayList<Workout> getPersonalWorkout() {
        return personalWorkout;
    }

    public void setPersonalWorkout(ArrayList<Workout> personalWorkout) {
        this.personalWorkout = personalWorkout;
    }

    public ArrayList<Workout> getByCoachWorkout() {
        return byCoachWorkout;
    }

    public void setByCoachWorkout(ArrayList<Workout> byCoachWorkout) {
        this.byCoachWorkout = byCoachWorkout;
    }

    public ArrayList<Workout> getStandardWorkout() {
        return standardWorkout;
    }

    public void setStandardWorkout(ArrayList<Workout> standardWorkout) {
        this.standardWorkout = standardWorkout;
    }
}
