package com.experion.entity;

import java.util.ArrayList;

public class Customer{
	
	private String customerID;
	private String customerName;
	private ArrayList<Account> accountList;
	public Customer() {
		
	}
	public Customer(String accountType, double accountBalance, String customerID,
			String customerName, ArrayList<Account> accountList) {
		super(accountType, customerID, accountBalance);
		this.customerID = customerID;
		this.customerName = customerName;
		this.accountList = accountList;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	
	
	
	
	
}
