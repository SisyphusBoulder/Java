package com.qa.java.collections.list;

public class Main {

	public static void main(String[] args) {

		ProductServices productServices = new ProductServices();
		
		productServices.getProductInfo();
		
		System.out.println("Cheapest Product : " + productServices.getCheapestProduct());
		
		System.out.println("Dearest Product : " + productServices.getDearestProduct());
		
		System.out.println("Highest Rated Product : " + productServices.getHighestRating());

	}

}