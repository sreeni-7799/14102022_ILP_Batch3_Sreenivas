package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.LoanService;

public class Loan extends Product implements LoanService {

	private String cardType;
	private double cardBalance;

	public Loan(String productName, String cardType, double cardBalance) {
		super(productName);
		this.cardType = cardType;
		this.cardBalance = cardBalance;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public double getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of loan class called");/// TODO Auto-generated method stub
		
	}

	@Override
	public void loanDueDate() {
		// TODO Auto-generated method stub
		System.out.println("Loan due date initiated");
	}

	@Override
	public void loanApproval() {
		// TODO Auto-generated method stub
		System.out.println("Loan is approved");
	}

	}
