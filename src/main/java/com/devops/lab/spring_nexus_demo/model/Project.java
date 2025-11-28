package com.devops.lab.spring_nexus_demo.model;

public class Project {

    private Long id;
    private String name;
    private String description;
    private String techStack;
    private String githubUrl;
    private String demoUrl;

    public Project(Long id, String name, String description, String techStack, String githubUrl, String demoUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.techStack = techStack;
        this.githubUrl = githubUrl;
        this.demoUrl = demoUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getDemoUrl() {
        return demoUrl;
    }
}
