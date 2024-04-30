package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.DilipEmployee;
import com.example.day12_01.repository.DilipEmployeeRepo;

@Service
public class DayanandEmployeeService {
    @Autowired
    DayanandEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DayanandEmployee setEmployee(DayanandEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DayanandEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DayanandEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
