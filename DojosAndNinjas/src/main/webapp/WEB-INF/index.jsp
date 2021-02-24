<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Dojos</h1>
	
	<a href="/dojos/new">Create Dojo</a>  <a href="/ninjas/new">Create Ninja</a>
	
	<c:forEach items="${dojos}" var="dojo">
		<h3><c:out value="${dojo.name}"></c:out></h3>
		<c:forEach items="${dojo.ninjas}"  var="nin">
			<p><c:out value="${nin.firstName}"></c:out> <c:out value="${nin.lastName}"></c:out> <c:out value="${nin.age}"></c:out></p>
		</c:forEach>
		
	</c:forEach>

</body>
</html>