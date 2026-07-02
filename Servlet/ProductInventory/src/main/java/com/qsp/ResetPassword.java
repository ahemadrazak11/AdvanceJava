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

@WebServlet("/reset")
public class ResetPassword extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String newpassword = req.getParameter("newpassword");
		String confirmpassword = req.getParameter("confirmpassword");
		
		HttpSession session2 = req.getSession();
		String email = (String) session2.getAttribute("email");
		
		System.out.println(email);
		System.out.println(newpassword);
		System.out.println(confirmpassword);
		if(newpassword.equals(confirmpassword))
		{
			
					Connection con = null;
					
				try {
					Class.forName("org.postgresql.Driver");
					con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductInventory?user=postgres&password=root");
					PreparedStatement statement = con.prepareStatement("update customer set password = ? where email =?");
					statement.setString(1, confirmpassword);
					statement.setString(2, email);
					
					boolean query = statement.execute();
					
					System.out.println(query);
					
					if(!query) {
						
						session2.setAttribute("pass", "Password Reset Successfully...!");
						session2.setAttribute("failed", null);
						
						RequestDispatcher dispatcher = req.getRequestDispatcher("CustomerLogin.jsp");
						dispatcher.forward(req, resp);
						
					}else {
						session2.setAttribute("message", "Email Not Found!!!!...!");
						
						RequestDispatcher dispatcher = req.getRequestDispatcher("ForgotPassword.jsp");
						dispatcher.forward(req, resp);
					}
				} catch (Exception e) {
					 e.printStackTrace();
				}finally {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				}
			
		}
		else {
			System.out.println("wrong password");
		}
		
	}
}
