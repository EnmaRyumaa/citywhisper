package com.citywhisper.client.dto;

public class ResponseDTO {

    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;

    public ResponseDTO() {}

    public ResponseDTO(RequestDTO dto) {
        this.cep = dto.getCep();
        this.state = dto.getState();
        this.city = dto.getCity();
        this.neighborhood = dto.getNeighborhood();
        this.street = dto.getStreet();
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
}
