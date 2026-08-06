package com.qsp;

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

@WebServlet("/register")
public class SaveData extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raza");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
	
		
		String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        double salary = Double.parseDouble(req.getParameter("salary"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
		
        int houseNumber = Integer.parseInt(req.getParameter("houseNumber"));
        String street = req.getParameter("street");
        int pincode = Integer.parseInt(req.getParameter("pincode"));
        String state = req.getParameter("state");
        String country = req.getParameter("country");
        
        
        // employee object.
        Employee employee = new Employee();
        
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
        employee.setEmial(country);
        employee.setPassword(password);
        
        
        // address object.
        Address address = new Address();
        
        address.setHouseNumber(houseNumber);
        address.setStreet(street);
        address.setPincode(pincode);
        address.setState(state);
        address.setCountry(country);
        
        
        // One to one mapping.
        employee.setAddress(address);
        
        
        transaction.begin();
        entityManager.persist(employee);
        entityManager.persist(address);
        transaction.commit();
        
        resp.getWriter().println("Employee Stored Successfully");
	}
}
