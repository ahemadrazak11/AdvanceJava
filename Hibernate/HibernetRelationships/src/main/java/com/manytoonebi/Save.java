package com.manytoonebi;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Save {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raza");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Student student = new Student();
		student.setName("Allen");
		student.setMobile(9067831610l);
		
		
		Subject subject = new Subject();
		subject.setName("Java");
		subject.setAuthor("James");
		subject.setStudent(student);
		
		Subject subject2 = new Subject();
		subject2.setName("SQL");
		subject2.setAuthor("Rymond");
		subject2.setStudent(student);
		
		ArrayList<Subject> list = new ArrayList<>();
		list.add(subject);
		list.add(subject2);
		
		
		student.setSubject(list);
		
		transaction.begin();
		entityManager.persist(subject);
		entityManager.persist(subject2);
		entityManager.persist(student);
		transaction.commit();
		
	}
}
