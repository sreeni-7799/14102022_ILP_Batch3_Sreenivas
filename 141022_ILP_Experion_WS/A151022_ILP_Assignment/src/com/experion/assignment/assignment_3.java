package com.experion.assignment;

import java.util.Scanner;

public class assignment_3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int count = 0;
		int flag=0;
		int sum=0;
		System.out.println("Enter the number:");
		count=scanner.nextInt();
		for (int integer=1;integer<=count;integer+=2) {
			
			flag=flag+1;
			if(flag%2==0) {
				
				sum=sum-integer;
			}else {
				sum=sum+integer;
			}
		}System.out.println("Sum : "+sum);

	}

}
