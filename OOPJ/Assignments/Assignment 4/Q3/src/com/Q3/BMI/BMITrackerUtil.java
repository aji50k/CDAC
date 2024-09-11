package com.Q3.BMI;

import java.util.Scanner;

public class BMITrackerUtil {
	private double weight;
    private double height;

	public void BMICalculatorUtil() {
        scanner = new Scanner(System.in);
    }
	
	public void acceptRecord() {
		System.out.print("Enter weight (in ₹kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in m): ");
        double height = scanner.nextDouble();
	}
	
	public void printRecord() {
		
	}
	
	public void menuList() {
        
    }
}
