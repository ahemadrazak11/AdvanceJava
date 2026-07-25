package com.onetomanybidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("vikas");

        EntityManager entityManager = emf.createEntityManager();

        // Find Student by ID
        StudentBi student = entityManager.find(StudentBi.class, 1);

        if (student != null) {
            student.getList()
                   .stream()
                   .forEach(System.out::println);
        }

        // Find Subject by ID
        SubjectBi subject = entityManager.find(SubjectBi.class, 1);

        if (subject != null) {
            StudentBi s = subject.getStudent();
            System.out.println(s);
        }
    }
}


