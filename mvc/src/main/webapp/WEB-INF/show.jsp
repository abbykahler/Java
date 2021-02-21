<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book Info</title>
</head>
<body>
	<h2><c:out value="${book.title}"/></h2>
	<p>Description: <c:out value="${book.description}"/></p>
	<p>Language: <c:out value="${book.language}"/></p>
	<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
	<br>
	<a href="/books/${book.id}/edit"><button>Edit Book</button></a>
	<a href="/books/delete/${book.id}"><button>Delete</button></a>
	
</body>
</html>