import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findsum")
public class CalculateSum extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String a = req.getParameter("input1");
		
		int input1 = Integer.parseInt(a);
		
		int input2 = Integer.parseInt(req.getParameter("input2"));
		
		int result = input1 + input2;
		
		req.setAttribute("res", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/result");
		
		
		dispatcher.forward(req, resp);
	}
}
