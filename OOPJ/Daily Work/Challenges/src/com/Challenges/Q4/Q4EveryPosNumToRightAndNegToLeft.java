package com.Challenges.Q4;

import java.util.Scanner;

public class Q4EveryPosNumToRightAndNegToLeft {
	
	public static void reArrangeArray(int[] arr){
		int left = 0;
		int right = arr.length-1;
		
		while (left<=right) {
			if (arr[left]<0) {
				left++;
			}
			else if (arr[right]>=0) {
				right--;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		reArrangeArray(arr);
		
		System.out.println("Rearranged array :");
			for (int num : arr) {
				System.out.println(num+" ");
			}
			
			sc.close();
		
	}

}
