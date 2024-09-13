package com.Q5.TollBoothRevanue;

public class TollBoothRevenueManager {
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    // Constructor
    public TollBoothRevenueManager(double carTollRate, double truckTollRate, double motorcycleTollRate) {
        this.carTollRate = carTollRate;
        this.truckTollRate = truckTollRate;
        this.motorcycleTollRate = motorcycleTollRate;
    }

    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }

    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }

    public void setMotorcycleTollRate(double motorcycleTollRate) {
        this.motorcycleTollRate = motorcycleTollRate;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    // total revenue
    public double calculateTotalRevenue() {
        return (carCount * carTollRate) + (truckCount * truckTollRate) + (motorcycleCount * motorcycleTollRate);
    }

    //total vehicle count
    public int calculateTotalVehicleCount() {
        return carCount + truckCount + motorcycleCount;
    }

    @Override
    public String toString() {
        return "Toll Booth Revenue Summary: \n" +
                "Total Vehicles: " + calculateTotalVehicleCount() +
                "\nTotal Revenue: ₹" + String.format("%.2f", calculateTotalRevenue());
    }
}
