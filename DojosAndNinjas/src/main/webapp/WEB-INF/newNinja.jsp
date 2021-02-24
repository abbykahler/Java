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
	<h1>New Ninja</h1>

	<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
			<p>Dojo:</p>
			<form:label path="dojo"></form:label>
			<form:errors path="dojo"></form:errors>
			<form:select path="dojo">
				<option value="" disabled selected></option>
				<c:forEach items="${dojos}" var="dojo">
					<form:option value="${dojo}">
						<c:out value="${dojo.name} Location"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			
			<p>First Name:</p>
			<form:label path="firstName"></form:label>
			<form:errors path="firstName"></form:errors>
			<form:input path="firstName"></form:input>
		
		
			<p>Last Name:</p>
			<form:label path="lastName"></form:label>
			<form:errors path="lastName"></form:errors>
			<form:input path="lastName"></form:input>
		
			<p>Age:</p>
			<form:label path="age"></form:label>
			<form:errors path="age"></form:errors>
			<form:input path="age"></form:input><br>
		
			<input type="submit" value="Create" />
		
	
	</form:form>
</body>
</html>
