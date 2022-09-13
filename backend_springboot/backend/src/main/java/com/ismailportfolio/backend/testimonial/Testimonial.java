package com.ismailportfolio.backend.testimonial;

import javax.persistence.*;

@Entity
@Table
public class Testimonial {
    @Id
    @SequenceGenerator(
            name = "testimonial_sequence",
            sequenceName = "testimonial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "testimonial_sequence"
    )
    private Long id;
    private String name;
    private String company;
    private String feedback;
    private String image;

    public Testimonial() {
    }

    public Testimonial(Long id, String name, String company, String feedback, String image) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.feedback = feedback;
        this.image = image;
    }

    public Testimonial(String name, String company, String feedback, String image) {
        this.name = name;
        this.company = company;
        this.feedback = feedback;
        this.image = image;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Testimonial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", feedback='" + feedback + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}