package com.ismailportfolio.backend.testimonial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {

    private final TestimonialRepository testimonialRepository;

    @Autowired
    public TestimonialService(TestimonialRepository testimonialRepository) {
        this.testimonialRepository = testimonialRepository;
    }

    public List<Testimonial> getTestimonial() {
        return testimonialRepository.findAll();
    }
}