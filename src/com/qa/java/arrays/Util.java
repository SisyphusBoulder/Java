package com.qa.java.arrays;

public class Util {
	
	static int arraySum(int[] array) {
		
		int sum;
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
			
		}
		
		return sum;
		
	}
	
	static void arraySmallest(int[] array) {
		
		int small = array[0];
		
		for (int a : array) {
			
			if (a < small){
				
				small = a;
			}
		}
		
		System.out.println("Smallest Number : " + small);
	}
	
	static void arrayBiggest(int[] array) {
		
		int big = array[0];
		
		for (int a : array) {
			
			if (a > big){
				
				big = a;
			}
		}
		
		System.out.println("Biggest number : " + big);
	}
	
	static String cheapestProduct(Product[] product) {
		
		float small = product[0].price;
		
		String item = product[0].name;
		
		for (Product p : product) {
			
			if (p.price < small) {
				
				small = p.price;
				
				item = p.name;
				
				
			}
		}
		
		return item;
	}
	
	static String dearestProduct(Product[] product) {
		
		float big = product[0].price;
		
		String item = product[0].name;
		
		for (Product p : product) {
			
			if (p.price > big) {
				
				big = p.price;
				
				item = p.name;
				
				
			}
		}
		
		return item;
	}
	
static String highestRating(Product[] product) {
		
		int big = (int)product[0].rating;
		
		String item = product[0].name;
		
		for (Product p : product) {
			
			if ((int)p.rating < big) {
				
				big = (int)p.rating;
				
				item = p.name;
				
				
			}
		}
		
		return item;
	}

}
