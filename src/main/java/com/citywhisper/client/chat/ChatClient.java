package com.citywhisper.client.chat;

import com.citywhisper.client.chat.config.ChatConfig;
import com.citywhisper.client.chat.config.message.ChatMessage;
import com.citywhisper.client.chat.enums.RoleEnum;

import java.util.List;

public class ChatClient {

    private final String city;

    public ChatClient(String city) {
        this.city = city;
    }

    public ChatConfig completeChatConfig (ChatConfig chatConfig) {
        StringBuilder str = new StringBuilder();
        str.append("Diga alguma curiosidade sobre a cidade ")
                .append(city);

        List<ChatMessage> messages = List.of(
          new ChatMessage(RoleEnum.SYSTEM, null),
          new ChatMessage(RoleEnum.USER, str.toString())
        );

        return new ChatConfig(messages);

    }

}
