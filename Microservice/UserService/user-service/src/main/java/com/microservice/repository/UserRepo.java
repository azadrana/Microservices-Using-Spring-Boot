package com.microservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    public String getUser(){
        return "" +
                "1.Thakur Shaab" +
                "2.Rao Shaab" +
                "3.Binod";
    }
}
