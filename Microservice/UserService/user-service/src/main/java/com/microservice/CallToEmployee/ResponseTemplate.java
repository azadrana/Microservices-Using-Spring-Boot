package com.microservice.CallToEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ResponseTemplate {


    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getEmployee() {
        ResponseEntity<String> str1=restTemplate.getForEntity("http://localhost:9001/getEmployee",String.class);
        return str1;
    }
}
