package com.onetomany;

import java.beans.PersistenceDelegate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Subject subject = entityManager.find(Subject.class, 7);
		
		StudentOneToMany student = entityManager.find(StudentOneToMany.class, 1);
		
		if(student != null) {
			List<Subject> list = student.getSubject();
			
			for(int i=0 ; i< list.size(); i++) {
				if(list.get(i).getId() == subject.getId()) {
					list.remove(i);
				}
			}
			
			transaction.begin();
			entityManager.merge(student);
//			entityManager.remove(student); //this line remove subject from subject table also
			transaction.commit();
			
		}
	}
	
}
