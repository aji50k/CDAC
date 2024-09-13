package com.Q1.InstanceCounter;

public class InstanceCounter {
    private static int instanceCount = 0;

    // Constructor
    public InstanceCounter() {
        // Increment the instance count every time a new object is created
        instanceCount++;
    }

    // *Static* method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    //display the instance count
    public void displayInstanceCount() {
        System.out.println("Number of instances created: " + getInstanceCount());
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "InstanceCounter [current instance count: " + getInstanceCount() + "]";
    }
}
