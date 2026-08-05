package com.sqp;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-student")
public class SaveStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        long mobile = Long.parseLong(req.getParameter("mobile"));
        String email = req.getParameter("email");

        Student student = new Student();

        student.setId(id);
        student.setName(name);
        student.setMobile(mobile);
        student.setEmail(email);

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("raza");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(student);

        transaction.commit();

        resp.getWriter().println("Student Saved Successfully");

        em.close();
        emf.close();
    }
}