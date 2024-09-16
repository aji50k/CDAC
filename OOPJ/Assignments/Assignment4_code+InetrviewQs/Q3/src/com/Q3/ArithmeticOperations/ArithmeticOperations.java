package com.Q3.ArithmeticOperations;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int intValue = 10;
        double doubleValue = 20.5;
        float floatValue = 15.3f;
     
        double result1 = intValue + doubleValue;
        
        float result2 = intValue + floatValue;
       
        double result3 = floatValue + doubleValue;
       
        System.out.println("Result of int + double (10 + 20.5): " + result1);
        System.out.println("Result of int + float (10 + 15.3): " + result2);
        System.out.println("Result of float + double (15.3 + 20.5): " + result3);
	}

}
