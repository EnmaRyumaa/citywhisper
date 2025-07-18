package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    public ResponseEntity<ResponseDTO> getCep(String cep) {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setCep(cep);
        Mono<ResponseEntity<ResponseDTO>> response = client.get(requestDTO);
        String city = response.block().getBody().getCity();
        String teste = response.block().getBody().getStreet();
        System.out.println(city);
        System.out.println(teste);


        return response.block();

    }
}
