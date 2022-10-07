package com.qa.java.arrays;

public class Exercise {

	public static void main(String[] args) {
		
		
		int[] numbers;
		numbers = new int[8];
		
		numbers[0] = 1;
		numbers[1] = 6;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 3;
		numbers[5] = 9;
		numbers[6] = 15;
		numbers[7] = 0;
		
		int sum = Util.arraySum(numbers);
		
		System.out.println("Sum : " + sum);
		
		Util.arraySmallest(numbers);
		
		Util.arrayBiggest(numbers);
		
		
		Product[] products = {
				
				new Product(001, "Chicken", 5.01f, "Poultry", 'D', 10f, true),
				new Product(002, "Steak", 8.72f, "Beef", 'B', 8f, false),
				new Product(003, "Tuna", 3.34f, "Fish", 'A', 12f, true),
				new Product(004, "Apple", 0.75f, "Fruit", 'C', 20f, true),
				new Product(005, "Broccoli", 0.94f, "Vegetable", 'V', 14f, false)
		};
		
		String cheap = Util.cheapestProduct(products);
		
		System.out.println("Cheapest Item : " + cheap);
		
		String dear = Util.dearestProduct(products);
		
		System.out.println("Dearest Item : " + dear);
		
		String rate = Util.highestRating(products);
		
		System.out.println("Highest Rated Item : " + rate);
	}

}
