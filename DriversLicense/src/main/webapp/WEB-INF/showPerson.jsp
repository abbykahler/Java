<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person</title>
</head>
<body>
	<h1><c:out value="${person.getFirstName()} ${person.getLastName()}"/></h1>
	
	<p>License Number: <c:out value="${person.license.getNumber()}"/></p>
	<p>State: <c:out value="${person.license.getState()}"/></p>
	<p>Expiration Date: <c:out value="${person.license.getExpirationDate()}"/></p>
</body>
</html>