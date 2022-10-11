package com.qa.java.io;

public class Main {

	public static void main(String[] args) {

		
		ProductService.getProductInfo();
		
		System.out.println("Cheapest Product : " + ProductService.getCheapestProduct());
		
		System.out.println("Dearest Product : " + ProductService.getDearestProduct());
		
		System.out.println("Highest Rated Product : " + ProductService.getHighestRating());

	}

}
