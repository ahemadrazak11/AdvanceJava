package com.cachemechanism;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CachMemoryMechanism {

	public static void main(String[] args) {
		
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raza");
		 EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		 
		
		 
		 // for same entity manager qurey is written only first time. (this is for first level cahch only.)
		CachMemory r1 = entityManager1.find(CachMemory.class, 1);
		
		System.out.println("first time record print from database = " + r1);
		
		CachMemory r2 = entityManager1.find(CachMemory.class, 1);
		
		System.out.println("second time record print from first level cache = " + r2);
		
		System.out.println("=================================================");
		
		// for this entity manger query is written for first time because it is different entity manager. (this is for first level cahch only.)
		
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		CachMemory r3 = entityManager2.find(CachMemory.class, 1);
		
		System.out.println("third time record print from second level cache = " + r3);
		
		
		
	}
}
