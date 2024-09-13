package com.Q3.BMI;

import java.util.Scanner;

public class BMITrackerUtil {
    private Scanner scanner = new Scanner(System.in);
    private BMITracker bmiTracker;

    // Method to accept weight and height
    public void acceptRecord() {
        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        bmiTracker = new BMITracker(weight, height);
    }

    // Method to print BMI details
    public void printRecord() {
        if (bmiTracker != null) {
            System.out.println(bmiTracker);
        } else {
            System.out.println("No record found. Please enter the data first.");
        }
    }

    // Method to display the menu and handle the user's choice
    public void menuList() {
        int choice;
        do {
            System.out.println("\nBMI Tracker Menu:");
            System.out.println("1. Enter Weight and Height");
            System.out.println("2. Display BMI");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    break;
                case 2:
                    printRecord();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
