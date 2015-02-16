package ch.theowinter.exercise01;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Exercise01Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, Theo");
	}
}
