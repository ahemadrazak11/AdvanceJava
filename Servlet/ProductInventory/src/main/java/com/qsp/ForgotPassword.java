package com.qsp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/forgotpassword")
public class ForgotPassword extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		
		 
        Connection con = null;
        
        // check user uname and password present or not 
	try {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
		PreparedStatement statement = con.prepareStatement("select * from customer where email =?");
		statement.setString(1, email);
		
		ResultSet query = statement.executeQuery();
		
		if(query.next()) {			
			
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("NewPassword.jsp");
			dispatcher.forward(req, resp);
			
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("message", "Email Not Found...!");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("ForgotPassword.jsp");
			dispatcher.forward(req, resp);
		}
	} catch (Exception e) {
	// TODO: handle exception
	}finally {
	try {
		con.close();
	} catch (Exception e2) {
		// TODO: handle exception
	}
	}
	
	
	}
}
