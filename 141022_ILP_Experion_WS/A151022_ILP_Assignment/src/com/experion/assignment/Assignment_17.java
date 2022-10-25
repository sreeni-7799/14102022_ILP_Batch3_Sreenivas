package com.experion.assignment;

import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter String");
		String input = scanner.nextLine();
		if (input.isEmpty())
			System.out.println("String is empty");
		else {
			String[] wordArray = input.split("\\s+");
			System.out.println("The number of words in the entered string is\n" + wordArray.length);
		}

	}
	}


