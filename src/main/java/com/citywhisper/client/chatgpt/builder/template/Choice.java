package com.citywhisper.client.chatgpt.builder.template;

public class Choice {

    private Message message;

    public Choice() {}

    public Message getMessage() {
        return message;
    }

    public String getContentOfMessage () {
        return message.getContent();
    }

}
