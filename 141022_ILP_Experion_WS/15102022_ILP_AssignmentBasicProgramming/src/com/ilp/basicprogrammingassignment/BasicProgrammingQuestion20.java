package com.ilp.basicprogrammingassignment;

import java.time.LocalDate;
import java.util.Scanner;

public class BasicProgrammingQuestion20 {

	public static void main(String[] args) throws Exception {
		System.out.println(
				"\n***** PROGRAM TO ENTER PRODUCT DETAILS AND COMPARE PURCHASE DATE WITH VALIDITY DATE:******* \n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();

		LocalDate date = LocalDate.now(); // to read system date
		LocalDate dateValid = LocalDate.of(2022, 05, 06); // to set validity and expiry date of productt
		LocalDate dateExpiry = LocalDate.of(2023, 05, 06);

		if (date.isAfter(dateValid) && date.isBefore(dateExpiry))
			System.out.println("Purchase success!!");
		else
			System.out.println(
					"Purchase not successful because validity date of product is 06/05/2022 and expiry date is 06/05/2023");

	}

}
