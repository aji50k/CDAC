package com.Q3.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee e1 = new Employee(1, "Aju", 50000);
        Employee e2 = new Employee(2, "Raju", 60000);
        Employee e3 = new Employee(3, "Manju", 55000);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Display total number of employees");
            System.out.println("2. Apply a raise to all employees");
            System.out.println("3. Calculate total salary expense");
            System.out.println("4. Update salary of an individual employee");
            System.out.println("5. Display all employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Total number of employees: " + Employee.getTotalEmployees());
                    break;
                case 2:
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage);
                    System.out.println("Raise applied.");
                    break;
                case 3:
                    System.out.println("Total salary expense: " + Employee.calculateTotalSalaryExpense());
                    break;
                case 4:
                    System.out.print("Enter employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    scanner.nextLine(); 

                    if (id == e1.getId()) {
                        e1.updateSalary(newSalary);
                    } else if (id == e2.getId()) {
                        e2.updateSalary(newSalary);
                    } else if (id == e3.getId()) {
                        e3.updateSalary(newSalary);
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;
                case 5:
                    System.out.println(e1);
                    System.out.println(e2);
                    System.out.println(e3);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
