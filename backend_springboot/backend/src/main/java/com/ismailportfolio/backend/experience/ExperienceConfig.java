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
                    "2020",
                     new Job (
                             "figma",
                             "fa",
                             "asdnasndasd"
                     )
            );
            Experience twentyTwentyOne = new Experience(
                    "2021",
                    new Job (
                            "figma",
                            "fa",
                            "asdnasndasd"
                    )
            );

            repository.saveAll(
                    List.of(twentyTwenty, twentyTwentyOne)
            );
        };
    }
}