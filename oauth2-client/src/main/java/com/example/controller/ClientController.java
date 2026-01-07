package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ClientController {
    private final RestClient restClient;

    public ClientController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/call")
    public String callApi() {
        return restClient.get()
                .uri("/api/protected")
                .retrieve()
                .body(String.class);
    }
}
