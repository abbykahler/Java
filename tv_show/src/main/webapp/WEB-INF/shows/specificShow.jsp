<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Info</title>
</head>
<body>
	<h2><c:out value="${show.title}"/></h2>
	<p>Network: <c:out value="${show.network}"/></p>
	<br>

	<p><form:errors path="show.*"/></p>
	<form:form method="POST" action="/shows/rate/${show.id}" modelAttribute="show">
	
		<p>
			<form:label path="rating">Leave a Rating:</form:label>
		    <form:input type="number" path="rating" min="1" max = "5"/>
	    	<input type="submit" value="Rate!"/>
	    </p>
    
	<form:hidden value="${show.title}" path="title"/>
	<form:hidden value="${show.network}" path="network"/>
	<form:hidden value="${user.id}" path="user"/>
	
	</form:form>
	<a href="/shows/edit/${show.id}"><button>Edit Show</button></a>
	<a href="/shows/delete/${show.id}"><button>Delete</button></a>
	<a href="/shows"><button>Back</button></a>
	
</body>
</html>