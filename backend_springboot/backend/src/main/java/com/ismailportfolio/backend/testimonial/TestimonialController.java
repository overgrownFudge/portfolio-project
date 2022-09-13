package com.ismailportfolio.backend.testimonial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/testimonial")
public class TestimonialController {

    private final TestimonialService testimonialService;

    @Autowired
    public TestimonialController(TestimonialService testimonialService) {
        this.testimonialService = testimonialService;
    }

    @GetMapping
    public List<Testimonial> getTestimonial() {
        return testimonialService.getTestimonial();
    }
}