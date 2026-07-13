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

@WebServlet("/displayallproduct")
public class DisplayAllProduct extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		

		Connection con = null; 
	try {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
		PreparedStatement statement = con.prepareStatement("select * from product");
		
			ResultSet query = statement.executeQuery();
			HttpSession session = req.getSession();			
			
			session.setAttribute("ResultSet", query);			
			RequestDispatcher dispatcher = req.getRequestDispatcher("DisplayAllProduct.jsp");
			dispatcher.forward(req, resp);
			
	
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
