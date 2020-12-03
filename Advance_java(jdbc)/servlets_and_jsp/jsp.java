in servelt class we can't deign the web page in more effective way'

	but we can write html code inside java code

but in jsp we can wirte inside html code  in side this <% %> tag 

	and another benefit is 

	in we can write java code inside the html tag 
		we dont' need'
		>x ml file
		> we don't need annotation's
		
		in this html page you can write your code and also design your servelt page
		
		just we need to mention in html page action "" here mention  

html code :

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
	<form action = "add.jsp"> <!-- here default method is get -->
		Enter number 1 : <input type="text" name="num1"><br>
		Enter number 2 : <input type="text" name="num2"><br>
		<input type="submit">
	</form>
</body>
</html>

add.jsp

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