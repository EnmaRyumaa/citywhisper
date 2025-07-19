package com.citywhisper.client.dto;

public class ResponseDTO {

    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;

    private String responseGPT;

    public ResponseDTO() {}

    public ResponseDTO(RequestDTO dto) {
        this.cep = dto.getCep();
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

    public String getResponseGPT() {
        return responseGPT;
    }

    public void addResponseGPT(String responseGPT) {
        this.responseGPT = responseGPT;
    }

}
