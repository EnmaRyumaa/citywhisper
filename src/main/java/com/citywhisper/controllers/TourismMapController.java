package com.citywhisper.controllers;

import com.citywhisper.dto.LocaleDTO;
import com.citywhisper.dto.ResponseDTO;
import com.citywhisper.services.TourismMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/v1/map")
public class TourismMapController {

    @Autowired
    private TourismMapService tourismMapService;

    @PostMapping
    public ResponseEntity<Mono<ResponseDTO>> tourismMap (@RequestBody LocaleDTO localeDTO) {

        tourismMapService.makeMap(localeDTO);

        return ResponseEntity.ok(null);
    }
}
