package demo_jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test1")
public class Test1 extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		String name = "ranjith";
		
		request.setAttribute("value", name);
		RequestDispatcher rd = request.getRequestDispatcher("test1.jsp");
		rd.forward(request, response);
	}
}
