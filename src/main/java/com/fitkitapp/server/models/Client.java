package com.fitkitapp.server.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Client class</p>
 * @author boris
 */
@Entity
@Table(name = "Client")
public class Client extends Person implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Status status;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Workout> personalWorkout;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Workout> byCoachWorkout;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Workout> standardWorkout;


    public Client() {
    }

    public Client(Status status, Abonnement abonnement, Collection<Workout> personalWorkout, Collection<Workout> byCoachWorkout, Collection<Workout> standardWorkout) {
        this.status = status;
        this.abonnement = abonnement;
        this.personalWorkout = personalWorkout;
        this.byCoachWorkout = byCoachWorkout;
        this.standardWorkout = standardWorkout;
    }

    public Client(String firstName, String lastName, Gender gender, String login, String password, String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym, Status status, Abonnement abonnement, Collection<Workout> personalWorkout, Collection<Workout> byCoachWorkout, Collection<Workout> standardWorkout) {
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

    public Collection<Workout> getPersonalWorkout() {
        return personalWorkout;
    }

    public void setPersonalWorkout(Collection<Workout> personalWorkout) {
        this.personalWorkout = personalWorkout;
    }

    public Collection<Workout> getByCoachWorkout() {
        return byCoachWorkout;
    }

    public void setByCoachWorkout(Collection<Workout> byCoachWorkout) {
        this.byCoachWorkout = byCoachWorkout;
    }

    public Collection<Workout> getStandardWorkout() {
        return standardWorkout;
    }

    public void setStandardWorkout(Collection<Workout> standardWorkout) {
        this.standardWorkout = standardWorkout;
    }
}
