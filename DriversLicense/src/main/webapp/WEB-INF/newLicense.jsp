<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>
	<h1>New License</h1>
	<form:form method = "post" action = "/licenses/new" modelAttribute = "license">
		
	
			<form:label path = "person">Person:</form:label>
			<form:select path = "person">
				<c:forEach items = "${persons}" var = "person">
					<c:if test = "${person.getLicense() == null}">
						<form:option value = "${person}" label = "${person.getFirstName()} ${person.getLastName()}"/>					
					</c:if>
				</c:forEach>
			</form:select>
		
			<form:label path = "state">State:</form:label>
			<form:input path = "state"/>
		
			<form:label path = "expirationDate">Expiration Date:</form:label>
			<form:input type = "date" path = "expirationDate"/>
		
			<button>Create License</button>
	</form:form>
</body>
</html>