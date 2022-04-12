package com.spring.springrestapi.util;

public class Course {
    private long courseID;
    private String courseTitle;
    private String courseDetails;

    public Course(long courseID, String courseTitle, String courseDetails) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.courseDetails = courseDetails;
    }


    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                '}';
    }


}
