package com.Challenges.Q1;

public class Q1Euclidian {

	public static void main(String[] args) {
		int num1 = 252;
		int num2 = 105;
		int temp = 0;
		
		while (num1!=num2) {
			if (num1>num2) {
				temp=num1-num2;
				num1=temp;
			}
			else {
				temp=num2-num1;
				num2=temp;
			}
		}
		System.out.println("Greatest commmon divisor of two positive integers : "+num1);
	}

}
