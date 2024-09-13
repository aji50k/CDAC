package com.Q5.VehicleE;

public class Motorcycle extends Vehicle {
    // Override the startEngine method for Motorcycle
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine with a button press...");
    }

    // Override the stopEngine method for Motorcycle
    @Override
    public void stopEngine() {
        System.out.println("Stopping the motorcycle's engine.");
    }
}
