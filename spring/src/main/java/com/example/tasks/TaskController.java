package com.example.tasks;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<String> tasks = new ArrayList<>(
            List.of("Aprender Spring Boot", "Dockerizar la aplicación")
    );

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public Map<String, String> addTask(@RequestBody Map<String, String> body) {
        String description = body.get("description");

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description is required");
        }

        tasks.add(description);
        return Map.of("message", "Task created", "description", description);
    }
}
