package com.citywhisper.client.dto;

public class RequestDTO {

    private String cep;

    public RequestDTO () {}

    public RequestDTO(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
