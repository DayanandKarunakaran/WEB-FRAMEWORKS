package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.dayanandStudent;
import com.example.bidirection.model.dayanandStudentInfo;
import com.example.bidirection.service.dayanandStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class dayanandStudentController {
    public dayanandStudentService studentService;
    public dayanandStudentController(dayanandStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public dayanandStudent postMethodName(@RequestBody dayanandStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public dayanandStudentInfo postMethodName(@RequestBody dayanandStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<dayanandStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}