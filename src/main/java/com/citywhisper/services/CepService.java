package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    public ResponseEntity<ResponseDTO> getCep(String cep) {
        //TODO Adicionar endpoint no properties ou banco
        String endpoint = "https://brasilapi.com.br/api/cep/v2/";
        RequestDTO requestDTO = new RequestDTO(cep, endpoint);
        Mono<ResponseEntity<ResponseDTO>> responseCep = client.get(requestDTO);

        //Mono<ResponseEntity<ResponseDTO>> responseChat = client.post(requestDTO);

        //System.out.println(responseChat.block().getBody().getCity());
        /*String city = response.block().getBody().getCity();
        String teste = response.block().getBody().getStreet();
        System.out.println(city);
        System.out.println(teste);*/


        return responseCep.block();

    }
}
