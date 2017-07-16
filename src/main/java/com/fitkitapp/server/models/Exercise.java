package com.fitkitapp.server.models;


import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created on 13.07.2017.
 * <p>Exercise class</p>
 * @author boris
 */
@Entity
@Table(name = "Exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String category;
    private ArrayList<String> images;

    public Exercise() {
    }

    public Exercise(String name, String description, String category, ArrayList<String> images) {

        this.name = name;
        this.description = description;
        this.category = category;
        this.images = images;
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

    @Override
    public int hashCode() {
        return id.hashCode();
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
}
