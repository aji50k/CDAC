package com.Assignment2.day2;

import java.util.Scanner;

public class Q3VoteEligibility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = scanner.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}

}
