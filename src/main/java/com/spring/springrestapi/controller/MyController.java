package com.spring.springrestapi.controller;

import com.spring.springrestapi.service.CourseStructureImpl;
import com.spring.springrestapi.service.courseStructure;
import com.spring.springrestapi.util.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    courseStructure courseStructure;


    @GetMapping("/home")
    public String home(){

        return "Welcome to home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseStructure.getCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID){
        return this.courseStructure.getCourse(Long.parseLong(courseID));
    }



}
