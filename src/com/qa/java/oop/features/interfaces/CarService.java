package com.qa.java.oop.features.interfaces;

public class CarService{
	
	public void carDetails(ICars car) {
		
		car.carDetails();
	}


	public String Car(ICars car) {
		return car.Car();
		
	}

}
