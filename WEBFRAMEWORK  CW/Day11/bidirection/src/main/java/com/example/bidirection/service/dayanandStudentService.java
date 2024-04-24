package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.dayanandStudent;
import com.example.bidirection.model.dayanandStudentInfo;
import com.example.bidirection.repository.dayanandStudentInfoRepository;
import com.example.bidirection.repository.dayanandStudentRepository;

@Service
public class dayanandStudentService {
    public dayanandStudentRepository studentRepository;
    public dayanandStudentInfoRepository studentInfoRepository;
    public dayanandStudentService(dayanandStudentRepository studentRepository,dayanandStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public dayanandStudent saveStudent(dayanandStudent student)
    {
        return studentRepository.save(student);
    }
    public dayanandStudentInfo saveStudentInfo(dayanandStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<dayanandStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
