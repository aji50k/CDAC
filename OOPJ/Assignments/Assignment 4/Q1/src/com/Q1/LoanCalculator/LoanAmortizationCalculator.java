package com.Q1.LoanCalculator;

public class LoanAmortizationCalculator {
	private double principal;
	private double annualInterestRate;
	private float loanTerm;
	
	public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public float getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(float loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        float numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // Method to calculate total payment
    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }
    
	@Override
	public String toString() {
		return "LoanAmortizationCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", loanTerm=" + loanTerm + "]";
	}
	
	
}
