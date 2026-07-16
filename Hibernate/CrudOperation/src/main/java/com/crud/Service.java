package com.crud;

import com.qsp.Employee;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.Employee;

interface IService{
	
	public void save();
//	void update();
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
	   
	   
	
}
