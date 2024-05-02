package com.example.cw4.service;

import com.example.cw4.model.dayanandCompany;
import com.example.cw4.repository.dayanandCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private dayanandCompanyRepository companyRepository;

    public List<dayanandCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public dayanandCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public dayanandCompany addCompany(dayanandCompany company) {
        return companyRepository.save(company);
    }
}