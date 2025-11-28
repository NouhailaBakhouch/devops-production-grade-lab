package com.devops.lab.spring_nexus_demo.model;

public class Profile {

    private String name;
    private String title;
    private String bio;
    private String location;
    private String email;

    public Profile(String name, String title, String bio, String location, String email) {
        this.name = name;
        this.title = title;
        this.bio = bio;
        this.location = location;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getBio() {
        return bio;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }
}
