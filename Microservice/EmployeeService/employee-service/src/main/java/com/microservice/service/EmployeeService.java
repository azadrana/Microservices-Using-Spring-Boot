package com.microservice.service;

import com.microservice.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
     public EmployeeRepo employeeRepo;
    public String getEmployee(){
        return employeeRepo.getEmployee();
    }
}
