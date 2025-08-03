package com.citywhisper.repositories;

import com.citywhisper.entities.ExternalPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ExternalPathRepository extends JpaRepository <ExternalPath, Long> {
    Optional<ExternalPath> findPathByDescription(@Param("description") String description);
}