package com.citywhisper.config;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {

    private static final Dotenv dotenv = Dotenv.configure()
            .filename(".env") // opcional se estiver na raiz
            .load();

    public static String getApiKey() {
        return dotenv.get("OPENAI_API_KEY");
    }

    public static String getPromptAgente() {
        return dotenv.get("PROMPT_AGENT");
    }

    public static double getTemperature() {
        return Double.parseDouble(dotenv.get("TEMPERATURE"));
    }
}
