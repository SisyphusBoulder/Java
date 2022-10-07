package com.qa.java.oop.features;

abstract public class Cars {

	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufacturingYear;
	
	public Cars() {
		
		System.out.println("Cars() constructor");
	}
	

	public Cars(int id, String name, float price, int engineCC, String fuelType, int manufacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}



	abstract public void carDetails();
	
	/*{

		System.out.println("Car ID : " + id);
		System.out.println("Car Name : " + name);
		System.out.println("Car Price : £" + price);
		System.out.println("Car EngineCC : " + engineCC);
		System.out.println("Car fuelType : " + fuelType);
		System.out.println("Car manufacturingYear : " + manufacturingYear);
	}*/
	
	abstract public String Car();
	
	/*{
		
		System.out.println("Car Make - Car");
	}*/
}