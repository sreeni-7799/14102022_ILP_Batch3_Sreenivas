package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.AccountCardService;

public class Card extends Product implements AccountCardService {

	private String loanNumber;
	private double loanAmount;

	public Card(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of Card class called");/// TODO Auto-generated method stub
		
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
