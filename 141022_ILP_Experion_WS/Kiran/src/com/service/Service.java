package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Customer;

public class Service {
	String customerName;
	boolean flag;
	Scanner sc = new Scanner(System.in);
	public boolean checkCustomerID(String customerId,ArrayList<Customer> customerList)
	{
		for(Customer customer : customerList)
		{
			if(!customerId.equalsIgnoreCase(customer.getCustomerId()))
			{
				flag = false;
			}
			else
				flag = true;
		}
		return flag;
	}
}
