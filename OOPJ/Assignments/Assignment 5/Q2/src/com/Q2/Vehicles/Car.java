package com.Q2.Vehicles;

public class Car extends Vehicle {
    private String model;

    // Constructor
    public Car(String make, int year, String model) {
        // Call the parent class constructor
        super(make, year);
        this.model = model;
    }

    //display car details
    public String getCarDetails() {
        return super.getVehicleDetails() + ", Model: " + model;
    }
}
