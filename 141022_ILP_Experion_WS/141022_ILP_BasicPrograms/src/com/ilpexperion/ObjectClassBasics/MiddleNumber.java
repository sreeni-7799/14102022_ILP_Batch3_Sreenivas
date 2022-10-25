package com.ilpexperion.ObjectClassBasics;

import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int FirstNumber;
		int SecondNumber;
		int ThirdNumber;
		
		System.out.println("Enter the First number:");
		FirstNumber=scanner.nextInt();
		System.out.println("Enter the Second number:");
		SecondNumber=scanner.nextInt();
		System.out.println("Enter the Third number:");
		ThirdNumber=scanner.nextInt();
		
		if((FirstNumber<SecondNumber) && (FirstNumber>ThirdNumber)) || ((FirstNumber<ThirdNumber)&&(FirstNumber>SecondNumber))
		{
			System.out.println("Second Smallest is:" + FirstNumber);// TODO Auto-generated method stub
		}
		
		else if((SecondNumber<FirstNumber) && (SecondNumber>ThirdNumber)) || ((SecondNumber<ThirdNumber)&&(SecondNumber>FirstNumber))
		{
			System.out.println("Second Smallest is:" + SecondNumber);// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("Second Smallest is:" + ThirdNumber);
		}

	}

}
