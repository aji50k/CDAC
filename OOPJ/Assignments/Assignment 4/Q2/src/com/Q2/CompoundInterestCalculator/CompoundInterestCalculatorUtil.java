package com.Q2.CompoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	private CompoundInterestCalculator calculator;
    private Scanner scanner;

	public CompoundInterestCalculatorUtil() {
        scanner = new Scanner(System.in);
    }
	
	public void acceptRecord() {
		System.out.print("Enter initial investment amount (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter investment duration (in years): ");
        int years = scanner.nextInt();
	}
	
	public void printRecord() {
		if (calculator == null) {
            System.out.println("Please enter investment details first.");
        } else {
            System.out.println(calculator);
            double futureValue = calculator.calculateFutureValue();
            double totalInterest = calculator.calculateTotalInterest();
            System.out.printf("Future Value: ₹%.2f\n", futureValue);
            System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
        }
	}
	
	public void menuList() {
        System.out.println("\n1. Enter investment details");
        System.out.println("2. Display investment details and calculations");
        System.out.println("3. Exit");
    }
}
