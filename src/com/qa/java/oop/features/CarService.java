package com.qa.java.oop.features;

public class CarService {
	
	public static void carDetails(Cars car) {
		
		System.out.println("Car ID : " + car.id);
		System.out.println("Car Name : " + car.name);
		System.out.println("Car Price : £" + car.price);
		System.out.println("Car EngineCC : " + car.engineCC);
		System.out.println("Car fuelType : " + car.fuelType);
		System.out.println("Car manufacturingYear : " + car.manufacturingYear);
	}

}
