<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>
	<h1>${ book.title }</h1>
	<p>Description: ${ book.description }</p>
	<p>Language:  ${ book.language }</p>
	<blockquote>Number of pages: ${ book.numberOfPages } </blockquote>
	<a href="/books/${book.id}/edit">Edit Book</a>
	<form action="/books/${book.id}" method="post">
    	<input type="hidden" name="method" value="delete">
    	<input type="submit" value="Delete">
	</form>
</body>
</html>