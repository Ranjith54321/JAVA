jstl :
	jsp standard tag library 
	
	in jsp we write java code inside html code but in jstl we can make java code as like html file
	
	see Test1.java and test1.jsp

Test1.java :
	
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
	
test1.jsp:

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	// but we don't want java code here so we remove this operation and do it on the onther java file
	<%
		String name = request.getAttribute("value").toString(); // it comes in the form of obj so conv to string
		out.println("name : "+name);
	%>
	
	${value} <!--  it is expression language it is introduced after jsp  here we can directly pass the value(i.e name Attribute)-->
</body>
</html>

***************************************************
now we going to pass the obejct from the servlet and get it from the jsp file and print it using jstl tag's

Test2.java and test2.jsp 
