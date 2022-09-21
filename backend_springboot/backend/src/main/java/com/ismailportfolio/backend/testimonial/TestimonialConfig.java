package com.ismailportfolio.backend.testimonial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TestimonialConfig {

    @Bean
    CommandLineRunner testCommandLineRunner(
            TestimonialRepository repository){
        return args -> {
            Testimonial facebook = new Testimonial(
                    "Sarah",
                    "Facebook",
                    "Infinix Inbook X1 Ci3 10th 8GB...",
                    "https://dummyjson.com/image/i/products/9/thumbnail.jpg"
            );
            Testimonial google = new Testimonial(
                    "Jason",
                    "Google",
                    "Style and speed. Stand out on ...",
                    "https://dummyjson.com/image/i/products/8/thumbnail.jpg"
            );
            repository.saveAll(
                    List.of(facebook, google)
            );
        };
    }
}