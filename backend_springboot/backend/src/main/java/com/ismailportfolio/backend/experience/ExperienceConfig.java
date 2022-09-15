package com.ismailportfolio.backend.experience;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExperienceConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ExperienceRepository repository){
        return args -> {
            Experience twentyTwenty = new Experience(
                    "2020",
                    "#edf2f8"
            );
            Experience twentyTwentyOne = new Experience(
                    "2021",
                    "#edf2f8"
            );

            repository.saveAll(
                    List.of(twentyTwenty, twentyTwentyOne)
            );
        };
    }
}