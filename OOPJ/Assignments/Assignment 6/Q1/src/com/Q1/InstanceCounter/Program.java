package com.Q1.InstanceCounter;

public class Program {
    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        obj1.displayInstanceCount(); 

        // Using the toString() method to print the instance count
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        //accessing the static method to get instance count
        System.out.println("Total number of instances created (via static method): " + InstanceCounter.getInstanceCount());
    }
}


