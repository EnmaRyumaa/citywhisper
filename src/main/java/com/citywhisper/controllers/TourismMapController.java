package com.citywhisper.controllers;

import com.citywhisper.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/v1/map")
public class TourismMapController {

    @PostMapping
    public ResponseEntity<Mono<ResponseDTO>> tourismMap () {

        return ResponseEntity.ok(null);
    }
}
