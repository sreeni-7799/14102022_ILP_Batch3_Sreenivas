package com.experion.assignment;

import java.util.Scanner;

public class Assignment_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=scanner.nextInt();
		int firstNumber=0;
		int secondNumber=1;
		System.out.println(firstNumber+" " +secondNumber);
		for(int count=3;count<=range;count++) {
			int thirdNumber=firstNumber+secondNumber;
			System.out.println(thirdNumber);
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			}
		}

}
