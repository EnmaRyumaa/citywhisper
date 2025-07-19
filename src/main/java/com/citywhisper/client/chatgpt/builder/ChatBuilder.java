package com.citywhisper.client.chatgpt.builder;

import com.citywhisper.client.chatgpt.enums.RoleEnum;
import com.citywhisper.client.dto.ChatMessageDTO;
import com.citywhisper.client.dto.ChatRequestDTO;
import com.citywhisper.config.EnvConfig;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatBuilder {

    private final String model = EnvConfig.getModel();
    private final String apiKey = EnvConfig.getApiKey();
    private final Double temperature = EnvConfig.getTemperature();

    private final List<ChatMessageDTO> message = new ArrayList<>();;

    public ChatBuilder () {}

    public ChatBuilder addMessage (String city) {
        message.add(new ChatMessageDTO(RoleEnum.SYSTEM.getValue(), EnvConfig.getPromptAgent()));
        message.add(new ChatMessageDTO(RoleEnum.USER.getValue(), "Conte uma curiosidade sobre a cidade " + city));
        return this;
    }

    public ChatRequestDTO build() {
        return new ChatRequestDTO(model, message, temperature);
    }

}
