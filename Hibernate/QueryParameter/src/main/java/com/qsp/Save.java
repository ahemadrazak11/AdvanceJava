package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("raza").createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Student student = new Student();
		
		
		// Save Operation
		
		student.setName("Zaid");
		student.setEmail("zaid@gmail.com");
		
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
	}
}
