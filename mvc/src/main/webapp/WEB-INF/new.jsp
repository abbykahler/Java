<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Book</title>
</head>
<body>
	<h1>Add the New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
	 
	        <form:label path="title">Title</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/><br>
	    
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/><br>
	    
	        <form:label path="language">Language</form:label>
	        <form:errors path="language"/>
	        <form:input path="language"/><br>
	    
	        <form:label path="numberOfPages">Pages</form:label>
	        <form:errors path="numberOfPages"/>     
	        <form:input type="number" path="numberOfPages"/><br>
	  
	    	<input type="submit" value="Submit"/>
	</form:form>  
</body>
</html>