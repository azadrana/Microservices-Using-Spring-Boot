package com.microservice.service;

import com.microservice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepo userRepo;

    public String getUser(){
        return userRepo.getUser();
    }
}
