package com.Q2.CompoundInterestCalculator;

import java.util.Scanner;

class CompoundInterestCalculator{
	private float principle;
	private float interestRate;
	private float numberOfCompounds;
	private float years;
	
	public void acceptRecord(float principle, float interestRate, float numberOfCompounds, float years) {
		this.principle = principle;
		this.interestRate = interestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}
	
	public double calculateFutureValue() {
		double futureValue = principle * Math.pow((1 + interestRate / numberOfCompounds),(numberOfCompounds * years));
		return futureValue;
	}
	
	public void printRecord() {
		System.out.println(this.calculateFutureValue());
	}
}

public class Program {

	public static void main(String[] args) {
		CompoundInterestCalculator cic = new CompoundInterestCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial investment amount : ");
		float principle = sc.nextFloat();
		System.out.println("Enter the annual interest rate :");
		float annualInterestRate = sc.nextFloat();
		System.out.println("Enter the number of times the interest is compounded per year :");
		float numberOfCompounds = sc.nextFloat();
		System.out.println("Enter the investment duration (in years)");
		float years = sc.nextFloat();
		
		cic.acceptRecord(principle, annualInterestRate, numberOfCompounds, years);
		cic.printRecord();
	}

}
