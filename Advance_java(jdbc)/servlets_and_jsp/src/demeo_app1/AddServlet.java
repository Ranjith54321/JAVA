package demeo_app1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	// method name sevice is very important it is default so don't change it
	// HttpServletRequest,HttpServletResponse are 2 obj's passed by tomcat server
		//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException { 
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		// session 
		HttpSession session = req.getSession();
		session.setAttribute("k", sum);
		res.sendRedirect("sqroot");
		
		// Cookie :
		//Cookie cookie = new Cookie("k",sum + ""); // this class taken as name and value in the form of strings separately
		//res.addCookie(cookie);
		
		//res.sendRedirect("sqroot");
		}

}



/* Http has 7 method's 5 is mostly used 
 * 
 * Get
 * Post
 * Put
 * Delete
 * option's
 * 
 *  
 *  
 *  
 *  defaultly in form tag has the method Get method is available but it shows the entered details in the search bar
 *  
 *  so to avoid this either we can mention Put on the Html method column or instead of service we can use doPut() method
 *  
 *  but if html has method data that method type and java class method type should be same
 *  
 *  we also have doGet() method
 * 	
 * doGet() and doPut()  are avilable inside the service method
 * 
 * 
 */
