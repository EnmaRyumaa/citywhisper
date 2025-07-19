package com.citywhisper.client.dto;

import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.chatgpt.builder.messages.ChatGPTMessage;
import com.citywhisper.config.EnvConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequestDTO {

    private String model;
    private Double temperature;

    private List<ChatGPTMessage> messages;

    public ChatGPTRequestDTO(ChatBuilder builder) {
        this.model = builder.getModel();
        this.temperature = builder.getTemperature();
        this.messages = builder.getMessage();
    }

    public String getModel() {
        return model;
    }

    public Double getTemperature() {
        return temperature;
    }

    public List<ChatGPTMessage> getMessages() {
        return messages;
    }
}
