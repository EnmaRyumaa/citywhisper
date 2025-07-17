package com.citywhisper.client.dto;

import jakarta.persistence.Embedded;

public class RequestDTO {

    /*"cep": "89010025",
            "state": "SC",
            "city": "Blumenau",
            "neighborhood": "Centro",
            "street": "Rua Doutor Luiz de Freitas Melro",
            "service": "viacep",
            "location": {
        "type": "Point",
                "coordinates": {}
    }*/

    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String service;

    @Embedded
    private LocationDTO location;

    public RequestDTO () {}

    public RequestDTO(String cep, String state, String city, String neighborhood,
                      String street, String service, LocationDTO location) {
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.service = service;
        this.location = location;
    }

    public String getCep() {
        return cep;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public String getService() {
        return service;
    }

    public LocationDTO getLocation() {
        return location;
    }
}
