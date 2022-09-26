package com.ismailportfolio.backend.skill;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SkillConfig {

    @Bean
    CommandLineRunner skillCommandLineRunner(
            SkillRepository repository){
        return args -> {
            Skill springBoot = new Skill(
                    "Spring Boot",
                    "#edf2f8",
                    "https://github.com/overgrownFudge/portfolio-project/blob/main/frontend_react/src/assets/springboot.png"
            );
            Skill reactJS = new Skill(
                    "ReactJS",
                    "#edf2f8",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/react.png"
            );
            Skill javaScript = new Skill(
                    "JavaScript",
                    "#edf2f8",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/javascript.png"
            );
            repository.saveAll(
                    List.of(springBoot, reactJS, javaScript)
            );
        };
    }
}