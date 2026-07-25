package com.onetomanybidirectional;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		StudentBi student = new StudentBi();
		student.setName("Allen");
		student.setMobile(9067831610l);
		
		
		SubjectBi subject = new SubjectBi();
		subject.setName("Java");
		subject.setAuthor("James");
		subject.setStudent(student);
		
		SubjectBi subject2 = new SubjectBi();
		subject2.setName("SQL");
		subject2.setAuthor("Rymond");
		subject2.setStudent(student);
		
		ArrayList<SubjectBi> list = new ArrayList<>();
		list.add(subject);
		list.add(subject2);
		
		
		student.setList(list);
		
		transaction.begin();
		entityManager.persist(subject);
		entityManager.persist(subject2);
		entityManager.persist(student);
		transaction.commit();
		
	}
}
