package com.citywhisper.client.chatgpt.builder.messages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
public class ChatGPTMessage {

    private String role;
    private String content;

    public ChatGPTMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public String getContent() {
        return content;
    }
}
