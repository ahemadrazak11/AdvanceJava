package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		   EntityManager entityManager = entityManagerFactory.createEntityManager();
		   EntityTransaction transaction = entityManager.getTransaction();
		   
		   Student student = new Student();
		   
		  
		   student.setId(102);
		   student.setName("Raza Khan");
		   student.setMobile(9900990099L);
		   
					
		   transaction.begin();
		   entityManager.persist(student);
		   transaction.commit();
	}
		   
}
