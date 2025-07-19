package com.citywhisper.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChatRequestDTO {

    private String model;
    private List<ChatMessageDTO> messages;
    private Double temperature;

    public ChatRequestDTO(String model, List<ChatMessageDTO> messages, Double temperature) {
        this.model = model;
        this.messages = messages;
        this.temperature = temperature;
    }

}
