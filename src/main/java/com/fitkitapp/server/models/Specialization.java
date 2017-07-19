package com.fitkitapp.server.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created on 12.07.2017.
 * <p>Specialization class</p>
 * @author boris
 */
@Entity
@Table(name = "Specialization")
public class Specialization implements Serializable {
    private static final long serialVersionUID = 12L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Specialization() {
    }

    public Specialization(String name) {

        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
