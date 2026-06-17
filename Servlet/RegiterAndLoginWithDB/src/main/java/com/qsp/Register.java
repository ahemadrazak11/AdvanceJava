package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//==>> By using this anotation we can map the html page with 
@WebServlet("/register") 
public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Read all the data from frontend.
		
		String id = req.getParameter("id");
		
		int id1 = Integer.parseInt(id);
		
		String name = req.getParameter("name");
		
		String phone = req.getParameter("phone");
		
		long phone1 = Long.parseLong(phone);
		
		String email = req.getParameter("email");
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		System.out.println("Register.java file executed...");
		
		PrintWriter writer = res.getWriter();
		
		writer.print("<html>"
				+ "<body>"
				+ "<h1>Registration Successfully.....!</h1>"
				+	id1 + "<br>" + name + "<br>" + phone1 + "<br>" + email + "<br>" + username + "<br>" + password + "<br>"
				+ "</body>"
				+ "</html>");
	}

}
