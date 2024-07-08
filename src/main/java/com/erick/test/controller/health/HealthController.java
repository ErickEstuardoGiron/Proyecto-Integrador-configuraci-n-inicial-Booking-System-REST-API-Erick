package com.erick.test.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> checkAPI() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "The API is working ok!");
        return response;
    }
}
