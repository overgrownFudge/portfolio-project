package com.ismailportfolio.backend.experience;

import javax.persistence.Embeddable;

@Embeddable
public class Job {

    private String name;
    private String company;
    private String description;

    public Job() {}

    public Job(String name, String company, String description) {
        this.name = name;
        this.company = company;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


