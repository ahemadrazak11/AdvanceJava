package com.fetchtype;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.Student;

public class Save {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("raza").createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Car car = new Car();
		Engine engine = new Engine();
		
		engine.setHp(10.0);;
		car.setName("Suzuki");
		car.setEngine(engine);
		
		transaction.begin();
		entityManager.persist(car);
		entityManager.persist(engine);
		transaction.commit();
		
		
	}
	
}
