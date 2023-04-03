package com.microservice.controller;

import com.microservice.CallToEmployee.ResponseTemplate;
import com.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public ResponseTemplate responseTemplate;

    @GetMapping("/getUser")
    public String getUser(){
        return userService.getUser();
    }

    @GetMapping("/getEmployeeByUser")
    public ResponseEntity<String> getEmployee(){
        return responseTemplate.getEmployee();
    }
}
