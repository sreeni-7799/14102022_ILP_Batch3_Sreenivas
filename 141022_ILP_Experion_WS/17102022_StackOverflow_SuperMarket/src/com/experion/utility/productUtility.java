package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class productUtility {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        int choice;
        int x;
        System.out.println("********SUPER MARKET MANAGEMENT**************");
        do {
            System.out.println("MENU\n 1.ADD STOCK\n 2.DISPLAY STOCK\n 3.EXIT");
            System.out.println("Enter Choice =");
            choice=scanner.nextInt();
            switch(choice) {
            case 1:
                service.inpuutProductDetails();
                break;
            case 2:
                service.displayProductDetails();
                break;
            default:System.out.println("Invalid Choice");
                break;
            }
            System.out.println("Do you want to continue? yes=1/no=0");
                x=scanner.nextInt();    
        }while(x==1);
		// TODO Auto-generated method stub

	}

}
