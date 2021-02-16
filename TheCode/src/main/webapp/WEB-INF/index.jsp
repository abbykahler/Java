<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
</head>
<link href="css/style.css" type="text/css" rel="stylesheet">
<body>
	<div class="body">
		<span class = "error"><c:out value="${error}"></c:out></span>
		<h1>What is the code?</h1>
		<form method="POST" action="/code">
		<input type = "text" name="password"><br>
		<button type = "submit">Try Code</button>
		</form>

	</div>
</body>
</html>