package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "This is public data - no token needed";
    }

    @GetMapping("/api/protected")
    public String protectedEndpoint(Authentication auth) {
        return "Protected data! Token scopes: " + auth.getAuthorities();
    }
}
