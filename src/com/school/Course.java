package com.school;

public class Course {
    String name;
    String id;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + name + ", ID: " + id);
    }
}