package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {



    @OneToMany
            //(mappedBy="employer")
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();



    @NotNull
    @Size(max=20, message="Location cannot be longer than 20 characters")
    private String location;

    public Employer() {
    }
    public List<Job> getJobs() {
        return jobs;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
