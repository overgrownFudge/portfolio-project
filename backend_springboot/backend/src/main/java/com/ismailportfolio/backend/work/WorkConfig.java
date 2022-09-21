package com.ismailportfolio.backend.work;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WorkConfig {

    @Bean
    CommandLineRunner workCommandLineRunner(
            WorkRepository repository){
        return args -> {
            Work Infinix_INBOOK = new Work(
                    "Infinix INBOOK",
                    "Infinix Inbook X1 Ci3 10th 8GB...",
                    "https://github.com/adrianhajdin/project_professional_portfolio/blob/master/src/container/Work/Work.jsx",
                    "UI/UX",
                    "https://dummyjson.com/image/i/products/9/thumbnail.jpg"
                    );
            repository.saveAll(
                    List.of(Infinix_INBOOK)
            );
        };
    }
}
