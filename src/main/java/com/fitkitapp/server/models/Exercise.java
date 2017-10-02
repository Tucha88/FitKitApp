package com.fitkitapp.server.models;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fitkitapp.server.util.WorkoutConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created on 13.07.2017.
 * <p>Exercise class</p>
 * @author boris
 */
@Entity
@Table
public class Exercise implements Serializable, Comparable<Exercise> {
    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    private String name;
    private String description;
    private String category;
    private ArrayList<String> images = new ArrayList<>();
    @ManyToOne
    @JsonSerialize(converter = WorkoutConverter.class)
    private Workout owner;

    public Exercise() {
    }

    public Exercise(String name, String description, String category, ArrayList<String> images, Workout owner) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.images = images;
        this.owner = owner;
    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public Workout getOwner() {
        return owner;
    }

    public void setOwner(Workout owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Exercise){
           Exercise exercise = (Exercise) obj;
           if (exercise.getId() == getId()){
               return true;
           }
        }
        return false;
    }

    @Override
    public int compareTo(Exercise o) {
        if (this.name.equals(o.getName()) && this.category.equals(o.getCategory())) {
            return 1;
        }
        return 0;
    }
}
