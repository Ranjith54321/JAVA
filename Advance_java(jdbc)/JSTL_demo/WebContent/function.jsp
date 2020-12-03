<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str" value="ranjith dot is a mad" />
	 1.) find length <br>
	length : ${fn:length(str)}<br>
	
	 2.) split <br>
		<c:forEach items="${fn:split(str,' ')}" var="s">
			${s}<br>
		</c:forEach>
		
	 3.) find index <br>
	index : ${fn:indexOf(str,'dot')} <br>
	
	 4.) contains <br>
	contains : ${fn:contains(str,'dot')} <br>
	
	 5.) contains with  if condition <br>
	<c:if test="${fn:contains(str,'dot')}">
		dot is there <br>
	</c:if>
	
	 6.) end with <br>
	<c:if test="${fn:endsWith(str,'mad')}">
		end with mad <br>
	</c:if>
	
	7.)toLowerCase : <br>
	 ${fn:toUpperCase(str)}		
		
</body>
</html>