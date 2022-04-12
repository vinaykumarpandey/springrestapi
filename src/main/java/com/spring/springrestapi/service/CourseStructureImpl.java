package com.spring.springrestapi.service;

import com.spring.springrestapi.util.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CourseStructureImpl implements  courseStructure{

    List<Course> list;


    public CourseStructureImpl() {

        System.out.println("inside constructor");

    list = new ArrayList<>();
     Course c1 = new Course(140, "java", "learning java");
     Course c2 = new Course(200, "spring", "learning spring");
     Course c3 = new Course(300, "LLB", "learning LLB with Pragati");
     list.add(c1);
     list.add(c2);
     list.add(c3);
    }

    @Override
    public List<Course> getCourses() {
        System.out.println("Inside getCourse " +list);
        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        Course course = null;
        for ( Course c : list) {
            if(c.getCourseID()== courseId){
                course =c;
                break;
            }

            }
        return course;
        }

    }
