<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">

<form action="/books/edit" method="PUT">
	<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<label for="title">Title</label>
		<input type="text" name="title">
	</div>

<div class="form-group">
	<label for="description">Description</label>
	<input type="text" name="description">
</div>

<div class="form-group">
	<label for="language">Language</label>
	<input type="text" name="language">
</div>

<div class="form-group">
<label for="pages">Pages</label>
<input type="number" name="pages">
</div>
<button type="submit">submit</button>

</form>


</div>
</body>
</html>