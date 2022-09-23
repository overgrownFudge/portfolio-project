package com.ismailportfolio.backend.experience;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExperienceConfig {

    @Bean
    CommandLineRunner expCommandLineRunnerExp(
            ExperienceRepository repository){
         return args -> {
             Experience twentyTwenty = new Experience(
                    "2022",
                     new Job (
                             "Web Dev Internship",
                             "Malik Law Offices",
                             "Used HTML, CSS, JavaScript, Bootstrap, React to sustain various projects"
                     )
            );
            Experience twentyTwentyOne = new Experience(
                    "2022",
                    new Job (
                            "Scanner Inspector",
                            "Vote NYC",
                            "Operating ballot scanning tools"
                    )
            );

            repository.saveAll(
                    List.of(twentyTwenty, twentyTwentyOne)
            );
        };
    }
}