package com.school;

public class Main {
    public static void main(String[] args) {
        // Create an array to hold Student objects
        Student[] students = new Student[2];
        students[0] = new Student("Alice", 101);
        students[1] = new Student("Bob", 102);

        // Create an array to hold Course objects
        Course[] courses = new Course[2];
        courses[0] = new Course("Mathematics", "MATH101");
        courses[1] = new Course("History", "HIST102");

        // Display the details of each student
        System.out.println("--- Students ---");
        for (Student student : students) {
            student.displayDetails();
        }

        // Display the details of each course
        System.out.println("\n--- Courses ---");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}