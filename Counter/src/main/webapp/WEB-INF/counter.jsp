
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter Page</title>
</head>
<link href="css/style.css" type="text/css" rel="stylesheet">
<body>
	<div class="body">
		<h1>You have visited <a href="/">http://localhost:8080</a><c:out value="${count}"/>  times.</h1>
		<h1><a href="/">Test another visit?</a></h1>
	
	</div>
</body>
</html>