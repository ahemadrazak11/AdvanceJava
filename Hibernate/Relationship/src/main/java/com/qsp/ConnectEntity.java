package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnectEntity {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	
	Car car = entityManager.find(Car.class, 101);
	Engine engine = entityManager.find(Engine.class, 102);
	
	if(car != null && engine != null) {
		car.setEngine(engine);
		
		transaction.begin();
		entityManager.merge(car);
		transaction.commit();
	}
}
}
