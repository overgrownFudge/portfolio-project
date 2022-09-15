package com.ismailportfolio.backend.experience;

import javax.persistence.*;

@Entity
@Table
public class Experience {
    @Id
    @SequenceGenerator(
            name = "experience_sequence",
            sequenceName = "experience_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "experience_sequence"
    )
    private Long id;
    private String year;
    private String works;

    public Experience() {
    }

    public Experience(Long id, String year, String works) {
        this.id = id;
        this.year = year;
        this.works = works;
    }

    public Experience(String year, String works) {
        this.year = year;
        this.works = works;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", works='" + works + '\'' +
                '}';
    }
}