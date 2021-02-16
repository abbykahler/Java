<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold Game</title>
</head>
<body>
	<div class="body"> 
	<h2>Your Gold: <input class="form-control" type="text" value ="${gold}"> </h2>
	<form action="process" method="post">
	<!-- <input type="hidden" name= "str" ><input type="hidden" name= "min" value="0"><input type="hidden" name= "max" value="0">
	<input class="form-control" type="hidden" name= "reset" value ="reset">
	<button class="btn btn-danger" type = "submit"> Reset</button> -->
	</form>
</div>

<div class="container1">
	<div class="row">
		<div class="ninjagold">
		<h2>Farm</h2>
		<p>(earns 10-20 Gold)</p>
			<form  action="process" method="post" >
			<input type="hidden" name= "str" value ="'>You entered a farm and ">
			<input type="hidden" name= "min" value ="10">
			<input type="hidden" name= "max" value ="10">
			  <button type="submit" class="ninja">Find Gold!</button>
			</form>
		</div>
		
		<div class="container2">
		<h2>Cave</h2>
		<p>(earns 5-10 Gold)</p>
			<form action="process" method="post" >
			<input type="hidden" name= "str" value ="'>You entered a cave and ">
			<input type="hidden" name= "min" value ="5">
			<input type="hidden" name= "max" value ="5">
			  <button type="submit" class="ninja">Find Gold!</button>
			</form>
		</div>
		<div class="container3">
		<h2>House</h2>
		<p>(earns 2-5 Gold)</p>
			<form action="process" method="post" >
			<input type="hidden" name= "str" value ="'>You entered a house and ">
			<input type="hidden" name= "min" value ="2">
			<input type="hidden" name= "max" value ="3">
			  <button type="submit" class="ninja">Find Gold!</button>
			</form>
		</div>
		<div class="container4">
		<h2>Casino</h2>
		<p>(earns/takes 0-50 Gold)</p>
			<form action="process" method="post" >
			<input type="hidden" name= "str" value ="'>You have entered a casino and ">
			<input type="hidden" name= "min" value ="-50">
			<input type="hidden" name= "max" value ="100">
			  <button type="submit" class="ninja">Find Gold!</button>
			</form>
		</div>
	</div>
</div>

<div class="container">
	<h2> Activities: </h2>
	<p> 
		<c:forEach var="item" items="${log}">
	    ${item}<br>
		</c:forEach>
	<p>
</div>
</body>
</html>