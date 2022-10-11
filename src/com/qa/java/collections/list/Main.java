package com.qa.java.collections.list;

public class Main {

	public static void main(String[] args) {

		
		ProductServices.getProductInfo();
		
		System.out.println("Cheapest Product : " + ProductServices.getCheapestProduct());
		
		System.out.println("Dearest Product : " + ProductServices.getDearestProduct());
		
		System.out.println("Highest Rated Product : " + ProductServices.getHighestRating());

	}

}