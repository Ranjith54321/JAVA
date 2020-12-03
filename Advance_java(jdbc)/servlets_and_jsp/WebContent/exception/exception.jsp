<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		/*
		this is one type
		try{
			out.println(1/0);
		}
		catch(Exception e){
			out.println("Exception "+e.getMessage());
		}
	*/
	
	 // type 2 :
		 // we can display the error message in separate page for this see top <%@page tag define attribue error="your_page.jsp file"
		 // in error jsp file same top page tag isErrorpage = "true" **** it is very important
		 
		 out.println(1/0);
	%>
	
</body>
</html>