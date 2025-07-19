package com.citywhisper.client.chatgpt.builder;

import com.citywhisper.client.chatgpt.enums.RoleEnum;
import com.citywhisper.client.dto.ChatMessageDTO;
import com.citywhisper.config.EnvConfig;

import java.util.ArrayList;
import java.util.List;

public class ChatBuilder {

    private final String model = EnvConfig.getModel();
    private final String apiKey = EnvConfig.getApiKey();
    private final Double temperature = EnvConfig.getTemperature();

    private final List<ChatMessageDTO> message = new ArrayList<>();;

    public ChatBuilder () {}

    public ChatBuilder addMessage (String city) {
        message.add(new ChatMessageDTO(RoleEnum.SYSTEM.getValue(), EnvConfig.getPromptAgent()));
        message.add(new ChatMessageDTO(RoleEnum.USER.getValue(), city));
        return this;
    }

}
