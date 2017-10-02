package com.fitkitapp.server.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created on 12.07.2017.
 * <p>Role class</p>
 * @author boris
 */
@Entity
@Table(name = "Role")
public class Role implements Serializable {
    private static final long serialVersionUID = 11L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String code;

    public Role() {
    }

    public Role(String name, String code) {

        this.name = name;
        this.code = code;
    }

    public Role(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
