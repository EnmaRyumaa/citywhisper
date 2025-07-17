package com.citywhisper.client;

import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RequestClient {

    @Autowired
    private WebClient.Builder webClient;

    public Mono<ResponseDTO> makeRequest (String cep) {
        return webClient.build()
                .get()
                .uri("https://brasilapi.com.br/api/cep/v2/" + cep)
                .retrieve()
                .bodyToMono(RequestDTO.class)
                .map(x -> new ResponseDTO(x));
    }
}
