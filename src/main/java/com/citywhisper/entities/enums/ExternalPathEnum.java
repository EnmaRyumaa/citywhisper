package com.citywhisper.entities.enums;

public enum ExternalPathEnum {

    BRASILAPI("BrasilAPI"),
    CHATGPT("ChatGPT");

    private final String value;

    ExternalPathEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
