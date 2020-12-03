<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	in jasp there are 4 type of tags :<br>
	1.) Directive tag :<br>
		which is used to import the java packages <br>
	<%@page import="java.util.*" %>
	<%@page import="java.io.*,java.lang.*" %> this is for multiple pakage<br> <br>
	
	this is from another jsp file <br>
	<%@ include file="multiple.jsp" %> <br>
	2.) Declarative tag :<br>
		which is used to declare variable and methods out side the service method but inside the servelt class<br>
		<%! int value = 25; %><br>
	3.) scriptlet tag:<br>
		the code you write is belongs to service or doGet or doPost method's<br>
		<%
			int i = Integer.parseInt(request.getParameter("a"));
			int j = Integer.parseInt(request.getParameter("b"));
			int ans = i+j;
			out.println(ans);
		%>
	4.) Expression tag ;<br>
		which os used to display the content at the end of the page <br>
		<%= value+ans %> <br>
		
		you can see telusko vodeo he will show using nebeans to how the jsp convert to servlet code nebeans shows the servlet
	
		
	<!-- for this use page.html -->	
	
</body>
</html>