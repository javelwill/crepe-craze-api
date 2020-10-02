package com.javelwilson.crepecrazeapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfig {

    @Value("${application.api.baseUrl")
    private String baseUrl;
    @Value("${application.api.username")
    private String username;
    @Value("${application.api.password")
    private String password;

    @Bean(name="customeRestTemplate")
    public RestTemplate getRestTemplate() {

        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = restTemplateBuilder.basicAuthentication(username, password).rootUri(baseUrl).build();
        return restTemplate;
    }
}
