8<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ranjith" user="root" password="toor"/>
	<!--<sql:query var="rs" dataSource="${db}">select * from stu</sql:query>-->
	<sql:query var="rs" sql="select * from stu" dataSource="${db }"/>
	
	<c:forEach var="stu" items="${rs.rows }">
		<c:out value="${stu.id}"></c:out> :
		<c:out value="${stu.name}"></c:out> : <br>
		<!-- it only able display two columns of data   -->
		
	</c:forEach>
</body>
</html> 