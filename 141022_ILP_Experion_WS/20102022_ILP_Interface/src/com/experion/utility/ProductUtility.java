package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;
import com.experion.service.AccountService;

public class ProductUtility {

	public static void main(String[] args) {
		/*
		 * Account account = new Account("Womens Savings Account", "ACCE1234", 10000);
		 * AccountService accountService=new AccountService();
		 * accountService.depositCash(account, 2000);
		 * accountService.depositCash(account, 0, "Sreeni7799");
		 * accountService.depositCash(account, "uey6263", 100000);
		 */

		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if (choice == 1) {
			product = new Account("Womens Saving account", "ACC218", 10000);
			Account account = (Account) product;
			account.cashWithdrawal();
			account.checkBalance();
		} else if (choice == 2) {
			product = new Card("Master card", "Card161763", 10000);
			Card card = (Card) product;
			card.cashWithdrawal();
			card.checkBalance();
		} else if (choice == 3) {
			product = new Loan("Home Loan", "MD1000", 10000);
			Loan loan = (Loan) product;
			loan.loanApproval();
			loan.loanDueDate();

		}
		product.checkProductValidity();
	}
}