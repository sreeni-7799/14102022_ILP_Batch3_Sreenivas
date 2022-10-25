package com.experion.assignment;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1^3+2^3+5^3+....n^3 *******\n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range=scanner.nextInt();
		int number1 = 1;
		int number2 = 2;
		int number3=number1+number2;
		double seriesSum=0;
		seriesSum=Math.pow(number1, 3)+Math.pow(number2, 3);
		for(int count=3;count<range;count++) {
			number1=number2;
			number2=number3;
			number3=number1+number2;
			seriesSum=seriesSum+Math.pow(number2, 3);
		}
		System.out.println("Series sum:" + seriesSum);

}
}

