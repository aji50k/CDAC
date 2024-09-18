package com.Challenges.Q5;

import java.util.Scanner;

public class Q5Median{
// {1, 2, 3, 4, 5, 6, 7, 8, 8}
public static void main(String [] args){
    System.out.println("Enter size of array: ");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] arr=new int[size];

    for(int i=0;i<arr.length;i++){
        System.out.println("Enter "+(i+1)+" element.");
        arr[i]=sc.nextInt();
    }

    int [] brr=new int [size-2];
    int start=0;
    int end=start+2;
    int index=0;
    for(int j=0;j<arr.length-1;j++){
        for(int i=start;i<=end;i++){
            if(i==end-1){
                if(index==(size-2))
                break;
                brr[index]=arr[i];
                index++;
                
            }
        }
        start++;
        end=start+2;
    }
    for(int element : brr){
System.out.print(element+" ");
    }
}

}