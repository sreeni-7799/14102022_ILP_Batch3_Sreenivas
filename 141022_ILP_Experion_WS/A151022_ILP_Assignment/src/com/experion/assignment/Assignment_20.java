package com.experion.assignment;

import java.time.LocalDate;
import java.util.Scanner;

public class Assignment_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Product Code - ");
		Scanner scanner=new Scanner(System.in);
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();

		LocalDate date = LocalDate.now(); 
		LocalDate valid = LocalDate.of(2022, 05, 06); 
		LocalDate expiry = LocalDate.of(2023, 05, 06);
		
		if(date.isAfter(valid)&&date.isBefore(expiry)) {
			System.out.println("Purchase success");
			
		}
		else {
			System.out.println("Purchase not success");
		}
	}

}
