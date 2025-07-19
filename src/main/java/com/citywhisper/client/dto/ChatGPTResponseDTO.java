package com.citywhisper.client.dto;

import com.citywhisper.client.chatgpt.builder.template.Choice;

import java.util.List;

public class ChatGPTResponseDTO {

    private List<Choice> choices;

    public List<Choice> getChoices() {
        return choices;
    }
}
