<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create a show</title>
</head>
<body>
	<h1>Create a new Show</h1>
	
	<p><form:errors path="show.*"/></p>
	<form:form action="/createShow" method="post" modelAttribute="show">
   		
   		<div>
			<p>Title:</p>
			<form:label path="title"></form:label>
			<form:errors path="title"></form:errors>
			<form:input path="title"></form:input>
		</div>
		
   		<div>
			<p>Network:</p>
			<form:label path="network"></form:label>
			<form:errors path="network"></form:errors>
			<form:input path="network"></form:input>
		</div>
	    
		<form:hidden value="${user.id}" path="user"/>
	    <button type="submit">Create</button>
   	</form:form>
</body>
</html>