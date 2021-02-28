<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Languages</title>
</head>
<body>
	<table>
		<thead>
			<tr>
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Version</th>
	            <th>action</th>
		    </tr>
		 </thead>
		 <tbody>
	        <c:forEach items="${languages}" var="lang">
	        <tr>
	        	<td><a href="/languages/<c:out value="${lang.id}"/>"><c:out value="${lang.name}"/></a>	  
	            <td><c:out value="${lang.creator}"/></td>
	            <td><c:out value="${lang.currentVersion}"/></td>
	            <td><a href="/languages/delete/<c:out value="${lang.id}"/>">delete</a> 
	           	<td><a href="/languages/edit/<c:out value="${lang.id}"/>">edit</a>  
	        </tr>
	        </c:forEach>
		 </tbody>
		</table>

		<form:form action="/languages" method="post" modelAttribute="addNew">		  
			  
			        <form:label path="name">Name</form:label>
			        <form:input path="name"/>
			        <form:errors path="name"/><br>

			        <form:label path="creator">Creator</form:label>
			        <form:input path="creator"/>
    				<form:errors path="creator"/><br>
			    
			        <form:label path="currentVersion">Version</form:label>
			        <form:input path="currentVersion"/>
     		 		<form:errors path="currentVersion"/><br>
			   
			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
</body>
</html>