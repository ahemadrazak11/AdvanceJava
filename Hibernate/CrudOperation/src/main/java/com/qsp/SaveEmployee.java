package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	
	public static void main(String[] args) {
		
		   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		   EntityManager entityManager = entityManagerFactory.createEntityManager();
		   EntityTransaction transaction = entityManager.getTransaction();
		   
		   Employee emp1 = new Employee();
		   emp1.setId(100);
		   emp1.setName("Ahemad");
		   emp1.setSal(9000.5);
		   emp1.setMobile(9067831610l);
		   emp1.setEmail("abc@gmail.com");
		   
		   Employee emp2 = new Employee();
		   
		   emp2.setId(101);
		   emp2.setName("Raza");
		   emp2.setSal(9110.5);
		   emp2.setMobile(9977886655l);
		   emp2.setEmail("xyz@gmail.com");
					
		   transaction.begin();
		   entityManager.persist(emp1);
		   entityManager.persist(emp2);
		   transaction.commit();
	}

}
