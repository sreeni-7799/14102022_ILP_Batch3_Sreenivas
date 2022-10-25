package com.ilp.basicprogrammingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class BasicProgrammingQuestion11 {

	public static void main(String[] args) {
		System.out.println(
				"\n***** PROGRAM TO COUNT THE FREQUENCY OF AN ELEMENT IN AN ARRAY:******* \n\n");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int rangeVariable = scanner.nextInt();
		int numbers[] = new int[rangeVariable];

		System.out.println("Enter the array elements numbers");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = scanner.nextInt();
		}

		Arrays.sort(numbers);
		System.out.println("Enter the element whose frequency is to be found");
		int inputElement = scanner.nextInt();
		int frequencyCount = 0;
		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] == inputElement)

				frequencyCount++;

		}
		if (frequencyCount == 0)
			System.out.println("Element not found in array");
		else
			System.out.println(inputElement + "   occurs    " + frequencyCount + "  times");
	}
	// TODO Auto-generated method stub

}
