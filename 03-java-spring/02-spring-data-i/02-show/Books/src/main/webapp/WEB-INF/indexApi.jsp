<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<table class="table table-dark">
<thead>
<tr>
<td>Title</td>
<td>Description</td>
<td>Language</td>
<td>Number of Pages</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allBooks}" var="book">
<tr>
<td>${book.id}</td>
<td>${book.title}</td>
<td>${book.description}</td>
<td>${book.language}</td>
<td>${book.numberOfPages}</td>
</tr>
</c:forEach>
</tbody>





</table>








</div>


</body>
</html>