package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.dayanandStudentInfo;

@Repository
public interface dayanandStudentInfoRepository extends JpaRepository<dayanandStudentInfo,Integer>{
    
}