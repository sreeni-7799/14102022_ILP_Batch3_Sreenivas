package com.experion.assignment;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {
		
		int range;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range");
		range = scanner.nextInt();
		int patternValue = 1;
		for (int row = 1; row <= range; row++) {
			for (int value = 1; value <= row; value++) {
				System.out.print(patternValue + "  ");
				patternValue++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}