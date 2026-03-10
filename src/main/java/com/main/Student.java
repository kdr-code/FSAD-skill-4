package com.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    public Student(
            @Value("102") int studentId,
            @Value("Anjali") String name,
            @Value("Data Science") String course,
            @Value("1") int year) {

        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println(studentId + " " + name + " " + course + " " + year);
    }
}