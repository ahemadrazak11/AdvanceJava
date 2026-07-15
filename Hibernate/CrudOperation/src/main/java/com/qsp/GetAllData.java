package com.qsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Query query = entityManager.createQuery("select s from Employee s");
		
		List<Employee>  resultList = query.getResultList();
		
		if(!resultList.isEmpty()) {
//			resultList.stream().filter(n -> n.getSal() > 9000.0).forEach(System.out::println); // method reference.
			resultList.stream()
	          .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
	          .forEach(System.out::println);
		}
		else {
			System.out.println("No records present");
		}
	
}

}









// TASK => get all the employee which have sal greater than 6 lpa and name in upper case.
