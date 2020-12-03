<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int a = Integer.parseInt(request.getParameter("num1")); 
	int b = Integer.parseInt(request.getParameter("num2"));
	
	int sum = a + b;
	
	out.println("add = "+sum);
	%>
</body>
</html>


<!-- 
		we can write html code in servelt class but only inside the println() 
		so it is not good 
		
		in we can write java code inside the html tag 
		we dont' need
		>x ml file
		> we don't need annotation's
		
		in this html page you can write your code and also design your servelt page
		
		just we need to mention in html page action "" here mention  
 
	
 -->