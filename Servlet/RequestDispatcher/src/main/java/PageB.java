import java.io.IOException;
import java.io.PrintWriter;import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageb")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter writer = resp.getWriter();
		
		
		
		String name = req.getParameter("name");
		String mobno = req.getParameter("mobno");
		String email = req.getParameter("email");
		
		writer.print("Name: " + name + "\n" + "Mobile: " + mobno+ "\n" + "email" + email);
		
		
	}
}
