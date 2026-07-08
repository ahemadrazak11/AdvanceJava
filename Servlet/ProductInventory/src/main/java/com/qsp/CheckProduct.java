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

@WebServlet("/check-id")
public class CheckProduct extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		

			Connection con = null;
	        
	        // check user uname and password present or not 
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
			PreparedStatement statement = con.prepareStatement("select * from product where id =?");
			statement.setInt(1, id);
			
			ResultSet query = statement.executeQuery();
			
			HttpSession session = req.getSession();
			if(query.next()) {			
				
				
				session.setAttribute("id", id);
				session.setAttribute("message1", "ID Found...!");
				
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("UpdateProduct.jsp");
				dispatcher.include(req, resp);
				
			}else {
				session.setAttribute("message2", "ID Not Found...!");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("UpdateProduct.jsp");
				dispatcher.include(req, resp);
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
