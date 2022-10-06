package com.qa.java.learning;

public class Exercise2 {

	public static void main(String[] args) {
		
		int number;
		number = 225485;

		System.out.println("Original Number : " + number);
		
		int sum;
		sum = 0;
		
		int reverse;
		reverse = 0;
		
		while (number > 1) {
			
			int digit = number % 10;
			
			sum += digit;
			
			
			reverse = (reverse * 10) + digit;
			
			
			number /= 10;
		}
		
		
		
		System.out.println("Sum : " + sum);
		
		System.out.println("Reversed Number : " + reverse);
	}

}
