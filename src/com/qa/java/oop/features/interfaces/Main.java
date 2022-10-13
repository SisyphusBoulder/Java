package com.qa.java.oop.features.interfaces;

public class Main {

	public static void main(String[] args) {
		Audi audi = new Audi(2, "Audi", 59999f, 300, "Diesel", 2014, "R8", false);
		
		BMW BMW = new BMW(33, "BMW", 44999f, 250, "Petrol", 2008, 8, 6000);
		
		CarService carService = new CarService();
		
		System.out.println(carService.carType(audi));
		carService.carDetails(audi);
		
		System.out.println(carService.carType(BMW));
		carService.carDetails(BMW);

	}

}
