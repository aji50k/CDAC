package com.Q3.BMI;

import java.util.Scanner;

class BMITracker{
	private float weight;
	private float height;
	
	void acceptRecord(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double calculateBMI() {
		double BMI = weight / (height * height);
		return BMI;
	}
	
	public void classyfyBMI() {
		double BMI = this.calculateBMI();
		if (BMI<18.5) {
			System.out.println("Underweight");
		}
		else if (BMI>=18.5 && BMI<24.9) {
			System.out.println("Normal weight");
		}
		else if (BMI>=25 && BMI<29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
	
	public void printRecord() {
		System.out.println(this.calculateBMI());
	}
}

public class Project {

	public static void main(String[] args) {
		BMITracker bmt = new BMITracker();
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter weight in kg : ");
		float weight = sc.nextFloat();
		System.out.println("enter height in m : ");
		float height = sc.nextFloat();
		
		bmt.acceptRecord(weight, height);
		bmt.calculateBMI();
		bmt.classyfyBMI();
		
		sc.close();
	}

}
