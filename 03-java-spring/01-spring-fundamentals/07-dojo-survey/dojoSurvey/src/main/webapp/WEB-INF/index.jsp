<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="wrapper">
		<h1>Dojo Survey</h1>
		<form method="Post" action="/">
		<div class="form-group">
				<label class="label">Name</label>	
				<input type="text" name="name">
		</div>
		<div class="form-group">
				<label for="location">Dojo Location</label>
				<select name="location">
					<option value="seattle">Seattle</option>
					<option value="sanjose">SanJose</option>
					<option value="burbank">Burbank</option>
					<option value="chicago">Chicago</option>
				</select>
		</div>
		<div class="form-group">
				<label for="language">Favorite Language</label>
				<select name="language">
					<option value="java">java</option>
					<option value="python">python</option>
					<option value="english">english</option>
					<option value="language">language</option>
				</select>
		</div>
		<h3>Comment (optional):</h3>
			<textarea name="comment" id="comment" cols="30" rows="10">
			</textarea>
			<button class="button">Submit</button>
	</form>
	</div>
</body>
</html>