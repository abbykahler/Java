<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome <c:out value="${user.name}"/></h1>
	<h2>Tv Shows</h2>
	
	<table>
	<thead>
		<tr>
            <th>Name</th>
            <th>Network</th>
            <th>Rating</th>
	    </tr>
	 </thead>

		<tbody>
	        <c:forEach items="${shows}" var="show">
		        <tr>
		            <td><a href="/shows/${show.id}"><c:out value="${show.title}"></c:out></a></td>
		            <td><c:out value="${show.network}"/></td>
		            <td><c:out value="${show.rating}"/></td>
		        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<a href="/shows/new">Add a show</a>
</body>
</html>