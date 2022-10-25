package com.ilpexperion.BasicProgamming;

import java.util.Scanner;

public class TableScanner {

	public static void main(String[] args) {
		
		
		Scanner scanner =new Scanner(System.in); 
		String trainingProgram = "*******Welcome to ILP Program*******\n";// TODO Auto-generated method stub
		String employeeName;
		int employeeAge;
		char employeeSex;
		double employeeCgpa;
		
		System.out.println("Enter Your employee name-");
		employeeName=scanner.nextLine();
		
		System.out.println("Enter Your employee Age-");
		employeeAge=scanner.nextInt();
		
		System.out.println("Enter Your employee Sex-");
		employeeSex=scanner.next().charAt(0);
		
		System.out.println("Enter Your employee Cgpa-");
		employeeCgpa=scanner.nextDouble();
		
		System.out.println(trainingProgram);
		System.out.println("Name" + "			" + "Age" + "		" + "Sex" + "		" + "Cgpa");
		System.out.println(employeeName + "		" + employeeAge + "		" + employeeSex + "		" + employeeCgpa);

	}

}
