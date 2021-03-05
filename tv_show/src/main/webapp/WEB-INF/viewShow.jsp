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
	<h1><i><c:out value="${show.title}"/></i></h1>
	<h2>Network: <i><c:out value="${show.network}"/></i></h2>
  		
	<table>
		<thead>
			<tr>
	            <th>Name</th>
	            <th>Rating</th>
		    </tr>
		 </thead>
			<tbody>
		        <c:forEach items="${showList}" var="show">
		        <tr>
		            <td><a href="/songs/<c:out value="${show.id}"/>"><c:out value="${show.name}"/></a></td>
		            <td><c:out value="${show.rating}"/></td>
		        </tr>
		        </c:forEach>
		    </tbody>
	</table>
<%--   		<a href="/shows/<c:out value="${show.id}/edit"/>Edit</a>
 --%>	</body>
</html>