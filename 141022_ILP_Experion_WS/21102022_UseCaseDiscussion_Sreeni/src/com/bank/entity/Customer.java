package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private String customerID;
	private ArrayList<Account> accountList;
	public Customer(String customerName, String customerID, ArrayList<Account> accountList) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
		this.accountList = accountList;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	
	

}
