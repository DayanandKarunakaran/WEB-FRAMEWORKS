package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.dayanandStudent;
import com.example.relation.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class dayanandStudentController {
    public StudentService studentService;
    public dayanandStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public dayanandStudent postMethodName(@RequestBody dayanandStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<dayanandStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
