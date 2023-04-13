package com.example.debtsapi.service;

import org.springframework.web.client.RestTemplate;

public class AppConfig {

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
