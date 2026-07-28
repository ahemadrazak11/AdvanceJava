package com.qsp;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PositionParameter {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("raza").createEntityManager();
		
		javax.persistence.Query query = entityManager.createQuery("select s from Student s where s.name = ?1");
		
		
		query.setParameter(1, "Zaid");
		
		List list = query.getResultList();
		
		list.stream().forEach(n -> System.out.println(n));
		
	}
}
