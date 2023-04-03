package com.microservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {

    public String getEmployee(){
        return "1.Azad rana......" +
                "2.saladddin......" +
                "3.Saud aalam....";
    }
}
