package com.ismailportfolio.backend.experience;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository
        extends JpaRepository<Experience, Long> {
}