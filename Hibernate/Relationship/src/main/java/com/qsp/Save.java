package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Engine engine = new Engine();
		
		engine.setId(601);
		engine.setHp(400);
		
		
		Car car = new Car();
		
		car.setId(107);
		car.setName("BMW");
		car.setPrice(970.0);
		car.setEngine(engine);
		
		
		transaction.begin();
		entityManager.persist(engine);
		entityManager.persist(car);
		transaction.commit();
	}
}
