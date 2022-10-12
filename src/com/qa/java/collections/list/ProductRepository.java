package com.qa.java.collections.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ProductRepository {
	
	public List<Product> readProductCSVFile(String filepath) {
		List<Product> products = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(filepath)))) {
			System.out.println(br.readLine()); //read header of csv file
			String productData = br.readLine();
			while (productData != null) {
				System.out.println(productData);
				String[] productDataSplit = productData.split(",");
				int id = Integer.parseInt(productDataSplit[0]);
				String name = (productDataSplit[1]);
				float price = Float.parseFloat(productDataSplit[2]);
				String category = (productDataSplit[3]);
				char rating  = productDataSplit[4].charAt(0);
				float discountPercentage = Float.parseFloat(productDataSplit[5]);
				boolean isAvailable = Boolean.parseBoolean(productDataSplit[6]);
				Product product = new Product();
				product.setID(id);
				product.setName(name);
				product.setPrice(price);
				product.setCategory(category);
				product.setRating(rating);
				product.setDiscountPercentage(discountPercentage);
				product.setIsAvailable(isAvailable);
				products.add(product);
				productData = br.readLine();
			
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found! Please check the filename and location!");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("IO Exception! Please check the code and the file!");
			e.printStackTrace();
		}
		
		return products;
		
	}
}