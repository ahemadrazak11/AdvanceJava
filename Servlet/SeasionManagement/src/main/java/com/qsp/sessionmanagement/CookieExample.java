package com.qsp.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieinfo")
public class CookieExample extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookie = new Cookie("username", "allen123");
		Cookie cookie1 = new Cookie("password", "1234");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		PrintWriter writer = resp.getWriter(); // ctrl+2 then L to get the return type. (shortcut)
		writer.print("Cookie Returned.....");
	}
}
