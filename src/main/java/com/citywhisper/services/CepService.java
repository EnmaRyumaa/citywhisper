package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.dto.RequestDTO;
import com.citywhisper.dto.ResponseDTO;
import com.citywhisper.entities.enums.ExternalPathEnum;
import com.citywhisper.services.exceptions.ArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private RequestClient client;

    @Autowired
    private ExternalPathService pathService;

    public ResponseDTO getCep(String cep) {
        //TODO Implementar I18n e Logger
        //TODO encadear chamadas com flatMap garantindo a reatividade do processo. DONE
        //TODO remover o .block das requisições HTTP garantindo que em toda camada seja retornando um Objeto do tipo Mono<>.
        //TODO adicionar estrutura dinamica para garantir o acesso ao banco uma única vez ao vez de buscar o ID x vezes.

        if (!cep.matches("\\d{8}"))
            throw new ArgumentException("CEP is formed using just numbers and just 8 digits");

        RequestDTO requestDTO = new RequestDTO(cep, pathService.recoverPath(ExternalPathEnum.BRASILAPI));

        ResponseDTO cepBody = client.get(requestDTO)
                .flatMap(body -> {
                    ChatBuilder builder = new ChatBuilder();
                    builder.addMessage(body.getCity());

                    ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

                    return client.post(request).map(gptResponse -> {
                        body.addResponseGPT(gptResponse.getResponseGPT());
                        return body;
                    });
                })
                .block();

        /*ChatBuilder builder = new ChatBuilder();
        builder.addMessage(cepBody.getCity());

        ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

        String respostaGPT = client.post(request)
                .block()
                .getResponseGPT();

        cepBody.addResponseGPT(respostaGPT);*/

        return cepBody;
    }
}
