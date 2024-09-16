package com.Q4.WideningConversion;

public class WideningConversion {

	public static void main(String[] args) {
		int intValue = 42;
      
        double doubleValue = intValue;
        
        float floatValue = intValue;
        
        String stringValue = Integer.toString(intValue);
        
        System.out.println("The int value: " + intValue);
        System.out.println("The double value after widening conversion: " + doubleValue);
        System.out.println("The float value after widening conversion: " + floatValue);
        System.out.println("The String value after conversion: " + stringValue);
	}

}
