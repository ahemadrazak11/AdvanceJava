package com.qsp;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("raza");
        EntityManager em = emf.createEntityManager();

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        TypedQuery<Employee> query = em.createQuery(
                "SELECT e FROM Employee e WHERE e.email=:email AND e.password=:password",
                Employee.class);

        query.setParameter("email", email);
        query.setParameter("password", password);

        try {

            Employee employee = query.getSingleResult();

            req.setAttribute("employee", employee);

            RequestDispatcher dispatcher = req.getRequestDispatcher("Success.jsp");
            dispatcher.forward(req, resp);

        } catch (Exception e) {

            req.setAttribute("message", "Invalid Email or Password");

            RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
            dispatcher.forward(req, resp);

        } finally {

            em.close();
            emf.close();

        }

    }

}