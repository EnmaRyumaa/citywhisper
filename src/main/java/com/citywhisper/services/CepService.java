package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.client.dto.RequestDTO;
import com.citywhisper.client.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    public ResponseEntity<ResponseDTO> getCep(String cep) {
        //TODO Adicionar endpoint no properties ou banco
        String endpoint = "https://brasilapi.com.br/api/cep/v2/";
        RequestDTO requestDTO = new RequestDTO(cep, endpoint);

        ResponseDTO cepBody = client.get(requestDTO).block().getBody();

        ChatBuilder builder = new ChatBuilder();
        builder.addMessage(cepBody.getCity());

        ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

        String respostaGPT = client.post(request)
                .block()
                .getBody()
                .getChoices()
                .get(0)
                .getMessage()
                .getContent();

        cepBody.addResponseGPT(respostaGPT);

        return ResponseEntity.ok(cepBody);
    }
}
