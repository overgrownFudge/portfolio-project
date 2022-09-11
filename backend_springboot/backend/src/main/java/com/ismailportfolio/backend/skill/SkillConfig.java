package com.ismailportfolio.backend.skill;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SkillConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            SkillRepository repository){
        return args -> {
            Skill figma = new Skill(
                    "figma",
                    "#edf2f8",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
            );
            Skill ReactJS = new Skill(
                    "ReactJS",
                    "#edf2f8",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/react.png"
            );
            Skill JavaScript = new Skill(
                    "JavaScript",
                    "#edf2f8",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/javascript.png"
            );
            repository.saveAll(
                    List.of(figma, ReactJS, JavaScript)
            );
        };
    }
}
