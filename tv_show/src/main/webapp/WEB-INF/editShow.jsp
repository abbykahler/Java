<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${show.title}</h1>
	
    <form:errors path="show.*"/>
	<form:form method="POST" action="/shows/update/${show.id}" modelAttribute="show">
        
		<p>
    		<form:label path="title">Title:</form:label>
			<form:errors path="title"/>
        	<form:input type="text" path="title"/>
        </p>

		<p>
        	<form:label path="network">Network:</form:label>
			<form:errors path="network"/>
        	<form:input type="text" path="network"/>
        </p>

        <form:input type="hidden" path="user" value="${user.id}"/>
        <input type="submit" value="Submit"/>
    
	</form:form>
   
	<a href="/shows/delete/${show.id}"><button>Delete</button></a>
</body>
</html>