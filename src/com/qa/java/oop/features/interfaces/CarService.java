package com.qa.java.oop.features.interfaces;

public class CarService{
	
	public void carDetails(ICar car) {
		
		car.carDetails();
	}


	public String carType(ICar car) {
		return car.carType();
		
	}

}
