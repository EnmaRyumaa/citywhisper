package com.citywhisper.dto;

import com.citywhisper.entities.ExternalPath;

public class ExternalPathDTO {

    private Long id;
    private String path;

    public ExternalPathDTO() {}

    public ExternalPathDTO(ExternalPath entity) {
        this.id = entity.getId();
        this.path = entity.getPath();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
