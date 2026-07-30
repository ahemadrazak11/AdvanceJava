package com.cascading;


import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Cascading {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("raza_cascading").createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
//		Car car = new Car();
//		
//		car.setName("BMW");
//		
//		Engine engine = new Engine();
//		
//		engine.setHp(101.0);
//		
//		//Bidirectional Mapping.
//		
//		engine.setCar(car);
//		car.setEngine(engine);
		
		Students std1 = new Students();
		
		std1.setName("Ahemad");
		std1.setEmail("ahemadrazak3@gmail.com");;
		
		Students std2 = new Students();
		
		std2.setName("Raza");
		std2.setEmail("raza@gmail.com");
	
		Subjects subject1 = new Subjects();
		subject1.setName("java");
		
		Subjects subject2 = new Subjects();
		subject2.setName("SQL");;
		
		

		List<Subjects> list = new ArrayList<>();
		
		list.add(subject1);
		list.add(subject2);
		
		
		subject1.setStudent(std1);
		subject1.setStudent(std2);
		
		std1.setSubjects(list);
		std2.setSubjects(list);
		
		
		transaction.begin();
		entityManager.persist(std1);
		entityManager.persist(std2);
		transaction.commit();
	}

}
