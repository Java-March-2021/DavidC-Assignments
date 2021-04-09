<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>language</title>
</head>
<body>
	<div class="container">
	<a href="dashboard"></a>
	<h5>${ lang.name }</h5>
	<h5>${ lang.creator }</h5>
	<h5>${ lang.version }</h5>
	<a href="/langs/edit/${id}">Edit</a> 
	<a href="/langs/delete/${id}">Delete</a> 
	
	
	</div>
</body>
</html>