package com.fitkitapp.server.models;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 12.07.2017.
 * <p>Workout class</p>
 *
 * @author boris
 */
@Entity
@Table(name = "Workout")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String icon;
    private String name;
    private String description;
    private String note;
    private String author;
    @Column(name = "WORKOUT_TYPE")
    private WorkoutType workoutType;
//    @OneToMany(mappedBy = "owner")
//    @MapKeyJoinColumn(name = "EXERCISE_ID")
//    private Map<Exercise, SRWD> exerciseMap = new HashMap<>();

    public Workout() {
    }

    public Workout(String icon, String name, String description, String note, String author,
                   WorkoutType workoutType/*, Map<Exercise, SRWD> exerciseMap*/) {

        this.icon = icon;
        this.name = name;
        this.description = description;
        this.note = note;
        this.author = author;
        this.workoutType = workoutType;
//        this.exerciseMap = exerciseMap;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

//    public Map<Exercise, SRWD> getExerciseMap() {
//        return exerciseMap;
//    }
//
//    public void setExerciseMap(Map<Exercise, SRWD> exerciseMap) {
//        this.exerciseMap = exerciseMap;
//    }
}
