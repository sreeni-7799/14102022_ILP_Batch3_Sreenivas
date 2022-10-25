package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.AccountCardService;

public class Account extends Product implements AccountCardService{
	
	private String accountType;
	private double  amountBalance;
	
	

	public Account(String productName, String accountType, double amountBalance) {
		super(productName);
		this.accountType = accountType;
		this.amountBalance = amountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmountBalance() {
		return amountBalance;
	}

	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}

	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of account class called");// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance Check Initiated");
	}

	@Override
	public void cashWithdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Cash withrawal Initiated");
	}
	
	
	
	
	
}
