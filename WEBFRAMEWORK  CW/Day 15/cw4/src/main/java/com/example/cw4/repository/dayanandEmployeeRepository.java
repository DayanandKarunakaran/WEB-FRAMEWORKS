package com.example.cw4.repository;

import com.example.cw4.model.dayanandEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dayanandEmployeeRepository extends JpaRepository<dayanandEmployee, Integer> {
}