package com.experion.assignment;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		
		int rangeVariable;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range");
		rangeVariable = scanner.nextInt();
		for (int row = 1; row <= rangeVariable; row++) {
			for (int value = 1; value <= row; value++) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
