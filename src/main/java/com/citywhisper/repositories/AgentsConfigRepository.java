package com.citywhisper.repositories;

import com.citywhisper.entities.AgentsConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AgentsConfigRepository extends JpaRepository<AgentsConfig, Long> {
    Optional<AgentsConfig> findPathByDescription(@Param("description") String description);
}
