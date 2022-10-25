package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;



public class Service {

	static Product product[] = new Product[3];
	static int index=0;
	public static void inpuutProductDetails() {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Proudct Code - ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name - ");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Description - ");
			String productDescription = scanner.nextLine();
			System.out.println("Enter Product Price - ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter Product Open Date - ");
			String openDate = scanner.nextLine();
			System.out.println("Enter Product Valdity Date - ");
			String validityDate = scanner.nextLine();
			System.out.println("Enter Product Expiry Date - ");
			String expiryDate = scanner.nextLine();
			System.out.println("Active (true or false) - ");
			boolean active = scanner.nextBoolean();

			product[index] = new Product(productCode, productName, productDescription, productPrice, openDate, validityDate,
					expiryDate, active);
			index++;

	

	}
	

	public static void displayProductDetails() {
		System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price");
		
		
		for (int index = 0; index < 3; index++) {
			if(product[index]!=null)
			{
				System.out.println(product[index].getProductName() + "				" + product[index].getProductDescription()
						+ "				" + product[index].getProductPrice());}
			
			}
			
		
	}

}
