package com.citywhisper.client;

import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.client.dto.ChatGPTResponseDTO;
import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import com.citywhisper.config.EnvConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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

    public Mono<ResponseEntity<ResponseDTO>> get (RequestDTO dto) {
        return webClient.build()
                    .get()
                    .uri(dto.getFullPath())
                    .retrieve()
                    .bodyToMono(ResponseDTO.class)
                    .map(ResponseEntity::ok);
    }

    public Mono<ResponseEntity<ChatGPTResponseDTO>> post (ChatGPTRequestDTO dto) {
        return webClient.build()
                .post()
                .uri("https://api.openai.com/v1/chat/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + EnvConfig.getApiKey())
                .bodyValue(dto)
                .retrieve()
                .bodyToMono(ChatGPTResponseDTO.class)
                .map(ResponseEntity::ok);
    }
}
