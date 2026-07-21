package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = new Product();
			
		
		product.setName("Headphone");
		product.setBrand("OnePlus");
		
		Review r1 = new Review();
		
		r1.setMessage("Good");
		r1.setRating(5);
		r1.setProduct(product);
		
		Review r2 = new Review();
		r2.setMessage("Very Good");
		r2.setRating(6);
		r2.setProduct(product);
		
		Review r3 = new Review();
		r3.setMessage("No Good");
		r3.setRating(10);
		r3.setProduct(product);
		
		
		transaction.begin();
		entityManager.persist(product);
		entityManager.persist(r1);
		entityManager.persist(r2);
		entityManager.persist(r3);
		transaction.commit();
	}
}
