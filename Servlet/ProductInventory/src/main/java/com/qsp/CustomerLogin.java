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

@WebServlet("/login")
public class CustomerLogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		
	       //get the data 
                       String username=req.getParameter("username");
                       String password = req.getParameter("password");
                       
                       Connection con = null;
                       System.out.println("Username: " + username);
                       System.out.println("Password: " + password);
                       
                       // check user uname and password present or not 
				try {
					Class.forName("org.postgresql.Driver");
					con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
					PreparedStatement statement = con.prepareStatement("select * from customer where username =? and password=?");
					statement.setString(1, username);
					statement.setString(2, password);
					
					ResultSet query = statement.executeQuery();
					
					if(query.next()) {			
						
						HttpSession session = req.getSession();
						session.setAttribute("username", username);
						session.setAttribute("password", password);
						session.setAttribute("message", "Login Successful...!");
						
						
						RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerHome.jsp");
						dispatcher.forward(req, resp);
						
					}else {
						HttpSession session = req.getSession();
						session.setAttribute("username", username);
						session.setAttribute("password", password);
						session.setAttribute("failed", "Invalid username or password...!");
						session.setAttribute("pass", null);
						
						RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerLogin.jsp");
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

