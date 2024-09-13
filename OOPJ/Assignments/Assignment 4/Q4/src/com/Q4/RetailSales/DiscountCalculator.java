package com.Q4.RetailSales;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;

    // Constructor
    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    //calculate discount amount
    public double calculateDiscountAmount() {
        return originalPrice * (discountRate / 100);
    }

    //calculate final price
    public double calculateFinalPrice() {
        return originalPrice - calculateDiscountAmount();
    }

    // toString method to display the details
    @Override
    public String toString() {
        return "Original Price: ₹" + originalPrice + ", Discount Rate: " + discountRate + "%" +
               "\nDiscount Amount: ₹" + String.format("%.2f", calculateDiscountAmount()) +
               "\nFinal Price: ₹" + String.format("%.2f", calculateFinalPrice());
    }
}
