package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.dayanandStudent;



@Repository
public interface dayanandStudentRepository extends JpaRepository<dayanandStudent,Integer>{
    
}
