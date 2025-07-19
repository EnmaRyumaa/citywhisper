package com.citywhisper.client.chatgpt.builder;

import com.citywhisper.client.chatgpt.builder.messages.ChatGPTMessage;
import com.citywhisper.client.chatgpt.enums.RoleEnum;
import com.citywhisper.config.EnvConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatBuilder {

    private final String model = EnvConfig.getModel();
    private final String apiKey = EnvConfig.getApiKey();
    private final Double temperature = EnvConfig.getTemperature();

    private final List<ChatGPTMessage> message = new ArrayList<>();;

    public ChatBuilder () {}

    public ChatBuilder addMessage (String city) {
        message.add(new ChatGPTMessage(RoleEnum.SYSTEM.getValue(), EnvConfig.getPromptAgent()));
        message.add(new ChatGPTMessage(RoleEnum.USER.getValue(), "Conte uma curiosidade sobre a cidade " + city));
        return this;
    }

    public String getModel() {
        return model;
    }

    public Double getTemperature() {
        return temperature;
    }

    public List<ChatGPTMessage> getMessage() {
        return message;
    }
}
