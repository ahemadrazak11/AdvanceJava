package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Review review = entityManager.find(Review.class, 2);
		
		if(review != null) {
			
			
			
			transaction.begin();
			entityManager.remove(review);
			transaction.commit();
		}
		
		Product product = entityManager.find(Product.class, 2);
		
		if(product != null) {
			// Task is to remove the product.
			
			
		}
		
		
	}
}
