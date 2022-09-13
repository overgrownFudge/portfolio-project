package com.ismailportfolio.backend.brand;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BrandConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            BrandRepository repository){
        return args -> {
            Brand Amazon = new Brand(
                    "Amazon",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
            );
            Brand Youtube = new Brand(
                    "Youtube",
                    "https://raw.githubusercontent.com/overgrownFudge/portfolio-project/main/frontend_react/src/assets/figma.png"
            );

            repository.saveAll(
                    List.of(Amazon, Youtube)
            );
        };
    }
}
