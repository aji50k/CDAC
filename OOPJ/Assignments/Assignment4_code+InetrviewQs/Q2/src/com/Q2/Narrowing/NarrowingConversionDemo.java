package com.Q2.Narrowing;

public class NarrowingConversionDemo {
	public static void main(String[] args) {
		    double doubleValue = 42.99;
	        int intValue = (int) doubleValue;
	        System.out.println("The double value: " + doubleValue);
	        System.out.println("The int value after narrowing conversion: " + intValue);
	}
}
