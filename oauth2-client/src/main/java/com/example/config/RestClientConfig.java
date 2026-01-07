package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.client.OAuth2ClientHttpRequestInterceptor;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    RestClient apiRestClient(OAuth2AuthorizedClientManager clientManager) {
        OAuth2ClientHttpRequestInterceptor requestInterceptor =
                new OAuth2ClientHttpRequestInterceptor(clientManager);

        // Set client registration ID resolver (defaults to "oauth2ClientContext")
        // Use "auth-server" to match your application.yml registration name
        requestInterceptor.setClientRegistrationIdResolver(request -> "auth-server");

        return RestClient.builder()
                .baseUrl("http://localhost:8080")
                .requestInterceptor(requestInterceptor)
                .build();
    }
}
