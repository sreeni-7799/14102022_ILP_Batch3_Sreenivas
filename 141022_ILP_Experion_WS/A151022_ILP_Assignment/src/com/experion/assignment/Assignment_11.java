package com.experion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int number[]=new int[size];
		
		System.out.println("Enter the elements of the array");
		for (int index=0;index<number.length;index++) {
			number[index]=scanner.nextInt();
			}
		
		Arrays.sort(number);
		System.out.println("Enter the element to find frequency");
		int element=scanner.nextInt();
		int freq=0;
		for(int index=0;index<number.length;index++) {
			if(number[index]==element) {
				freq++;
			}
		if(freq==0) {
			System.out.println("there are no elements");
			
		}
		else {
			System.out.println("Frequency is  "+freq);
		}
		}
		
	}

}
