package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.DayanandEmployee;
import com.example.day12_01.service.DayanandEmployeeService;

@RestController
public class DayanandEmployeeController {
    @Autowired
    DayanandEmployeeService employeeService;

    @PostMapping("/employee")
    public DayanandEmployee setMethod(@RequestBody DayanandEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DayanandEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DayanandEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
