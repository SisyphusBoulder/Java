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
	void displayAudiDetails() {
		
		carDetails();
		System.out.println("Audi Model : " + model);
		System.out.println("Is EV Available : " + isEVAvailable);
	}
}

