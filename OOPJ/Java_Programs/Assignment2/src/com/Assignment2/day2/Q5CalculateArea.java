package com.Assignment2.day2;

import java.util.Scanner;

public class Q5CalculateArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key");
		System.out.println("Enter 1 to calculate area of Circle :");
		System.out.println("Enter 2 to calculate area of Triangle :");
		System.out.println("Enter 3 to calculate area of Square :");
		System.out.println("Enter 4 to calculate area of Rectangle :");
		int key = scanner.nextInt();
		double r = 23.5;
		double base = 8.3;
		double height = 12.5;
		double side = 7.3;
		double length = 12.6;
		double breadth = 6.3;
		
		switch (key) {
		case 1: {
			Double areaOfCircle = Math.PI*r;
			System.out.println("Area of Circle is : "+areaOfCircle);
			break;
		}
		case 2: {
			Double areaOfTriangle = (1/2)*base*height;
			System.out.println("Area of Triangle is : "+areaOfTriangle);
			break;
		}
		case 3: {
			Double areaOfSquare = side*side;
			System.out.println("Area of Circle is : "+areaOfSquare);
		}
		case 4: {
			Double areaOfRectangle = length*breadth;
			System.out.println("Area of Circle is : "+areaOfRectangle);
		}
		
		default:
			System.out.println("Please enter only 1 to 4 keys :");
		}
	}

}
