package com.Assignment2.day2;

import java.util.Scanner;

public class Q1LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println("Using if-else");
        // Using if-else
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }

        System.out.println("Using switch case");
        // Using switch
        switch (year % 400) {
            case 0:
                System.out.println(year + " is a Leap year");
                break;
            default:
                switch (year % 100) {
                    case 0:
                        System.out.println(year + " is not a Leap year");
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                System.out.println(year + " is a Leap year");
                                break;
                            default:
                                System.out.println(year + " is not a Leap year");
                                break;
                        }
                        break;
                }
                break;
        }
       
    }
}