package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindEmployee {

	   public static void main(String[] args) {
		   
		   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		   EntityManager entityManager = entityManagerFactory.createEntityManager();
		   EntityTransaction transaction = entityManager.getTransaction();
		   
		   Employee employee = entityManager.find(Employee.class, 101);
		   
		   if(employee != null) {
		   System.out.println(employee.getId());
		   System.out.println(employee.getName());
		   System.out.println(employee.getMobile());
		   System.out.println(employee.getEmail());
		   System.out.println(employee.getSal());
	   }
		   else {
			   System.out.println("ID not found...!");
		   }
}
	   
}
