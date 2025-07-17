package com.citywhisper.controllers.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/ping")
public class StatusController {

    @GetMapping
    public Map<String,String> ping() {
        Map<String,String> map = new HashMap<>();
        map.put("Status", "Sucess");
        return map;
    }
}
