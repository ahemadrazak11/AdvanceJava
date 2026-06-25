package com.qsp.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getsession")
public class GetSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		
		resp.getWriter().print("<html><body><h1> username:"
				+ username + "<br>"
				+ "password:" + password +
				"</h1></body></html>");
	}
}
