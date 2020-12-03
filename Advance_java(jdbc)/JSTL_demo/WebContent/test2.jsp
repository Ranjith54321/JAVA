<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  ${student.id,studetn.name} // this is for one object-->
	<!-- in jstl we have foreach loop tag so use this to acceess the object -->
	
	
	<c:forEach items="${student_list}" var="s">
		${s} 
	</c:forEach>
	
</body>
</html>