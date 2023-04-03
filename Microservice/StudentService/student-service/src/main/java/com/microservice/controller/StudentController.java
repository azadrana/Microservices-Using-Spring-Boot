package com.microservice.controller;

import com.microservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/getStudent")
    public String getStudent(){
        return studentService.getStudent();
    }
}
