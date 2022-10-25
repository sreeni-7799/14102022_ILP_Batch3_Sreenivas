package com.ilpexperion.ObjectClassBasics;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int number;
		System.out.println("Enter the number:");
		number=scanner.nextInt();
		
		if(number==0)
		{
			System.out.println("Number is 0");
		}
		else if(number%2==0)
		{
			System.out.println("Given NUmber is even");// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("Given NUmber is odd");
		}
	}

}
