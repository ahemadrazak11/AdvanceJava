package com.crud;

import com.qsp.Employee;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.Employee;

interface IService{
	
	void save();
	void update();
//	void delete();
//	void getById();
//	void getAllData();
//	void getByName();
//	void getByMobile();
//	void findSalGreaterThan();
//	void findSalLessThan();
}

public class Service implements IService{

	
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   EntityTransaction transaction = entityManager.getTransaction();
	   
	   Employee emp1 = new Employee();
	   Scanner sc = new Scanner(System.in);
	   
	   // Insert Operation.
	   @Override
	   public void save() {
		   
		   int id;
			String name;
			double sal;
			long mobile;
			String email;
			
			System.out.println("Enter Employee Details.");
			
			// id
			System.out.print("ID: ");
			id = sc.nextInt();
			
			//name
			System.out.print("Name:");
			sc.nextLine();
			name = sc.nextLine();
			
			// Salary
			System.out.print("Salary: ");
			sal = sc.nextDouble();
			
			// Mobile
			System.out.print("Mobile: ");
			mobile = sc.nextLong();
			
			// Email
			System.out.print("Email: ");
			email = sc.next();
		   
		   emp1.setId(id);
		   emp1.setName(name);
		   emp1.setSal(sal);
		   emp1.setMobile(mobile);
		   emp1.setEmail(email);
		   
		   transaction.begin();
		   entityManager.persist(emp1);
		   transaction.commit();
		   
		   System.out.println("Data Saved");
		
	   }
	   
	  // Update Operation.
	  @Override
	  public void update() {
		  
		  System.out.println("Enter the Employee ID:");
		  int empID = sc.nextInt();
		  
		  Employee employee = entityManager.find(Employee.class, empID);
		  
		  if(employee != null) {
			  
			  	System.out.println("1. Update Name");
				System.out.println("2. Update Salary");
				System.out.println("3. Update Mobile");
				System.out.println("4. Update Email");
				System.out.print("Enter Your Choise: ");
				int num = sc.nextInt();
				
			  switch (num) {
				case 1:	
					
					System.out.print("Enter the Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					employee.setName(name);
					break;
					
				case 2:
					System.out.print("Enter the Salary: ");
					Double sal = sc.nextDouble();
					employee.setSal(sal);
					break;
					
				case 3:
					System.out.print("Enter the Name: ");
					sc.nextLine();
					long mobile = sc.nextLong();
					employee.setMobile(mobile);
					break;
				
				case 4:
					System.out.print("Enter the Name: ");
					sc.nextLine();
					String email = sc.nextLine();
					employee.setName(email);
					break;

				default:
					System.out.println("Invalid Input");
					break;
			  }
			  
			  
			  	transaction.begin();
				entityManager.persist(employee);
				transaction.commit();
				System.out.println("Data Updated Successfully...!");
			}
		  else {
			  System.out.println("Employee Not Found...!");
		  }
	   }
	   
	
}
