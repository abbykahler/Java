<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<a href="/delete/<c:out value="${language.id}"/>">delete</a>
	<a href="/languages/">Dashboard</a>
	
	<form:form action="/languages/${language.id}" method="POST" modelAttribute="update">
	    <input type="hidden" name="method" value="put">
			<label for="name">Name</label><br>
			<input type="text" id="name" name="name"><br>
			
			<label for="creator">Creator</label><br>
			<input type="text" id="creator" name="creator"><br>
			
			<label for="currentVersion">Version</label><br>
			<input type="text" id="currentVersion" name="currentVersion"><br><br>
		<input id="btn" type="submit" value="Submit">
	</form:form>

</body>
</html>