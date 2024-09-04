package com.Assignment2.day2;

import java.util.Scanner;

public class Q2CalculateBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you weight in kg :");
		double weight = sc.nextDouble();
		System.out.println("Enter your height in meters :");
		double height = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("Your BMI is : "+BMI);
		
		if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("You have a normal weight.");
        } else
            System.out.println("You are overweight.");
	}

}
