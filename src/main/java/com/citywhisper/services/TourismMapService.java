package com.citywhisper.services;

import com.citywhisper.client.RequestClient;
import com.citywhisper.client.chatgpt.builder.ChatBuilder;
import com.citywhisper.client.dto.ChatGPTRequestDTO;
import com.citywhisper.dto.LocaleDTO;
import com.citywhisper.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TourismMapService {

    @Autowired
    private ExternalPathService externalPathService;

    @Autowired
    private RequestClient requestClient;

    public Mono<ResponseDTO> makeMap (LocaleDTO localeDTO) {

        if (localeDTO.getCountry() == null) {
            localeDTO.setCountry("Brazil");
        }

        ChatBuilder builder = new ChatBuilder();
        builder.addMessage(localeDTO.getCity());

        ChatGPTRequestDTO request = new ChatGPTRequestDTO(builder);

        return null;
    }
}
