package com.Q4.Student;

public class Student {
    private String name;
    private int age;
    private String rollNumber;
    private String course;

    // Constructor
    public Student(String name, int age, String rollNumber, String course) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}
