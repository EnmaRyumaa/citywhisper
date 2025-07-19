package com.citywhisper.client.dto;

public class RequestDTO {

    private String cep;
    private String endpoint;
    private String headers;

    public RequestDTO () {}

    public RequestDTO(String cep, String endpoint) {
        this.cep = cep;
        this.endpoint = endpoint;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getFullPath() {
        return endpoint + "/" + cep;
    }

}
