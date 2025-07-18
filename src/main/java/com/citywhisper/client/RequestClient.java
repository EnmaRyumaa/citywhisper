package com.citywhisper.client;

import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RequestClient {

    @Autowired
    private WebClient.Builder webClient;

    //TODO separação de get/post/put/delete adicionando endpoint como tributo durante instancia de Request.
    //TODO Utilizar o RequestDTO para chamada de RequestClient -> Dessa forma o DTO não fica inútil.

    public ResponseEntity<Mono<ResponseDTO>> get (RequestDTO dto) {
        return ResponseEntity.ok(webClient.build()
                    .get()
                    .uri("https://brasilapi.com.br/api/cep/v2/" + dto.getCep())
                    .retrieve()
                    .bodyToMono(RequestDTO.class)
                    .map(x -> new ResponseDTO(x)));
    }

    /*public ResponseEntity<Mono<ResponseDTO>> post (String cep, RequestDTO requestDTO) {

    }*/
}
