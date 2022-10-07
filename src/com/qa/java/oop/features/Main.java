package com.qa.java.oop.features;

public class Main {

	public static void main(String[] args) {
		Audi audi = new Audi(2, "Audi", 59999f, 300, "Diesel", 2014, "R8", false);
		audi.displayAudiDetails(audi);
		
		BMW BMW = new BMW(33, "BMW", 44999f, 250, "Petrol", 2008, 8, 6000);
		BMW.displayBMWDetails(BMW);


	}

}
