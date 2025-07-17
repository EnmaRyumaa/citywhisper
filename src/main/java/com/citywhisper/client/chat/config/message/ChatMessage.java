package com.citywhisper.client.chat.config.message;

import com.citywhisper.client.chat.enums.RoleEnum;
import com.citywhisper.config.EnvConfig;
import lombok.Getter;

@Getter
public class ChatMessage {

    private String role;
    private String content;

    public ChatMessage() {}


    public ChatMessage(RoleEnum role, String content) {
        this.role = role.getValue();
        if (role.getValue().equals(RoleEnum.SYSTEM.getValue()) && content == null) {
            this.content = EnvConfig.getApiKey();
        } else if (role.getValue().equals(RoleEnum.USER.getValue())) {
            this.content = content;
        }
    }

}
