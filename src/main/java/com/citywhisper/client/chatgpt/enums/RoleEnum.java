package com.citywhisper.client.chatgpt.enums;

public enum RoleEnum {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant");

    private final String value;

    RoleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
