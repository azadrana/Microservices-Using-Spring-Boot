package com.microservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {


    public String getStudent() {
        return "1.chetan" +
                "2.matton" +
                "3.totann";
    }
}
