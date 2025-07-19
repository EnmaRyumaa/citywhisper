package com.citywhisper.controllers;

import com.citywhisper.client.dto.ResponseDTO;
import com.citywhisper.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cep")
public class CepController {

    @Autowired
    private CepService service;

    @GetMapping("/{cep}")
    public ResponseEntity<ResponseDTO> getCep(@PathVariable String cep) {
        //TODO trocar retorno para DTO.
        return ResponseEntity.ok(service.getCep(cep)).getBody();
    }
}
