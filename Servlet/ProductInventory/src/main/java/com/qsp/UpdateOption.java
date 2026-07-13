package com.qsp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update-option")
public class UpdateOption extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		Integer id = (Integer)session.getAttribute("id");
		
		String name = req.getParameter("name");
		
		String brand = req.getParameter("brand");
		
		String price = req.getParameter("price");
		
		String quantity = req.getParameter("quantity");
		
		
		Connection con = null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");			
			PreparedStatement statement=null;
			
					if(name != null) {
						statement = con.prepareStatement("update product set name = ? where id =?");
						statement.setString(1, name);						
						
					}
					else if(brand != null) {
						statement = con.prepareStatement("update product set brand = ? where id =?");
						statement.setString(1, brand);
					}
					else if(price != null) {
						Double priceDbl = Double.parseDouble(price);
						statement = con.prepareStatement("update product set price = ? where id =?");
						statement.setDouble(1, priceDbl);
					}
					else if(quantity != null) {
						Integer quantityInt = Integer.parseInt(quantity);
						statement = con.prepareStatement("update product set quantity = ? where id =?");
						statement.setInt(1, quantityInt);
					}
					
					statement.setInt(2, id);
					boolean query = statement.execute();
					
					if(!query) {
						
						session.setAttribute("message", "Product Updated Successfully...!");
						RequestDispatcher dispatcher = req.getRequestDispatcher("EmployeeHome.jsp");
						dispatcher.forward(req, resp);
						
					}
					
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
		try {
			con.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		}		
		
	}
}