package com.fetchtype;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("raza").createEntityManager();

		Car car = entityManager.find(Car.class, 1);
		
		System.out.println(car);
	}
}
