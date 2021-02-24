<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo Survey Index</title>
</head>
<link href="css/style.css" type="text/css" rel="stylesheet">
<body>
	<div id="indexbody">
		<form action = "/result" method="POST">
			<h2>Your Name: <input type="text" name="name"></h2>
			<h2>Dojo Location:</h2> <select name="location">
				<option value="San Jose">Burbank</option>
				<option value="Burbank">Seattle</option>
				<option value="Dallas">Dallas</option>
				<option value="Chicago">Chicago</option>
			</select>
		
			<h2>Favorite Language: <select name="language">
				<option value="Python">Java</option>
				<option value="Python">Python</option>
				<option value="HTML">HTML</option>
			</select></h2>
		<h2>Comments:</h2>
		<textarea name="comment" rows="5" cols="40"></textarea><br>
		<input type="submit" value="Button">
		</form>
	</div>
	
</body>
</html>

