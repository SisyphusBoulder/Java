package com.qa.java.oop.features;

public class BMW extends Cars{
	
	public BMW() {
		super();
		System.out.println("BMW() constructor");
		
	}
	
	int noOfCylinders;
	int maxTorque;
	
	
	public BMW(int noOfCylinders, int maxTorque) {
		super();
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
		
	}
	
	public BMW(int id, String name,	float price, int engineCC, String fuelType, int manufacturingYear, int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
		
	}
	void displayBMWDetails() {
		
		carDetails();
		System.out.println("Number of cylinders : " + noOfCylinders);
		System.out.println("Max Torque : " + maxTorque);
	}

}
