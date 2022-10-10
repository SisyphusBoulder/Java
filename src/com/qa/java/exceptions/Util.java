package com.qa.java.exceptions;

import com.qa.java.oop.*;

public class Util {
	
	
	public static int div(int no1, int no2) {
		
		return no1/no2;
	}
	
	public static void getProductDetails(Product product) throws ProductNotFoundException{
		if(product != null) {
			product.getProductInfo();
		}
		else {
			throw new ProductNotFoundException("Product is null!");
		}
	}
	
	public static Product getProductByID(int id, Product[] products) throws ProductNotFoundException{
		Product product = null;
		for(Product p : products) {
			if (p.id == id) {
				product = p;
			}
		}
		//product = new Product(001, "chicken", 5.01f, "poultry", 'B', 10f, true);
		if(product == null) 
			throw new ProductNotFoundException("This product does not exist!");
		
		return product;
		
	}

	public static void main(String[] args) {
		
		Product[] products = {new Product(001, "chicken", 5.01f, "poultry", 'B', 10f, true), 
				  new Product(002, "steak", 8.52f, "beef", 'A', 8f, false), 
				  new Product(003, "tuna", 3.27f, "fish", 'A', 15f, true)};
		//Product product1 = new Product(001, "chicken", 5.01f, "poultry", 'B', 10f, true);
		try
			{Product product1 = getProductByID(2, products);
			getProductDetails(product1);
			}
		catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(div(100, 0));
		}
		catch(ArithmeticException ex){
			System.out.println("Can't divide by 0, choose another number!");
		}
		//catch(NullPointerException ex) {
		//	System.out.println("Product does not exist - null value!");
		//} 
		
		

	}

}
