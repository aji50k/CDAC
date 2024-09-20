package com.Challenges.Q2; 

import java.util.Scanner;

public class Q2Solution {

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
        
        System.out.println("\nEnter the value of k: ");
        int k = sc.nextInt();
        
        // Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // kth largest element
        if (k > 0 && k <= size) {
            System.out.println(k + "th largest element is: " + arr[arr.length - k]);
        } else {
            System.out.println("Invalid value of k");
        }
        
        sc.close(); 
    }
}
