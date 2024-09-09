package com.Q1.LoanCalculator;
import java.util.Scanner;

class LoanAmortizationCalculator {
    private float principle;
    private float annualInterestRate;
    private int loanTerm;

    public void acceptRecord(float principle, float annualInterestRate, int loanTerm) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    public double calculateMonthlyPayment() {
        float monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        
        // Correct formula for monthly payment
        double monthlyPayment = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;
    }

    public void printRecord() {
        System.out.println("Monthly Payment is: " + calculateMonthlyPayment());
    }
}

public class Program {

    public static void main(String[] args) {
        LoanAmortizationCalculator loan = new LoanAmortizationCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        float principle = sc.nextFloat();
        
        System.out.println("Enter the annual interest rate: ");
        float annualInterestRate = sc.nextFloat();
        
        System.out.println("Enter the loan term in number of years: ");
        int loanTerm = sc.nextInt();
        
        loan.acceptRecord(principle, annualInterestRate, loanTerm);
        loan.printRecord();  // This will also calculate and print the monthly payment

        sc.close();  // Closing the scanner
    }
}
