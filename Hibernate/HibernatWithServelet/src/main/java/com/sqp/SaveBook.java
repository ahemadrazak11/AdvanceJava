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

@WebServlet("/save-book")
public class SaveBook extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String auth = req.getParameter("auth");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        Book book = new Book();

        book.setId(id);
        book.setName(name);
        book.setAuth(auth);
        book.setPrice(price);
        book.setQuantity(quantity);

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("raza");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(book);

        transaction.commit();

        resp.getWriter().println("Book Saved Successfully");

        em.close();
        emf.close();
    }
}