package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;


public class Service {

	public static Account displayAccount() 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("1.Savings Max Account 2.Current Account 3.Loan Account");
		String accountType = scanner.nextLine();// TODO Auto-generated method stub
		Account account=new Account(accountType, accountType, 0);
		return account;

	}
	
	 public static Account createSavingsAccount(){



	       
			//String customerName;
			System.out.println("Savings"+" created for"+"    "+customerName);
	        System.out.println("Account is Active!!");
	        
	 
			Account account = new Account("SMA001","Savings Max aCCOUN",1000);
	 
	        return account;
	 }
	 public static Account createCurrentAccount(){



	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Customer Code - ");
	        String customerID = scanner.nextLine();
	        System.out.println("Enter Customer Name - ");
	        String customerName = scanner.nextLine();
			System.out.println("Current"+" created for"+"    "+customerName);
	        System.out.println("Account is Active!!");
	        
	 
			Account account = new Account(customerID,0);
	 
	        return account;
	 }
	 public static Account createLoanAccount() throws Exception{



	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Customer Code - ");
	        String customerID = scanner.nextLine();
	        System.out.println("Enter Customer Name - ");
	        String customerName = scanner.nextLine();
			System.out.println("Loan"+" created for"+"    "+customerName);
	        System.out.println("Account is Active!!");
	        
	 
			Account account = new Account(customerID,0);
	 
	        return account;
	 }
	 
	public static ArrayList<Account> depositMoney(ArrayList<Account>accountMoney) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the money to be deposited:");
		int money=scanner.nextInt();		
		for (Account account:accountMoney) 
		{
			double accountBalance=account.getAccountBalance()+money ;
	}
		return accountMoney;
	}
	public static ArrayList<Account> withdrawMoney(ArrayList<Account>accountMoney) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the money to withdraw:");
			int money=scanner.nextInt();		
			for (Account account:accountMoney) 
			{
				double accountBalance=account.getAccountBalance()-money ;
		}
			return accountMoney;


}
}