package com.example.cw4.service;

import com.example.cw4.model.dayanandEmployee;
import com.example.cw4.repository.dayanandEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private dayanandEmployeeRepository employeeRepository;

    public List<dayanandEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public dayanandEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public dayanandEmployee addEmployee(dayanandEmployee employee) {
        return employeeRepository.save(employee);
    }
}