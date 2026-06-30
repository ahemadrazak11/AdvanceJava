package com.qsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer")
public class CustomerRegistration extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		String name = req.getParameter("name");
		
		Long mobile = Long.parseLong(req.getParameter("mobile"));
		
		String email = req.getParameter("email");
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		System.out.println("name" + name);
	}
}
