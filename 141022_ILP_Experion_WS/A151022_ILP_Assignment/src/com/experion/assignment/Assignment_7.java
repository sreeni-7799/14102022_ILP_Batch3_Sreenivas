package com.experion.assignment;

import java.util.Scanner;

public class Assignment_7 {

	public double factorial(int count1) {
		double factVariable = 1;
		for (int index = 1; index <= count1; index++) {
			factVariable = factVariable * index;
		}
		return factVariable;
	}

	public void displaySum() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();

		double seriesSum = 0.0;
		for (int count = 1; count <= rangeVariable; count++) {
		
			seriesSum = seriesSum + (count / factorial(count*count));
			
		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

	}


	public static void main(String[] args) {
		
		Assignment_7 fact = new Assignment_7();
		fact.displaySum();
		
		// TODO Auto-generated method stub

	}


}

