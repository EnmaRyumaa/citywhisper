package com.citywhisper.services;

import com.citywhisper.dto.ExternalPathDTO;
import com.citywhisper.entities.ExternalPath;
import com.citywhisper.entities.enums.ExternalPathEnum;
import com.citywhisper.repositories.ExternalPathRepository;
import com.citywhisper.services.exceptions.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalPathService {

    @Autowired
    private ExternalPathRepository repository;

    public ExternalPathService() {}

    public String recoverPath (ExternalPathEnum descriptionEnum) {
        ExternalPath entity = repository.findPathByDescription(descriptionEnum.getValue())
                .orElseThrow(() -> new DatabaseException("Don't find path in DB"));
        ExternalPathDTO dto = new ExternalPathDTO(entity);
        return dto.getPath();
    }
}
