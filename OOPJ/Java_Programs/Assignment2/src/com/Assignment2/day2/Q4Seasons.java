package com.Assignment2.day2;

import java.util.Scanner;

public class Q4Seasons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month :");
		int month = scanner.nextInt();
		
		switch (month) {
		case 12:
		case 1 :
		case 2 :
			System.out.println("Winter");
			break;
		case 3:
		case 4 :
		case 5 :
			System.out.println("Spring");
			break;
		case 6:
		case 7 :
		case 8 :
			System.out.println("summar");
			break;
		case 9:
		case 10 :
		case 11 :
			System.out.println("Autumn");
			break;
		default:
			System.out.println("Please enter number between 1 to 12 only :");
			break;
		}
	}

}
