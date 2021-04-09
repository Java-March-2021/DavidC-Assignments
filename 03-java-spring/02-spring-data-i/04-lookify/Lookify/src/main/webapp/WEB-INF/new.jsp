<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Song</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">

<form action="/songs/new" method="POST">
	<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<label for="Name">Name</label>
		<input type="text" name="Name">
	</div>

<div class="form-group">
	<label for="Artist">Artist</label>
	<input type="text" name="artist">
</div>

<div class="form-group">
<label for="rating">Rating</label>
<select id="rating" name="rating">
	<option value="1">1</option>
	<option value="2">2</option>	
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
</select>
</div>
<button type="submit">Add Song</button>

</form>


</div>

</body>
</html>