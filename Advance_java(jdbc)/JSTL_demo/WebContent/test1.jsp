<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	
	${value} <!--  it is expression language it is introduced after jsp  here we can directly pass the value(i.e name Attribute)-->
	<c:out value="${value}"/>
</body>
</html>