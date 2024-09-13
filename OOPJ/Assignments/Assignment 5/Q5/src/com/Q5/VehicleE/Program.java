package com.Q5.VehicleE;

public class Program {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle();
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
