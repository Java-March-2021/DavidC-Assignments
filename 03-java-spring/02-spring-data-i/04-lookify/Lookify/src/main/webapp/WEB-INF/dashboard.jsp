<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="header">
<a href="/songs/new">Add New</a>
<a href="/search/topTen">Top Songs</a>
<form method="POST" action="/Search/${song.Artist}"></form>
</div>
<div class="container">
<table class="table table-dark">
<thead>
<tr>
<td> </td>
<td>Name</td>
<td>Rating</td>
<td>actions</td>
</tr>
</thead>
<tbody>
<c:forEach items="${song}" var="song">
<tr>
<td>${song.name}</td>
<td>${song.artist}</td>
<td>${song.rating}</td>
<td><a href="/songs/delete/${id}">delete</a> 
</tr>
</c:forEach>
</tbody>

</table>

</div>

</body>
</html>