package demo_jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test2")
public class Test2 extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		/*Student s = new Student(1,"ranjith"); // this is for single object passing  
		request.setAttribute("student", s); */
		// now we pass list of object
		
		List<Student> l = Arrays.asList(new Student(1,"ranjith"),new Student(2,"dot"),new Student(3,"domi"));
		request.setAttribute("student_list", l);
		
		RequestDispatcher rd = request.getRequestDispatcher("test2.jsp");
		rd.forward(request, response);
	}
}
