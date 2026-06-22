import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class DisplayResult extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int input1 = Integer.parseInt(req.getParameter("input1"));
		int input2 = Integer.parseInt(req.getParameter("input2"));
		
		Object attribute = req.getAttribute("res");
		
		Integer res = (Integer) attribute;
		
		PrintWriter writer = resp.getWriter();
		
		writer.print("<html><body>"
				+ "<h2> Input1: "
				+ input1
				+ "</h2>"
				+ "<br>"
				+ "<h2> Input2: "
				+ input1
				+ "</h2>"
				+ "<br>"
				+ "<h1>Result: "
				+ res
				+ "</h1>"
				+ "<br>"
				+ "</body>"
				+ "</html>");
	}
}
