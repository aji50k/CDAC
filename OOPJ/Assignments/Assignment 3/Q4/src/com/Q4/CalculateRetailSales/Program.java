package com.Q4.CalculateRetailSales;

import java.util.Scanner;

class DiscountCalculator{
	private float originalPrice;
	private float discountRate;
	
	public void acceptRecord(float originalPrice, float discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}
	
	public float calculateDiscount() {
		float finalPrice = originalPrice * (discountRate / 100);
		return finalPrice;
	}
	
	public void printRecord() {
		System.out.println(this.calculateDiscount());
	}
}

public class Program {

	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		System.out.println("Enter the discount percentage :");
		float discount = sc.nextFloat();
		
		dc.acceptRecord(price, discount);
		dc.printRecord();
	}

}
