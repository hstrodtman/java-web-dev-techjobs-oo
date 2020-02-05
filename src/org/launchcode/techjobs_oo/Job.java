package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency ) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public static String toString(Job job){

        ArrayList<String> jobFields = new ArrayList<>();
        jobFields.add(job.getName());
        jobFields.add(job.getEmployer().toString());
        jobFields.add(job.getLocation().toString());
        jobFields.add(job.getPositionType().toString());
        jobFields.add(job.getCoreCompetency().toString());

//        {jobName, jobEmployer, jobLocation, jobPositionType, jobCoreCompetency};

        for(int i = 0; i < jobFields.size(); i++){
            if (jobFields.get(i) == ""){
             jobFields.set(i, "Data Not Available");
            }
        }

        if (jobFields.get(0) == "Data Not Available" &&  jobFields.get(1) == "Data Not Available" && jobFields.get(2) == "Data Not Available" && jobFields.get(3) == "Data Not Available"
        && jobFields.get(4) == "Data Not Available") {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\n" + "ID: " + job.getId() +"\n" + "Name: " + jobFields.get(0) + "\n" + "Employer: " + jobFields.get(1) + "\n" + "Location: " +
                    jobFields.get(2) + "\n"+ "Position Type: " + jobFields.get(3) + "\n" + "Core Competency: " + jobFields.get(4) + "\n";
        }
    }
}
