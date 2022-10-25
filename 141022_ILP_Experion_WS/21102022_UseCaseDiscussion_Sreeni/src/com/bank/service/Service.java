package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;

public class Service {
	
	public static Account createAccount(int customerAccountChoice) {
		
		Account account = null;
		if(customerAccountChoice==1)
		{
			account = new Account("Savings Max Account",1000);
		}															//creating account that use wants
		else if(customerAccountChoice==2)
		{
			account = new Account("Current Account",1000);
		}
		else if(customerAccountChoice==3)
		{
			account = new Account("Loan Account",0);
		}
		
		return account;
		
		
	}
	public static Customer createCustomer(ArrayList<Account> accountList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		String customerId = scanner.nextLine();							//Creating of customers
		System.out.println("Enter Customer Name: ");
		String customerName = scanner.nextLine();
		Customer customer = new Customer(customerId,customerName,accountList);
		return customer;
	}
	public static void depositMoney(Customer customer) {
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Select the account you want to deposit money - ");		//Code to deposit money into the account
		String account = scanner.nextLine();
		System.out.println("Enter the amount to be deposited - ");
		double depositMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
			{
				
				selectedAccount.setAccountBalance(selectedAccount.getAccountBalance()+depositMoney);
			}
		
		
	}
	
	public static void displayAccountDetails(ArrayList<Account> accountList, Customer customer ) {//program to display the account details
		
		System.out.println("$$$$$$$$$************ Customer-Account Details***********8 $$$$$$$$$");
		System.out.println(" ");
		System.out.println("Customer ID"+"     "+"Customer Name"+"     "+"Account Type"+ "     "+"Account Balance");
	
		for(Account account : accountList)
			System.out.println(customer.getCustomerID()+"           "+customer.getCustomerName()+"          "+account.getProductName() + "       "+ account.getAccountBalance());
			
		
	}
	public static void withdrawMoney(Customer customer) { //code to withdraw money from the accounts and updating it
		
		ArrayList<Account>customerAccountList = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		customerAccountList = customer.getAccountList();
		System.out.println("Account Name " + "     "+"Account Balance");
		for(Account account : customerAccountList)
			System.out.println(account.getProductName() + "     "+ account.getAccountBalance());
			
		System.out.println("Select the account you want to withraw money - ");
		String account = scanner.nextLine();
		System.out.println("Enter the amount to withraw - ");
		double withdrawMoney = scanner.nextDouble();
		for(Account selectedAccount : customerAccountList)
			if(selectedAccount.getProductName().compareTo(account)==0)
			{
				if(selectedAccount.getAccountBalance()<=1000) {
					System.out.println("Minimum Balance in your account.Cannot Withdraw money!!");
				}
				else{
					if(selectedAccount.getAccountBalance()<= withdrawMoney) {
						System.out.println("Please withdraw the maximum amount");
					}
					else {
						selectedAccount.setAccountBalance(selectedAccount.getAccountBalance() - withdrawMoney);
			}
		
		
	}
	}

}
}
