package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.dayanandStudent;
import com.example.relation.repository.dayanandStudentRepository;

@Service
public class StudentService {
    public dayanandStudentRepository studentRepository;
    public StudentService(dayanandStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public dayanandStudent saveStudent(dayanandStudent student)
    {
        return studentRepository.save(student);
    }
    public List<dayanandStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
