package com.qsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("abc") && password.equals("123"))
		{
			HttpSession session1 = req.getSession();
			session1.setAttribute("username", username);
			session1.setAttribute("password", password);
			
			RequestDispatcher r1 =  req.getRequestDispatcher("Home.jsp");
			r1.forward(req, resp);
			
		}
		else {
			
			HttpSession session1 = req.getSession();
			session1.setAttribute("message", "Invalid Username or Password");
			
			RequestDispatcher r1 = req.getRequestDispatcher("Login.jsp");
			r1.include(req, resp);
			
			
		}
		
	}

}
