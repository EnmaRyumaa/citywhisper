package com.citywhisper.client.chat.config;

import com.citywhisper.client.chat.config.message.ChatMessage;
import com.citywhisper.config.EnvConfig;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Configuration
public class ChatConfig {

    private final String model = EnvConfig.getModel();
    private final Double temperature = EnvConfig.getTemperature();
    private List<ChatMessage> message;

    public ChatConfig() {}

    public ChatConfig(List<ChatMessage> message) {
        this.message = message;
    }

}
