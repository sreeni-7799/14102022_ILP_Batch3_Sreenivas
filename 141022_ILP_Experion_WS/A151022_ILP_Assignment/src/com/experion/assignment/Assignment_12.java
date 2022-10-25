package com.experion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int number[]=new int[size];
		
		System.out.println("Enter the elements of the array");
		for (int index=0;index<number.length;index++) {
			number[index]=scanner.nextInt();
			}
		System.out.println("numbers before sorting");
		
		for(int temp:number) {
			System.out.println(temp+"  ");
		}
		Arrays.sort(number);
		
		System.out.println("In ascending order");
		for(int count=0;count<number.length;count++) {
			System.out.print(number[count]+" ");
		}
		System.out.println("\nIn descending order");
		for(int count=number.length-1;count>=0;count--) {
			System.out.print(number[count]+" ");
		}
	}

}
