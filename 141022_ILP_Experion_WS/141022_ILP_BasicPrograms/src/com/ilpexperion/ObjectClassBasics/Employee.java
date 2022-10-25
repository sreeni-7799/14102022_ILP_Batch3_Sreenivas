package com.ilpexperion.ObjectClassBasics;

public class Employee {
	
	String employeeName = "Sreenivas";
	int employeeAge = 23;
	char employeeSex = 'M';
	double employeeCgpa = 9.5;
	
	public void displayEmployeeDetails() {
		System.out.println("*******Welcome to ILP Program*******\n");
		System.out.println("Name" + "			" + "Age" + "		" + "Sex" + "		" + "Cgpa");
		System.out.println(employeeName + "		" + employeeAge + "		" + employeeSex + "		" + employeeCgpa);

	}

}
