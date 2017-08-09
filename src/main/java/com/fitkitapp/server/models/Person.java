package com.fitkitapp.server.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fitkitapp.server.util.FitKitAppConstants;
import com.fitkitapp.server.util.GymConverter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@MappedSuperclass
/**
 * Created on 12.07.2017.
 * <p>Person class</p>
 * @author boris
 */
public abstract class Person implements Serializable {
    private static final long serialVersionUID = 9L;


    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "DATE_OF_BIRTH")
    @DateTimeFormat(pattern = FitKitAppConstants.DATE_FORMAT)
    private Date dateOfBirth;

    @Column(name = "AVATAR")
    private String avatar;
    @ManyToOne
    @JsonSerialize(converter = GymConverter.class)
    private Gym gym;

    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, String login, String password,
                  String email, String phoneNumber, Date dateOfBirth, String avatar, Gym gym) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
        this.gym = gym;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfbirth() {
        return dateOfBirth;
    }

    public void setDateOfbirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
