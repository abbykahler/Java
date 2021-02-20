<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<table>
	    <thead>
	        <tr>
	            <th>Questions</th>
	            <th>Tags</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items = "${questions}" var = "questions">
	        <tr>
	            <td><c:forEach items = "${questions.tags}" var = "tags">
			</c:forEach>
	             </td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
		<a href = "/questions/${questions.id}">New Question</a>
	
</body>
</html>