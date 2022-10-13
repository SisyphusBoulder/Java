package com.qa.java.oop.features.interfaces;

public class Audi extends CarProperties implements ICar{
	

	String model;
	boolean isEVAvailable;
	
	
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear, String model, boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isEVAvailable = isEVAvailable;
		
	}
	/*public void displayAudiDetails(CarProperties car) {
		
		CarService.carDetails(car);
		System.out.println("Audi Model : " + model);
		System.out.println("Is EV Available : " + isEVAvailable);
	}*/
	
	@Override
	public String carType() {
		return "Car Type - Audi";
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

