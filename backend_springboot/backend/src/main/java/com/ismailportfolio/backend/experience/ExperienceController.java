package com.ismailportfolio.backend.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/experience")
public class ExperienceController {

    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public List<Experience> getExperience() {
        return experienceService.getExperience();
    }
}