package com.ilpexperion.ObjectClassBasics;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in); 
		int num1;
		int num2;
		int temp;
		System.out.print("Enter the First Number");
		num1=scanner.nextInt();
		System.out.print("Enter the second Number");
		num2=scanner.nextInt();
		
		System.out.print("Before Swapping\nNumber1:" +num1+"\tNumber2:"+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.print("After Swapping\nNumber1:" +num1+"\t9Number2:"+num2);
		
		
		
		
	}

}
