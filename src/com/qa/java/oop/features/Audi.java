package com.qa.java.oop.features;

public class Audi extends Cars{
	
	public Audi() {
		super();
		System.out.println("Audi() constructor");
		
	}
	
	String model;
	boolean isEVAvailable;
	
	
	public Audi(String model, boolean isEVAvailable) {
		super();
		this.model = model;
		this.isEVAvailable = isEVAvailable;
		
	}
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, String model, boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isEVAvailable = isEVAvailable;
		
	}
	public void displayAudiDetails(Cars car) {
		
		CarService.carDetails(car);
		System.out.println("Audi Model : " + model);
		System.out.println("Is EV Available : " + isEVAvailable);
	}
	
	public void Car() {
		System.out.println("Car Type - Audi");
	}

	@Override
	public void carDetails() {
		System.out.println("Car ID : " + id);
		System.out.println("Car Name : " + name);
		System.out.println("Car Price : £" + price);
		System.out.println("Car EngineCC : " + engineCC);
		System.out.println("Car fuelType : " + fuelType);
		System.out.println("Car manufacturingYear : " + manufacturingYear);
		System.out.println("Audi Model : " + model);
		System.out.println("Is EV Available : " + isEVAvailable);
	}
}

