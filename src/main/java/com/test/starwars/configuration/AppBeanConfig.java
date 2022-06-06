package com.test.starwars.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppBeanConfig {

    @Value("${swapi.url}")
    private String url;

    @Bean
    public RestTemplate restTemplate(){
        RestTemplateBuilder builder = new RestTemplateBuilder();
        return builder.rootUri(url).build();
    }
}
