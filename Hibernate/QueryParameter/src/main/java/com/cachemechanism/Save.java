package com.cachemechanism;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raza");
				 EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		CachMemory c1 = new CachMemory();
		c1.setName("Khan");
		
		
		transaction.begin();
		entityManager.persist(c1);
		transaction.commit();
		
		
	}
}
