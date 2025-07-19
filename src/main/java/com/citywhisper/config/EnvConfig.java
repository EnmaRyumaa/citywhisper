package com.citywhisper.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    private static final Dotenv dotenv = Dotenv.configure()
            .filename(".env") // opcional se estiver na raiz
            .load();

    @Bean
    public static String getApiKey() {
        return dotenv.get("OPEN_API_KEY");
    }

    @Bean
    public static String getPromptAgent() {
        return dotenv.get("PROMPT_AGENT");
    }

    @Bean
    public static double getTemperature() {
        return Double.parseDouble(dotenv.get("TEMPERATURE"));
    }

    @Bean
    public static String getModel() {
        return dotenv.get("MODEL");
    }
}
