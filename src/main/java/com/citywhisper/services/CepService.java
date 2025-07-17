package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    public Mono<ResponseDTO> getCep(String cep) {
        Mono<ResponseDTO> response = client.makeRequest(cep);

        return response;

    }
}
