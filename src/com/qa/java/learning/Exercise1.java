package com.qa.java.learning;

public class Exercise1 {

	public static void main(String[] args) {
		
		float johnSalary;
		johnSalary = 35000f;
		
		float percentIncrease;
		percentIncrease = 0.105f;
		
		float johnIncrease;
		johnIncrease = johnSalary * percentIncrease;
		
		float johnTotal;
		johnTotal = johnSalary + johnIncrease;
		
		System.out.println("Increase in Salary : £" + johnIncrease);
		
		System.out.println("Total new Salary : £" + johnTotal);
		
		float applePrice;
		applePrice = 3.25f;
		
		float chickenPrice;
		chickenPrice = 7.25f;
		
		float bananaPrice;
		bananaPrice = 1.25f;
		
		float appleDiscount;
		appleDiscount = 0.1f;
		
		float chickenDiscount;
		chickenDiscount = 0.08f;
		
		float bananaDiscount;
		bananaDiscount = 0.03f;
		
		System.out.println("Apple after discount : £" + (applePrice - (applePrice * appleDiscount)));
		
		System.out.println("Chicken Fillets after discount : £" + (chickenPrice - (chickenPrice * chickenDiscount)));
		
		System.out.println("Banana after discount : £" + (bananaPrice - (bananaPrice * bananaDiscount)));

	}

}
