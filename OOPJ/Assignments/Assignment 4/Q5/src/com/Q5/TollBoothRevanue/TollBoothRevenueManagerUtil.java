package com.Q5.TollBoothRevanue;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
    private Scanner scanner = new Scanner(System.in);
    private TollBoothRevenueManager tollBoothRevenueManager;

    public void acceptRecord() {
        System.out.print("Enter toll rate for cars (in ₹): ");
        double carRate = scanner.nextDouble();
        System.out.print("Enter toll rate for trucks (in ₹): ");
        double truckRate = scanner.nextDouble();
        System.out.print("Enter toll rate for motorcycles (in ₹): ");
        double motorcycleRate = scanner.nextDouble();

        tollBoothRevenueManager = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);

        System.out.print("Enter the number of cars: ");
        int carCount = scanner.nextInt();
        tollBoothRevenueManager.setCarCount(carCount);

        System.out.print("Enter the number of trucks: ");
        int truckCount = scanner.nextInt();
        tollBoothRevenueManager.setTruckCount(truckCount);

        System.out.print("Enter the number of motorcycles: ");
        int motorcycleCount = scanner.nextInt();
        tollBoothRevenueManager.setMotorcycleCount(motorcycleCount);
    }

    public void printRecord() {
        if (tollBoothRevenueManager != null) {
            System.out.println(tollBoothRevenueManager);
        } else {
            System.out.println("No record found. Please enter the data first.");
        }
    }

    public void menuList() {
        int choice;
        do {
            System.out.println("\nToll Booth Revenue Manager Menu:");
            System.out.println("1. Enter Toll Rates and Vehicle Counts");
            System.out.println("2. Display Total Vehicles and Revenue");
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
