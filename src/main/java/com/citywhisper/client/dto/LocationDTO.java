package com.citywhisper.client.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public class LocationDTO {

    private String type;
    private String cordinates;

    public LocationDTO() {}

    public LocationDTO(String type, String cordinates) {
        this.type = type;
        this.cordinates = cordinates;
    }

    public String getType() {
        return type;
    }

    public String getCordinates() {
        return cordinates;
    }
}
