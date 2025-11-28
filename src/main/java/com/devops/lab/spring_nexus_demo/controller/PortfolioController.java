package com.devops.lab.spring_nexus_demo.controller;

import com.devops.lab.spring_nexus_demo.model.Profile;
import com.devops.lab.spring_nexus_demo.model.Project;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // pour Angular plus tard
public class PortfolioController {

    @GetMapping("/profile")
    public Profile getProfile() {
        return new Profile(
                "Nouhaila",                                  // ton nom
                "Software / QA Engineer",                    // ton titre
                "Je construis des applis web et je révise Spring & Angular.",
                "Casablanca, Maroc",
                "ton.email@example.com"                      // adapte
        );
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return Arrays.asList(
                new Project(
                        1L,
                        "Portfolio Spring & Angular",
                        "Application full-stack pour présenter mes projets.",
                        "Spring Boot, Angular, REST API",
                        null,
                        null
                ),
                new Project(
                        2L,
                        "Application Coupe du Monde",
                        "Projet académique pour suivre les matchs et statistiques.",
                        "Java, Spring, Web",
                        null,
                        null
                )
        );
    }
}
