package com.fitkitapp.server.models;

import com.fitkitapp.server.util.FitKitAppConstants;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on 10.07.2017.
 * <p>Post class</p>
 *
 * @author boris
 */
@Entity
@Table(name = "Post")
public class Post implements Serializable {
    private static final long serialVersionUID = 10L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "STATUS")
    private Boolean active;
    /**
     * true is advertisement
     * false is non advert
     */
    @Column(name = "TYPE")
    private Boolean targetStatus;

    private String targetIcon;

    @DateTimeFormat(pattern = FitKitAppConstants.DATE_FORMAT)
    @Column(name = "DATE_OF_CREATION")
    private Date dateOfCreation;

    @DateTimeFormat(pattern = FitKitAppConstants.DATE_FORMAT)
    @Column(name = "DATE_OF_PUBLICATION")
    private Date dateOfPublication;

    @ManyToOne
    private Gym gym;

    private String title;

    private String body;

    private String author;

    private String externalURL;

    private int likes;

    private String images;

    private String authorImg;


    public Post() {
    }

    public Post(Boolean active, Boolean targetStatus, String targetIcon, Date dateOfCreation,
                Date dateOfPublication, Gym gym,
                String title, String body, String author, String externalURL, int likes,
                String images, String authorImg) {
        this.active = active;
        this.targetStatus = targetStatus;
        this.targetIcon = targetIcon;
        this.dateOfCreation = dateOfCreation;
        this.dateOfPublication = dateOfPublication;
        this.gym = gym;
        this.title = title;
        this.body = body;
        this.author = author;
        this.externalURL = externalURL;
        this.likes = likes;
        this.images = images;
        this.authorImg = authorImg;
    }

    public String getAuthorImg() {
        return authorImg;
    }

    public void setAuthorImg(String authorImg) {
        this.authorImg = authorImg;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(Boolean targetStatus) {
        this.targetStatus = targetStatus;
    }

    public String getTargetIcon() {
        return targetIcon;
    }

    public void setTargetIcon(String targetIcon) {
        this.targetIcon = targetIcon;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
