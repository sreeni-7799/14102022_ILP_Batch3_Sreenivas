package com.experion.entity;

public class Account 
{
	
	private String accountType;
	private String customerID;
	private double accountBalance;
	public Account(String accountType,String customerID, double accountBalance) {
		this.accountType = accountType;
		//this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
	

}
