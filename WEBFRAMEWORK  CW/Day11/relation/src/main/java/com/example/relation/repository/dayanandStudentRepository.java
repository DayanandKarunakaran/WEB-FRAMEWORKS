package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.dayanandStudent;

@Repository
public interface dayanandStudentRepository extends JpaRepository<dayanandStudent,Integer>{
    
}
