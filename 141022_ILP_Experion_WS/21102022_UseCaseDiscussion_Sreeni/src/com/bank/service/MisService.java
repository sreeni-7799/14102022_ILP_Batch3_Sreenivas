package com.bank.service;

import java.util.Scanner;

public class MisService {
	
	public static int enterAccountChoice() { //to enter the account choice
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which account you want to open\n 1.Savings Max Account\n2.Current Account\n3.Loan Account");
		int customerAccountChoice = scanner.nextInt();
		return customerAccountChoice;
		
	}
	
}
