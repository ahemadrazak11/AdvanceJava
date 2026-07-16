package com.crud;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		IService service = new Service();
		
		while (num != 10) {
			
			System.out.println("===========================================");
			System.out.println("1. Save");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Get By All Data");
			System.out.println("5. Get By ID");
			System.out.println("6. Get By Name");
			System.out.println("7. Get By Mobile & Email");
			System.out.println("8. Find Salary Greather Than");
			System.out.println("9. Fnd Salary Less Than");
			System.out.println("10. Exit");
		System.out.print("Select the Options: ");
		num=sc.nextInt();	
		switch (num) {
		case 1:			
			service.save();
			break;
			
		case 2:
			System.out.println("Update");
			break;
			
		case 3:
			System.out.println("Delete");
			break;
		
		case 4:
			System.out.println("Get All Data");
			break;
			
		case 5:
			System.out.println("Get By ID");
			break;
			
		case 6:
			System.out.println("Get By Name");
			break;
			
		case 7:
			System.out.println("Get By Mobile & Email");
			break;
			
		case 8:
			System.out.println("Greather Than Salary");
			break;
			
		case 9:
			System.out.println("Less Than Salary");
			break;

		default:
			System.out.println("Invalid Input");
		
			break;
		}
		
		System.out.println("===========================================");
	}
		
		System.out.println("Exit Successfully...!");
		
}

}
