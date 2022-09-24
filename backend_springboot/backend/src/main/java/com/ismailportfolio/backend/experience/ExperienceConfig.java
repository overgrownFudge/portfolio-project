package com.ismailportfolio.backend.experience;

import com.ismailportfolio.backend.skill.Skill;
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
             Experience twentyTwentyTwo = new Experience(
                    "2022",
                     new Job (
                             "Web Dev Internship",
                             "Malik Law Offices",
                             "Used HTML, CSS, JavaScript, Bootstrap, React to sustain various projects"
                     )
            );
             Experience twentyTwenty = new Experience(
                     "2020",
                     new Job (
                             "Scanner Inspector",
                             "Vote NYC",
                             "Troubleshooting ballot scanning machines and software"
                     )
             );
            Experience twentyEighteen = new Experience(
                    "2018",
                    new Job (
                            "Play/Laser Tag Attendant",
                            "Laser Bounce",
                            "Operating/supervising arcade machines and providing instructions before laser tag play"
                    )
            );
             repository.saveAll(
                    List.of(twentyTwentyTwo, twentyTwenty, twentyEighteen)
            );
        };
    }
}