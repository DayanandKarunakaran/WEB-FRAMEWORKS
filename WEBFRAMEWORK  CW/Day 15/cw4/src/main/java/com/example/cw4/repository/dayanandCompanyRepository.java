package com.example.cw4.repository;

import com.example.cw4.model.dayanandCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dayanandCompanyRepository extends JpaRepository<dayanandCompany, Integer> {
}