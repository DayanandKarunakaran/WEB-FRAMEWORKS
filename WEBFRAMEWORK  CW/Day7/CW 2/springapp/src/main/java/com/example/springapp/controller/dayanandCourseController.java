package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.dayanandCourse;
import com.example.springapp.service.CourseService;

@RestController
public class dayanandCourseController {
    @Autowired
    private CourseService ser;

    @PostMapping("/api/course")
    public ResponseEntity<dayanandCourse> post(@RequestBody dayanandCourse person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/course")
    public ResponseEntity<List<dayanandCourse>> getAll() {
        List<dayanandCourse> li = ser.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<dayanandCourse>> getbyAge(@PathVariable String courseName) {
        List<dayanandCourse> li = ser.getbyAge(courseName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
