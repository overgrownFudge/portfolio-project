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
    @Embedded
    private Job job;

    public Experience() {
    }

    public Experience(Long id, String year, Job job) {
        this.id = id;
        this.year = year;
        this.job = job;
    }

    public Experience(String year, Job job) {
        this.year = year;
        this.job = job;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", job=" + job +
                '}';
    }
}