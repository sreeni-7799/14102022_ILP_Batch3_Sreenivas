package com.experion.assignment;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range:");
		int range=scanner.nextInt();
		int value=1;
		int position=1;
		double seriesSum = 0;
		for(int count=1;count<range;count++) {
			if(position%2==0) {
				seriesSum= (seriesSum-Math.pow(value, 3));
				}
			else {
				seriesSum=seriesSum+Math.pow(value, 3);
			}
			value+=2;
			position+=1;
		}
		System.out.println("the series sum is : "+seriesSum);
		}
}
