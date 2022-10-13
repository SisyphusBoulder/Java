package com.qa.java.collections.list;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		
		productService.getProductInfo();
		
		System.out.println("Cheapest Product : " + productService.getCheapestProduct());
		
		System.out.println("Dearest Product : " + productService.getDearestProduct());
		
		System.out.println("Highest Rated Product : " + productService.getHighestRating());

	}

}