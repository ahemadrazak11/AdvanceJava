package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	Car car = entityManager.find(Car.class, 107);
	
	if(car != null)
	{
		Engine engine = car.getEngine();
			 car.setEngine(null);
			   
			   transaction.begin();
			   entityManager.merge(car);
			   entityManager.remove(engine);
			   transaction.commit();
	}
}
}
