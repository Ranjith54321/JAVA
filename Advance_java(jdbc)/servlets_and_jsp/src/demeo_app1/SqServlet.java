package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;
@WebServlet("/sqroot")
public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {

		// session
		
		HttpSession session = req.getSession();
		//session.removeAttribute("k"); // this will remove the value like skillrack if you go out of the window it will ask login
		int sum = (int)session.getAttribute("k"); // it is object type
		int sq = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq);
		
		// Cookie 
		/*int sum=0;
		Cookie[] cookies = req.getCookies(); 
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				sum = Integer.parseInt(c.getValue());
		}
		int sq = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq); */
	}
}

// when you execute eg2 in AddServlet addition out put is not displayed there
