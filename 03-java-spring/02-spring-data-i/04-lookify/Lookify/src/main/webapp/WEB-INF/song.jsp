<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Detail</title>
</head>
<body>
	<h3>Title:  ${ song.Name }</h3>
	<h3>Artist: ${ song.Artist }</h3>
	<h3>Rating (1-10) ${ song.Rating }</h3>
	<form action="/songs/${song.id}" method="post">
    	<input type="hidden" name="method" value="delete">
    	<input type="submit" value="Delete">
	</form>
</body>
</html>