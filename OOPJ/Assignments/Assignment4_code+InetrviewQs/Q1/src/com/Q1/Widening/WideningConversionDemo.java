package com.Q1.Widening;

public class WideningConversionDemo {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue;
        
        System.out.println("The int value: " + intValue);
        System.out.println("The double value after widening conversion: " + doubleValue);
    }
}
