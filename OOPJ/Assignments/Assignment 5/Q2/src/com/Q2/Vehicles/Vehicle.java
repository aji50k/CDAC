package com.Q2.Vehicles;

public class Vehicle {
    protected String make;
    protected int year;

    // Constructor
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    //display vehicle details
    public String getVehicleDetails() {
        return "Make: " + make + ", Year: " + year;
    }
}
