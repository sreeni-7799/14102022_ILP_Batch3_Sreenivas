package com.experion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int number[]=new int[size];
		
		System.out.println("Enter the elements of the array");
		for (int index=0;index<number.length;index++) {
			number[index]=scanner.nextInt();
			}// TODO Auto-generated method stub
		Arrays.sort(number);
		
		int freq=0;
		for(int count=0;count<number.length;count++) {
			freq=1;
			for(int count1=count+1;count1<number.length;count1++) {
				if(number[count]==number[count1]) {
					freq++;
				}
				else {
					break;
				}
			
			}System.out.print(number[count]+"occurs  "+freq+" times ");
			count+=freq-1;
		}
	}

}
