package com.experion.assignment;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int number[]=new int[size];
		
		System.out.println("Enter the elements of the array");
		for (int index=0;index<number.length;index++) {
			number[index]=scanner.nextInt();
			}
		int sum=0;
		for(int count=0;count<number.length;count++){
			for(int count1=count+1;count1<number.length;count1++){
				if(number[count]+number[count1]==8){
					sum++;
					System.out.println("Numbers are "+number[count]+" &"+number[count1]);
					break;
				}
			}
		}
		if(sum==0) {
			System.out.println("No elements add upto 8");
		}
	}

}
