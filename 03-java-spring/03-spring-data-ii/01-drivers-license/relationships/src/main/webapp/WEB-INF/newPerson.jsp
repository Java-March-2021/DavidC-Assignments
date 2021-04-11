<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<div class="container">
<h1>New Person</h1>
<form action="/person/new" method="POST">
	<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<label for="firstName">First Name:</label>
		<input type="text" name="firstName">
	</div>

<div class="form-group">
		<c:forEach items="${errors}" var="err">
		<p>${err}</p>
		</c:forEach>
	<label for="lastName">Last Name:</label>
	<input type="text" name="lastName">
</div>


<button type="submit">Create</button>
</form>
</div>
</body>
</html>