package com.example.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("Anuski", "LA MEJOR");
    }

  

  @GetMapping("/fiebre")
    public Map<String, String> health() {
        return Map.of("Temperatura del paciente", "Tiene fiebre");
    }
}

