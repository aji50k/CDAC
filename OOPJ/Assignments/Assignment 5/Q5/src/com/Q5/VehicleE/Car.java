package com.Q5.VehicleE;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine with a key ignition...");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Stopping the car's engine.");
    }
}
