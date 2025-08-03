package com.citywhisper.controllers;

import com.citywhisper.dto.CepDTO;
import com.citywhisper.dto.ResponseDTO;
import com.citywhisper.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/cep")
public class CepController {

    @Autowired
    private CepService service;

    @PostMapping()
    public ResponseEntity<ResponseDTO> getCep(@RequestBody CepDTO cep) {
        ResponseDTO dto = service.getCep(cep.getCep());

        return ResponseEntity.ok(dto);
    }
}
