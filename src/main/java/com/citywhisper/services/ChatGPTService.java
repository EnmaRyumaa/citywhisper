package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.client.dto.ChatGPTResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChatGPTService {

    @Autowired
    private RequestClient client;

    public ResponseEntity<ChatGPTResponseDTO> getResponse (String city) {

        city = "Contagem";

        ChatBuilder builder = new ChatBuilder();
        builder.addMessage(city);

        ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

        /*client.post(request);*/

        return null;
    }

}
