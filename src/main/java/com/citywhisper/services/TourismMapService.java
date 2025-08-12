package com.citywhisper.services;

import com.citywhisper.dto.LocaleDTO;
import com.citywhisper.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TourismMapService {

    @Autowired
    private ExternalPathService externalPathService;

    public Mono<ResponseDTO> makeMap (LocaleDTO localeDTO) {

        if (localeDTO.getCountry() == null) {
            localeDTO.setCountry("Brazil");
        }

        return null;
    }
}
