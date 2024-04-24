package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.dayanandStudentInfo;

@Repository
public interface dayanandStudentInfoRepository extends JpaRepository<dayanandStudentInfo,Integer>{
    
}