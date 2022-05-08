package com.example.SMARTIQ.Repository;

import com.example.SMARTIQ.Model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Developer findByUsername(String username);
}
