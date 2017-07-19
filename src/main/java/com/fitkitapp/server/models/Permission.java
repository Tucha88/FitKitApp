package com.fitkitapp.server.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created on 10.07.2017.
 * <p>Permissions class</p>
 * @author boris
 */
@Entity
@Table(name = "Permissions")
public class Permission implements Serializable {
    private static final long serialVersionUID = 8L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean viewPost;
    private Boolean createPost;
    private Boolean removePost;
    private Boolean sendPostToClient;
    private Boolean CRUDClient;
    private Boolean CRUDAbonnements;
    private Boolean viewEmployees;
    private Boolean CRUDEmployees;
    private Boolean createRoleForEmployees;
    private Boolean createSpecializationForEmployees;
    private Boolean viewExercises;
    private Boolean CRUDExercises;
    private Boolean viewCategory;
    private Boolean CRUDCategory;
    private Boolean viewWorkouts;
    private Boolean CRUDWorkouts;
    private Boolean sendPersonalWorkoutToClients;
    private Boolean sendStandardWorkoutToClients;

    public Permission() {
    }

    public Permission(Boolean viewPost, Boolean createPost, Boolean removePost
            , Boolean sendPostToClient, Boolean CRUDClient, Boolean CRUDAbonnements,
                      Boolean viewEmployees, Boolean CRUDEmployees, Boolean createRoleForEmployees,
                      Boolean createSpecializationForEmployees, Boolean viewExercises, Boolean CRUDExercises,
                      Boolean viewCategory, Boolean CRUDCategory, Boolean viewWorkouts, Boolean CRUDWorkouts,
                      Boolean sendPersonalWorkoutToClients, Boolean sendStandardWorkoutToClients) {

        this.viewPost = viewPost;
        this.createPost = createPost;
        this.removePost = removePost;
        this.sendPostToClient = sendPostToClient;
        this.CRUDClient = CRUDClient;
        this.CRUDAbonnements = CRUDAbonnements;
        this.viewEmployees = viewEmployees;
        this.CRUDEmployees = CRUDEmployees;
        this.createRoleForEmployees = createRoleForEmployees;
        this.createSpecializationForEmployees = createSpecializationForEmployees;
        this.viewExercises = viewExercises;
        this.CRUDExercises = CRUDExercises;
        this.viewCategory = viewCategory;
        this.CRUDCategory = CRUDCategory;
        this.viewWorkouts = viewWorkouts;
        this.CRUDWorkouts = CRUDWorkouts;
        this.sendPersonalWorkoutToClients = sendPersonalWorkoutToClients;
        this.sendStandardWorkoutToClients = sendStandardWorkoutToClients;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getViewPost() {
        return viewPost;
    }

    public void setViewPost(Boolean viewPost) {
        this.viewPost = viewPost;
    }

    public Boolean getCreatePost() {
        return createPost;
    }

    public void setCreatePost(Boolean createPost) {
        this.createPost = createPost;
    }

    public Boolean getRemovePost() {
        return removePost;
    }

    public void setRemovePost(Boolean removePost) {
        this.removePost = removePost;
    }

    public Boolean getSendPostToClient() {
        return sendPostToClient;
    }

    public void setSendPostToClient(Boolean sendPostToClient) {
        this.sendPostToClient = sendPostToClient;
    }

    public Boolean getCRUDClient() {
        return CRUDClient;
    }

    public void setCRUDClient(Boolean CRUDClient) {
        this.CRUDClient = CRUDClient;
    }

    public Boolean getCRUDAbonnements() {
        return CRUDAbonnements;
    }

    public void setCRUDAbonnements(Boolean CRUDAbonnements) {
        this.CRUDAbonnements = CRUDAbonnements;
    }

    public Boolean getViewEmployees() {
        return viewEmployees;
    }

    public void setViewEmployees(Boolean viewEmployees) {
        this.viewEmployees = viewEmployees;
    }

    public Boolean getCRUDEmployees() {
        return CRUDEmployees;
    }

    public void setCRUDEmployees(Boolean CRUDEmployees) {
        this.CRUDEmployees = CRUDEmployees;
    }

    public Boolean getCreateRoleForEmployees() {
        return createRoleForEmployees;
    }

    public void setCreateRoleForEmployees(Boolean createRoleForEmployees) {
        this.createRoleForEmployees = createRoleForEmployees;
    }

    public Boolean getCreateSpecializationForEmployees() {
        return createSpecializationForEmployees;
    }

    public void setCreateSpecializationForEmployees(Boolean createSpecializationForEmployees) {
        this.createSpecializationForEmployees = createSpecializationForEmployees;
    }

    public Boolean getViewExercises() {
        return viewExercises;
    }

    public void setViewExercises(Boolean viewExercises) {
        this.viewExercises = viewExercises;
    }

    public Boolean getCRUDExercises() {
        return CRUDExercises;
    }

    public void setCRUDExercises(Boolean CRUDExercises) {
        this.CRUDExercises = CRUDExercises;
    }

    public Boolean getViewCategory() {
        return viewCategory;
    }

    public void setViewCategory(Boolean viewCategory) {
        this.viewCategory = viewCategory;
    }

    public Boolean getCRUDCategory() {
        return CRUDCategory;
    }

    public void setCRUDCategory(Boolean CRUDCategory) {
        this.CRUDCategory = CRUDCategory;
    }

    public Boolean getViewWorkouts() {
        return viewWorkouts;
    }

    public void setViewWorkouts(Boolean viewWorkouts) {
        this.viewWorkouts = viewWorkouts;
    }

    public Boolean getCRUDWorkouts() {
        return CRUDWorkouts;
    }

    public void setCRUDWorkouts(Boolean CRUDWorkouts) {
        this.CRUDWorkouts = CRUDWorkouts;
    }

    public Boolean getSendPersonalWorkoutToClients() {
        return sendPersonalWorkoutToClients;
    }

    public void setSendPersonalWorkoutToClients(Boolean sendPersonalWorkoutToClients) {
        this.sendPersonalWorkoutToClients = sendPersonalWorkoutToClients;
    }

    public Boolean getSendStandardWorkoutToClients() {
        return sendStandardWorkoutToClients;
    }

    public void setSendStandardWorkoutToClients(Boolean sendStandardWorkoutToClients) {
        this.sendStandardWorkoutToClients = sendStandardWorkoutToClients;
    }
}
