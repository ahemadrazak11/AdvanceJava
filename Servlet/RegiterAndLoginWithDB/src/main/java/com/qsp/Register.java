package com.qsp;

import java.io.IOException;

import java.io.PrintWriter;

import java.sql.*;

import javax.servlet.GenericServlet;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

import javax.servlet.annotation.WebServlet;

@WebServlet("/register")

public class Register extends GenericServlet {

@Override

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {



	//Read All Data

	String id = req.getParameter("id");

	int id1 = Integer.parseInt(id);

	

	String name =  req.getParameter("name");

	

	String mobno = req.getParameter("mobno");

	long mobno1 = Long.parseLong(mobno);

	

	String email = req.getParameter("email");

	

	String username = req.getParameter("username");

	String password = req.getParameter("pass");

	

	

    Connection connection = null;

    

    try {

		Class.forName("org.postgresql.Driver");

		

		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ServletRegister?user=postgres&password=root");

		

		PreparedStatement statement = connection.prepareStatement("insert into customer values(?,?,?,?,?,?)");

		statement.setInt(1, id1);

		statement.setString(2, name);

		statement.setLong(3, mobno1);

		statement.setString(4, email);

		statement.setString(5, username);

		statement.setString(6, password);

		

		statement.execute();

		

		PrintWriter writer = res.getWriter();

		 writer.print("<html><body><h2>Registration Successful...</h2></body></html>");
		 writer.print("<html><body><h1>"+id+"</h1></body></html>");
		 writer.print("<html><body><h1>"+name+"</h1></body></html>");
		 writer.print("<html><body><h1>"+mobno+"</h1></body></html>");
		 writer.print("<html><body><h1>"+email+"</h1></body></html>");
		 writer.print("<html><body><h1>"+username+"</h1></body></html>");
		 writer.print("<html><body><h1>"+password+"</h1></body></html>");

		

	} catch (Exception e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}

    finally {

    	try {

			connection.close();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

    }

    

	

}

}