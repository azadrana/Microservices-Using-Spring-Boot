package com.microservice.service;


import com.microservice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    public StudentRepo studentRepo;

    public String getStudent(){
        return studentRepo.getStudent();
    }

}
