package com.qa.java.arrays;

public class Product {

	int id;
	String name;
	float price;
	String category;
	char rating;
	float discountPercentage;
	boolean isAvailable;
	
	static String sellerName = "Sainsbury's";
	static String sellerNumber = "07898564230";
	static String sellerEmail = "cs@sainsburys.co.uk";

	
	
	//No Arg
	Product() {
		
		id = 001;
		name = "product";
		price = 9.99f;
		category = "generic";
		rating = 'C';
		discountPercentage = 5;
		isAvailable = true;
	}
	
	//Args
	public Product(int id, String name, float price, String category, char rating, float discountPercentage,
			boolean isAvailable) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	void getProductInfo() {
		
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Price : £" + price);
		System.out.println("Category : " + category);
		System.out.println("Ratong : " + rating);
		System.out.println("Discount Percentage : " + discountPercentage + "%");
		System.out.println("Available : " + isAvailable);
		System.out.println("Discounted Price : " + discountPrice());
	}
	
	float discountAmount() {
		
		return price * (discountPercentage/100);
	}
	
	float discountPrice() {
		
		return price - discountAmount();
	}
	
	static void getSellerInfo() {
		
		System.out.println("Seller Name : " + sellerName);
		System.out.println("Seller Number : " + sellerNumber);
		System.out.println("Seller Email : " + sellerEmail);
	}

}
