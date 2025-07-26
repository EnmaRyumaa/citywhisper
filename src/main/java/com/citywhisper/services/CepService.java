package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.dto.RequestDTO;
import com.citywhisper.dto.ResponseDTO;
import com.citywhisper.services.exceptions.ArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    public ResponseDTO getCep(String cep) {
        //TODO Adicionar endpoint no properties ou banco
        String endpoint = "https://brasilapi.com.br/api/cep/v2/";

        if (cep.length() != 8) throw new ArgumentException("CEP need 8 digits for valid");

        if (!cep.matches("\\d")) throw new ArgumentException("CEP is formed using just numbers");

        RequestDTO requestDTO = new RequestDTO(cep, endpoint);

        ResponseDTO cepBody = client.get(requestDTO).block();

        ChatBuilder builder = new ChatBuilder();
        builder.addMessage(cepBody.getCity());

        ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

        String respostaGPT = client.post(request)
                .block()
                .getResponseGPT();

        cepBody.addResponseGPT(respostaGPT);

        return cepBody;
    }
}
