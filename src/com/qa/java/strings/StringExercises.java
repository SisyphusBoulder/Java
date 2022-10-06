package com.qa.java.strings;

public class StringExercises {

	public static void main(String[] args) {
		
		
		String string = "hello how are you";
		
		//Counting the words in the string
		//Using String.split and \\s+ to split along whitespaces
		
		String[] words = string.split("\\s+");
		
		
		
		
		System.out.println("Number of words in string : " + words.length);
		
		String[] emails = {"abc_gmail.com", "abcd*()@gmail.com", "test_123@gmail.com", "1234~#$@gmail.com"};

		int[] counter = new int[emails.length];
		
		//List of special characters forbidden in email
		String invalidSpecials = "!£$%^&*()--+=[]{};:#<>,?/";
		
		//list of special characters necessary for email
		//String requiredSpecials = "@.";
		
		int invalid = 0;
		
		int j = 0;
		
		for (String email : emails) {
			
			
			for(int i = 0; i < email.length(); i++) {
				
				char character = email.charAt(i);
				
				if((invalidSpecials.contains(Character.toString(character)))){
					
					invalid++;
					counter[j] = 1;
					break;
				}
				
			
			}
			
			if (!email.contains("@") ||  !email.contains(".")){
				
				invalid++;
				counter[j] = 1;
			}
			j++;	

		}
		
		j = 0;
		
		System.out.println("Number of valid emails : " + (emails.length - invalid));
		
		System.out.println("Number of invalid emails : " + invalid);
		
		for(int count : counter) {
			
			
			if(count == 0) {
				
				System.out.println("Valid Email : " + emails[j]);
				
			}
			
			else {
				
				System.out.println("Invalid Email : " + emails[j]);
			}
			
			j++;
		}

	}

}
