package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.BankService;

public class ProductUtility {

	public static void main(String[] args) {
		int choice;
		Scanner scanner=new Scanner(System.in);
		ArrayList<Product>productList=new ArrayList<Product>();
		char mainChoice;
		do{
			
			System.out.println("1.Add Cards 2.Add Accounts 3.Buy Product");
			choice=scanner.nextInt();
			switch(choice) {
				
				case 1:productList.add(BankService.createProduct("Cards"));
						break;
				case 2:productList.add(BankService.createProduct("Accounts"));
						break;
				case 3:BankService.displayProductDetails(productList);
						break;
				default:System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue(y/n)-");
			mainChoice=scanner.next().charAt(0);// TODO Auto-generated method stub
		}
		while(mainChoice=='y');
	}

}
