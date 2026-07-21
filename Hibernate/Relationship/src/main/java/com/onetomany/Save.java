package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		Subject subject1 = new Subject();
		subject1.setName("Core Java");
		subject1.setAuthor("James");
		subject1.setPrice(999.0);

		Subject subject2 = new Subject();
		subject2.setName("SQL");
		subject2.setAuthor("Raymond Boyce");
		subject2.setPrice(599.0);

		Subject subject3 = new Subject();
		subject3.setName("Web Tech");
		subject3.setAuthor("Yashwant Sir");
		subject3.setPrice(1199.0);

		List<Subject> list = new ArrayList<>();

		list.add(subject1);
		list.add(subject2);
		list.add(subject3);

		StudentOneToMany student1 = new StudentOneToMany();

		student1.setName("Sayyed Zaid");
		student1.setAge(23);
		student1.setMobile(887744566L);
		student1.setSubject(list);

		transaction.begin();
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(student1);
		transaction.commit();

	}
}
