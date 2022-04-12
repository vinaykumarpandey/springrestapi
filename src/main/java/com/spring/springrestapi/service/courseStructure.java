package com.spring.springrestapi.service;

import com.spring.springrestapi.util.Course;

import java.util.List;

public interface courseStructure {

     public List<Course> getCourses();

     public Course getCourse(long courseId);

}
