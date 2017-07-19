package com.fitkitapp.server.models;

import com.fitkitapp.server.util.FitKitAppConstants;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Abonnement class</p>
 * Class for gym
 * @author boris
 */
@Entity
@Table(name = "Abonnement")
public class Abonnement implements Serializable {
    private static final long serialVersionUID = 1L;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @DateTimeFormat(pattern = FitKitAppConstants.DATE_FORMAT)
    private Date dateOfRegistration;

    @DateTimeFormat(pattern = FitKitAppConstants.DATE_FORMAT)
    private Date dateOfExpiration;

    private Boolean Active;

    public Abonnement() {
    }

    public Abonnement(Date dateOfRegistration, Date dateOfExpiration, Boolean active) {

        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
        Active = active;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean active) {
        Active = active;
    }
}
