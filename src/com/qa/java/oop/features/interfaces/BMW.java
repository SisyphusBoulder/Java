package com.qa.java.oop.features.interfaces;

public class BMW extends CarProperties implements ICars{
	
	int noOfCylinders;
	int maxTorque;
	
	public BMW(int id, String name,	float price, int engineCC, String fuelType, int manufacturingYear, int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
		
	}
	/*public void displayBMWDetails(CarProperties car) {
		
		CarService.carDetails(car);
		System.out.println("Number of cylinders : " + noOfCylinders);
		System.out.println("Max Torque : " + maxTorque);
	}*/

	
	@Override
	public String Car() {
		return "Car Type - BMW";
	}

	@Override
	public void carDetails() {
		System.out.println("Car ID : " + id);
		System.out.println("Car Name : " + name);
		System.out.println("Car Price : £" + price);
		System.out.println("Car EngineCC : " + engineCC);
		System.out.println("Car fuelType : " + fuelType);
		System.out.println("Car manufacturingYear : " + manufacturingYear);
		System.out.println("Number of cylinders : " + noOfCylinders);
		System.out.println("Max Torque : " + maxTorque);
	}

}
