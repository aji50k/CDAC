package com.Q3.Employee;

public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    private int id;
    private String name;
    private double salary;

    static {
        System.out.println("Employee class initialized.");
    }

    // Constructor 
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        totalSalaryExpense -= this.salary; 
        this.salary = salary;
        totalSalaryExpense += salary; 
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void applyRaise(double percentage) {
        totalSalaryExpense *= (1 + percentage / 100);
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    public void updateSalary(double newSalary) {
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
