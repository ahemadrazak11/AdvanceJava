package com.qsp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		try {
			
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		

			Class.forName("org.postgresql.Driver");

			

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ServletRegister?user=postgres&password=root");

			

			PreparedStatement statement = connection.prepareStatement("insert into customer values(?,?,?,?,?,?)");

			statement.setInt(1, id);

			statement.setString(2, name);

			statement.setLong(3, mobile);

			statement.setString(4, email);

			statement.setString(5, username);

			statement.setString(6, password);

			

			statement.execute();

			

//			PrintWriter writer = resp.getWriter();
//
//			 writer.print("<html><body><h2>Registration Successful...</h2></body></html>");
//			 writer.print("<html><body><h1>"+id+"</h1></body></html>");
//			 writer.print("<html><body><h1>"+name+"</h1></body></html>");
//			 writer.print("<html><body><h1>"+mobile+"</h1></body></html>");
//			 writer.print("<html><body><h1>"+email+"</h1></body></html>");
//			 writer.print("<html><body><h1>"+username+"</h1></body></html>");
//			 writer.print("<html><body><h1>"+password+"</h1></body></html>");

			RequestDispatcher d =  req.getRequestDispatcher("Login.html");
			
			d.forward(req, resp);

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
