package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankingServices;
import com.experion.entity.Cards;
import com.experion.entity.Product;

public class BankService {

	public static Product createProduct(String productType) {
		
		ArrayList<BankingServices>bankingServices=new ArrayList<BankingServices>();
		bankingServices.add(new BankingServices("SOB100","Online Banking"));
		bankingServices.add(new BankingServices("SOB100","Mobile Banking"));
		bankingServices.add(new BankingServices("SOB100","Cash Deposit"));
		Product product = null;
		if (productType.compareTo("Cards") == 0) {

			product = new Cards("PRDMC100", "Master Card", "Cards", "Master");
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("PRDWSA100", "Womens Savings Accounty", "Accounts", "Master",bankingServices);
			//System.out.print(bankingServices.get)
		}
		return product;// TODO Auto-generated method stub

	}

	public static void displayProductDetails(ArrayList<Product>productList) {
		
		Cards cards=null;
		Account account=null;
		
		System.out.println("Product Code"+"    "+"Product Type"+"     "+"Account or Card");
		
		for(Product product:productList) {
			
			if(product instanceof Cards) {
				
				cards=(Cards)product;
				System.out.println(cards.getProductCode()+"    "+cards.getProductName()+"    "+cards.getProductType()+"   "+cards.getCardType());
			}else if(product instanceof Account) {
				account=(Account)product;
				System.out.println(account.getProductCode()+"    "+account.getProductName()+"    "+account.getProductType()+"   "+account.getAccountType());
				for(BankingServices bankingServices:account.getBankServices()) {
					
					System.out.println(bankingServices.getServiceName());
				}
			
			}
		}
	
		// TODO Auto-generated method stub
	}

}
