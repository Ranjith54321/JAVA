
html page :
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body{
		background-color : green;
	}
</style>
</head>
<body>
	<form action = "add"> <!-- here default method is get -->
		Enter number 1 : <input type="text" name="num1"><br>
		Enter number 2 : <input type="text" name="num2"><br>
		<input type="submit">
	</form>
</body>
</html>
--------------------------------------
Example 1 :------------> :creating simle wepage and add number's using servlet'
in web.xml :
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  	<servlet>
  		<servlet-name>abc</servlet-name>
  		<servlet-class>demeo_app1.AddServlet</servlet-class><!-- this target to AddServer class -->
  	</servlet>
  	<servlet-mapping>
  	<servlet-name>abc</servlet-name>
  	<url-pattern>/add</url-pattern>
  	</servlet-mapping>
</web-app>

AddServlet.java :

package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	// method name sevice is very important it is default so don't change it
	// HttpServletRequest,HttpServletResponse are 2 obj's passed by tomcat server
		//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException { 
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		PrintWriter out = res.getWriter();
		
		out.println("sum is = "+sum);// here out is PrinWriter obj return by getWriter
	

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
**********************************-----------------------------***************************

Example 2:  connecting two servlets using setAttribute method
in web.xml :
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  	<servlet>
  		<servlet-name>abc</servlet-name>
  		<servlet-class>demeo_app1.AddServlet</servlet-class><!-- this target to AddServer class -->
  	</servlet>
  	<servlet-mapping>
  	<servlet-name>abc</servlet-name>
  	<url-pattern>/add</url-pattern>
  	</servlet-mapping>
  	<servlet>
  	<servlet-name>sqr</servlet-name>
  	<servlet-class>demeo_app1.SqServlet</servlet-class>
  	</servlet>
  	<servlet-mapping>
  	<servlet-name>sqr</servlet-name>
  	<url-pattern>/sqroot</url-pattern> <!--  this is in the RequestDispatcher -->
  	</servlet-mapping>
</web-app>

AddServlet.java :
package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	// method name sevice is very important it is default so don't change it
	// HttpServletRequest,HttpServletResponse are 2 obj's passed by tomcat server
		//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException { 
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
	
		 eg 2:
		 //to pass data b/w servltes we use Session Management
		req.setAttribute("sum", sum); // for passing the value to another servlet here im using setAttribute
		
		
		}

}

SqServlet :

package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int sum = (int)req.getAttribute("sum");
		
		int sq = sum*sum;
		
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq);
	}
}

// when you execute eg2 in AddServlet addition out put is not displayed there

************************-----------------------------------------************************
Example 3: connecting two servlets using Redirect 

AddServlet.java :
package demeo_app1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		// eg : 3 
		//i'm using Redirect to connect the two servlets 
		res.sendRedirect("sqroot?k="+sum); // URL Rewriting http://localhost:8080/demeo_app1/sqroot?k=2
		// here we send the res part as reqest part of SqServlet
		// for this sendRdirect only service is works doGet(),doPost() not works
		}
 for this don't use doGet(), doPost() its only works service 
}

SqServlet.java :
package demeo_app1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int sum = Integer.parseInt(req.getParameter("k"));
		
		int sq = sum*sum;
		
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq);
	}
}
***************************------------------------------------------*************************
Example 4:  Session and Cookie

--> Session
in Session until the application is running and untill the data is deleted

it is used when you log in some site after you visit anothe tab when you come back to the prvois tab
		you no need to login again 

--> Cookie :

	client send's the req to the server the servser send the response to client in the form of cookie

	if you revisit again that particluar website it will remeber through cookie but client will not know the particluar cookie 
		so it send the array of cookie to the server it will pick which cooie it need 
	like geekdforgeeks

		client ->(req) rever(res->cookie) -> client(req cookies) -> server(res find cookie)

AddServlet.java:
package demeo_app1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	// method name sevice is very important it is default so don't change it
	// HttpServletRequest,HttpServletResponse are 2 obj's passed by tomcat server
		//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException { 
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		// session 
		/*HttpSession session = req.getSession();
		session.setAttribute("k", sum);
		res.sendRedirect("sqroot");*/
		
		// Cookie :
		Cookie cookie = new Cookie("k",sum + ""); // this class taken as name and value in the form of strings separately
		res.addCookie(cookie);
		
		res.sendRedirect("sqroot");
		}

}

SqServlet.java :

package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {

		// session
		//HttpSession session = req.getSession();
		//session.removeAttribute("k"); // this will remove the value like skillrack if you go out of the window it will ask login
		//int sum = (int)session.getAttribute("k"); // it is object type
		//int sq = sum*sum;
		
		
		// Cookie 
		int sum=0;
		Cookie[] cookies = req.getCookies(); 
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				sum = Integer.parseInt(c.getValue());
		}
		int sq = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq);
	}
}

Note : Cokkie is not working in SqServlet.java it shows error i cannot under stand that

*******************-------------------------****************************

ServletConfig and ServletContext :

ServletConfig and ServletContext, both are objects created at the time of servlet initialization and used to provide
 some initial parameters or configuration information to the servlet. 
But,the difference lies in the fact that information shared by ServletConfig is for a specific servlet, 
while information shared by ServletContext is available for all servlets in the web application.

	but i think both are same 

	servletConfig we store inside <servlet> <init-param>tag 

	for servletContext store inside <context-param> tag 

		both are interface

web.xml :
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  	 
  	 <!-- this is for serverlet confing and context -->
  	 <servlet>
  	 	<servlet-name>context</servlet-name>
  	 	<servlet-class>demeo_app1.Servlet_config_conflex</servlet-class>
  	 	
  	 	<init-param>  --> for servletConfig so this is for specific servel ********************
  	 	<param-name>name</param-name>
  	 	<param-value>ranjith_dot</param-value>
  	 	</init-param>

  	 </servlet>
  	 <servlet-mapping>
  	 <servlet-name>context</servlet-name>
  	 <url-pattern>/home</url-pattern>
  	 </servlet-mapping>
  	 
  	 <context-param>  ------------------> this is servletContext this is open to all servlets
  	 <param-name>name</param-name>
  	 <param-value>Ranijith</param-value>
  	 </context-param>
  	 <context-param>
  	 <param-name>name2</param-name>
  	 <param-value>damn_coder</param-value>
  	 </context-param>
  	 
</web-app>


***********************--------------------********************

----> no more xml in html action directly contacnt's annotation

AddServlet.java :

package demeo_app1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")    <<<<---------------it is important it atch the html req
public class AddServlet extends HttpServlet{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		// session 
		HttpSession session = req.getSession();
		session.setAttribute("k", sum);
		res.sendRedirect("sqroot");
		
		}

}


SqServlet.java:

package demeo_app1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;
@WebServlet("/sqroot")    <<---- annotaion
public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {

		// session
		
		HttpSession session = req.getSession();
		//session.removeAttribute("k"); // this will remove the value like skillrack if you go out of the window it will ask login
		int sum = (int)session.getAttribute("k"); // it is object type
		int sq = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("square root = "+sq);
	}}

