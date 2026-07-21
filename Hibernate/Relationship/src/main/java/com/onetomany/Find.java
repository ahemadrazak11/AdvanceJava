package com.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		StudentOneToMany student = entityManager.find(StudentOneToMany.class, 2);
		
		if(student != null) {
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getAge());
//			System.out.println(student.getMobile());
//			System.out.println(student.getSubject());
			
			System.out.println("Student ID : " + student.getId());
			System.out.println("Student Name : " + student.getName());
			System.out.println("Age : " + student.getAge());
			System.out.println("Mobile : " + student.getMobile());

			System.out.println("Subjects:");

			for (Subject subject : student.getSubject()) {
			    System.out.println("------------------------");
			    System.out.println("Subject ID : " + subject.getId());
			    System.out.println("Subject Name : " + subject.getName());
			    System.out.println("Author : " + subject.getAuthor());
			    System.out.println("Price : " + subject.getPrice());
			}
		}
		else {
			System.out.println("Studetn Not Fount");
		}
	}

	
	
}
