package com.Q1.LoanCalculator;

import java.util.Scanner;

class LoanAmortizationCalculator {
    private float principle;
    private float annualInterestRate;
    private int loanTerm;
    
    public LoanAmortizationCalculator(float principle, float annualInterestRate, int loanTerm) {
		this.principle = principle;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
	}

	public float getPrinciple() {
		return principle;
	}

	public void setPrinciple(float principle) {
		this.principle = principle;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public void acceptRecord(float principle, float annualInterestRate, int loanTerm) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    public double calculateMonthlyPayment() {
        float monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        
        double monthlyPayment = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;
    }
    
    double calculateTotalPayment() {
    	return calculateMonthlyPayment() * loanTerm * 12;
    }
    
    public String toString() {
    	return "LoanAmortizationCalculator [Principal=₹" + principle +
                ", Annual Interest Rate=" + annualInterestRate +
                "%, Loan Term=" + loanTerm + " years]";
    }
}

class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator loan;

    // Method to accept input from the user
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount (₹): ");
        double principle = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter Loan Term (years): ");
        int loanTerm = sc.nextInt();
        
        loan = new LoanAmortizationCalculator(principle, annualInterestRate, loanTerm);
    }

    // Method to display loan information and monthly payments
    public void printRecord() {
        if (loan == null) {
            System.out.println("No loan record found. Please input loan details first.");
            return;
        }

        System.out.println(loan);
        double monthlyPayment = loan.calculateMonthlyPayment();
        double totalPayment = loan.calculateTotalPayment();

        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total Payment over the loan term: ₹%.2f%n", totalPayment);
    }

    // Method to display the menu
    public void menuList() {
        System.out.println("1. Accept Loan Record");
        System.out.println("2. Display Loan Details");
        System.out.println("0. Exit");
    }
}


public class Program {
    public static void main(String[] args) {
        LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    util.acceptRecord();
                    break;
                case 2:
                    util.printRecord();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}