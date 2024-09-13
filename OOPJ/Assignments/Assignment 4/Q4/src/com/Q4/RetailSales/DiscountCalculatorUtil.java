package com.Q4.RetailSales;

import java.util.Scanner;

public class DiscountCalculatorUtil {
    private Scanner scanner = new Scanner(System.in);
    private DiscountCalculator discountCalculator;

    // Method to accept the original price and discount rate
    public void acceptRecord() {
        System.out.print("Enter original price (in ₹): ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter discount rate (in %): ");
        double discountRate = scanner.nextDouble();

        discountCalculator = new DiscountCalculator(originalPrice, discountRate);
    }

    // Method to print the discount details
    public void printRecord() {
        if (discountCalculator != null) {
            System.out.println(discountCalculator);
        } else {
            System.out.println("No record found. Please enter the data first.");
        }
    }

    // Method to display the menu and handle the user's choice
    public void menuList() {
        int choice;
        do {
            System.out.println("\nDiscount Calculator Menu:");
            System.out.println("1. Enter Original Price and Discount Rate");
            System.out.println("2. Display Discount and Final Price");
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
