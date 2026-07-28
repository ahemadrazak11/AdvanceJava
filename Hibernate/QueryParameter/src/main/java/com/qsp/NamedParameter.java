package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class NamedParameter {

	public static void main(String[] args) {
		
EntityManager entityManager = Persistence.createEntityManagerFactory("raza").createEntityManager();
		
		javax.persistence.Query query = entityManager.createQuery("select s from Student s where s.name =: name");
		
		
		query.setParameter("name", "Ahemad Raza");
		
		List list = query.getResultList();
		
		list.stream().forEach(n -> System.out.println(n));
	}
}
