package com.example.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



@RestController
public class HealthController {

    @GetMapping("/healths")
    public Map<String, String> health() {
        return Map.of("Saludo1", "Cambio1");
    }
}
