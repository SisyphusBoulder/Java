package com.qa.java.io;

public class ProductService {
	
	
	ProductRepository productRepository = new ProductRepository();
	Product[] products = productRepository.readProductCSVFile("C://Mono//ProductCSV.csv");
	
	 void getProductInfo() {
		
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
	
	 String getCheapestProduct() {
		
		float small = products[0].getPrice();
		String item = products[0].getName();
		
		for (Product p : products) {
			
			if (p.getPrice() < small) {
				
				small = p.getPrice();
				
				item = p.getName();
				
			}
				
		}
		return item;
	}
	
	 String getDearestProduct() {
		
		float big = products[0].getPrice();
		String item = products[0].getName();
		
		for (Product p : products) {
			
			if (p.getPrice() > big) {
				
				big = p.getPrice();
				
				item = p.getName();
			}
		}
		return item;
	}
	
	 String getHighestRating() {
		
		int big = (int)products[0].getRating();
		String item = products[0].getName();
		
		for (Product p : products) {
			
			if ((int)p.getRating() < big) {
				
				big = (int)p.getRating();
				
				item = p.getName();
				
			}
		}
		
		return item;
	}
}
