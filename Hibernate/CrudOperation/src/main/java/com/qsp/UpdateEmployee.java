package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		   
		   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		   EntityManager entityManager = entityManagerFactory.createEntityManager();
		   EntityTransaction transaction = entityManager.getTransaction();		   

		   Employee employee = entityManager.find(Employee.class, 105);
		   
		   if(employee != null) {
			   
			   employee.setName("Khan");
			   employee.setEmail("khan@gmail.com");
			   
			   transaction.begin();
			   entityManager.merge(employee);
			   transaction.commit();
			   
			   
			   System.out.println(employee.getId());
			   System.out.println(employee.getName());
			   System.out.println(employee.getMobile());
			   System.out.println(employee.getEmail());
			   System.out.println(employee.getSal());
	   }
		   else {
			   System.out.println("Employee not found...!");
		   }
	}
}
