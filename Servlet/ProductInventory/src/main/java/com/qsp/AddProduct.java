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
import javax.servlet.http.HttpSession;

@WebServlet("/add-product")
public class AddProduct extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				int id = Integer.parseInt(req.getParameter("id"));
				
				String name = req.getParameter("name");
				
				Double price = Double.parseDouble(req.getParameter("price"));
				
				String brand = req.getParameter("brand");
				
				int quantity = Integer.parseInt(req.getParameter("quantity"));
				
				
				Connection connection = null;
			    
		
			    try {
		
					Class.forName("org.postgresql.Driver");
		
					
		
					connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
																							   
					
		
					PreparedStatement statement = connection.prepareStatement("insert into product values(?,?,?,?,?)");
		
					statement.setInt(1, id);
		
					statement.setString(2, name);
		
					statement.setDouble(3, price);
		
					statement.setString(4, brand);
		
					statement.setInt(5, quantity);
		
					statement.execute();
					
					
					HttpSession session = req.getSession();
					session.setAttribute("message", "Product Added Succeful...!");
					
					RequestDispatcher dispatcher = req.getRequestDispatcher("EmployeeHome.jsp");
					dispatcher.include(req, resp);
					
			    }
			    catch (Exception e) {
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
