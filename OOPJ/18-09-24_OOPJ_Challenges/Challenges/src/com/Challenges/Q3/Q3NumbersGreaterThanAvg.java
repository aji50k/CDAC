package com.Challenges.Q3;

import java.util.Scanner;

public class Q3NumbersGreaterThanAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the Array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
		
		float avg;
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		avg = sum/size;
		
		System.out.println("\nThe numbers greater than the average of the numbers of a\r\n"
				+ "given array are : ");
		for (int element : arr) {
			if (element>avg) {
				System.out.println(element+" ");
			}
		}
	}

}
