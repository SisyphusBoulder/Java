package com.qa.java.collections.list;

import java.util.List;

public class ProductServices {
	
	static List<Product> products = ProductRepository.readProductCSVFile("C://Mono//ProductCSV.csv");
	
	static void getProductInfo() {
		
		for(Product p : products) {
			System.out.println("ID : " + p.getID());
			System.out.println("Name : " + p.getName());
			System.out.println("Price : £" + p.getPrice());
			System.out.println("Category : " + p.getCategory());
			System.out.println("Ratong : " + p.getRating());
			System.out.println("Discount Percentage : " + p.getDiscountPercentage() + "%");
			System.out.println("Available : " + p.getIsAvailable());
		}
	}
	
	static String getCheapestProduct() {
		
		float small = products.get(0).getPrice();
		String item = products.get(0).getName();
		
		for (Product p : products) {
			
			if (p.getPrice() < small) {
				
				small = p.getPrice();
				
				item = p.getName();
				
			}
				
		}
		return item;
	}
	
	static String getDearestProduct() {
		
		float big = products.get(0).getPrice();
		String item = products.get(0).getName();
		
		for (Product p : products) {
			
			if (p.getPrice() > big) {
				
				big = p.getPrice();
				
				item = p.getName();
			}
		}
		return item;
	}
	
	static String getHighestRating() {
		
		int big = (int)products.get(0).getRating();
		String item = products.get(0).getName();
		
		for (Product p : products) {
			
			if ((int)p.getRating() < big) {
				
				big = (int)p.getRating();
				
				item = p.getName();
				
			}
		}
		
		return item;
	}
}
