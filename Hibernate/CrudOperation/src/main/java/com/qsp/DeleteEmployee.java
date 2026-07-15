package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Employee employee = entityManager.find(Employee.class, 101);
		
		if(employee != null)
		{
			transaction.begin();
			entityManager.remove(employee);
			transaction.commit();
		}
		else {
			System.out.println("Not found...!");
		}
		
		
		
		
	}

}
