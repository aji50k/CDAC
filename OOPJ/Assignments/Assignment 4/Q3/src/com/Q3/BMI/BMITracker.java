package com.Q3.BMI;

public class BMITracker {
	double weight;
	double height;
	
	public BMITracker(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BMITracker [weight=" + weight + ", height=" + height + "]";
	}
	
	public void calculateBMI() {
		double BMI = weight / (height * height);
	}
	
}
