package com.Q1.LoanCalculator;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator loanCalculator;
    private Scanner scanner;

    public LoanAmortizationCalculatorUtil() {
        scanner = new Scanner(System.in);
    }

    // Method to accept record from user
    public void acceptRecord() {
        System.out.print("Enter loan principal (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term (in years): ");
        int loanTerm = scanner.nextInt();

        loanCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    // Method to print record (results)
    public void printRecord() {
        if (loanCalculator == null) {
            System.out.println("Please enter loan details first.");
        } else {
            System.out.println(loanCalculator);
            double monthlyPayment = loanCalculator.calculateMonthlyPayment();
            double totalPayment = loanCalculator.calculateTotalPayment();
            System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
            System.out.printf("Total Payment over the life of the loan: ₹%.2f\n", totalPayment);
        }
    }

    // Method to display menu
    public void menuList() {
        System.out.println("\n1. Enter loan details");
        System.out.println("2. Display loan details and calculations");
        System.out.println("3. Exit");
    }
}
