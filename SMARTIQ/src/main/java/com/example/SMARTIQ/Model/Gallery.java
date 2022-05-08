package com.example.SMARTIQ.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long galleryId;
    private String galleryName;
    private String location;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gallery", fetch = FetchType.LAZY)
    private List<Car> car;

    public Gallery(Long galleryId, String galleryName, String location) {
        this.galleryId = galleryId;
        this.galleryName = galleryName;
        this.location = location;
    }

    public Gallery() {

    }

    @JsonManagedReference

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public Long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Long galleryId) {
        this.galleryId = galleryId;
    }

    public String getGalleryName() {
        return galleryName;
    }

    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", galleryName='" + galleryName + '\'' +
                ", location='" + location + '\'' +
                ", car=" + car +
                '}';
    }
}
