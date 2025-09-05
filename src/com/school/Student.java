package com.school;

public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}