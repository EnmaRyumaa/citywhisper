package com.citywhisper.client.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatMessageDTO {

    private String role;
    private String content;

    public ChatMessageDTO(String role, String content) {
        this.role = role;
        this.content = content;
    }

}
