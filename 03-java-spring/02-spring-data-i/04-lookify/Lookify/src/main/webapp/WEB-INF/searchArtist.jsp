<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search by Artist</title>
</head>
<body>
<div class="header">
	<label for="artist">Songs by artist:</label>
	<input type="text" name="artist">
	<a href="/dashboard">New Search</a>
	<a href="/dashboard">Dashboard</a>
</div>

<div class="container">
	<table class="table table-dark">
	<thead>
	<tr>
	<td>Name</td>
	<td>Rating</td>
	<td>actions</td>
	</tr>
	</thead>
<tbody>
<c:forEach items="${song.artist}" var="song">
<tr>
<td>${song.name}</td>
<td>${song.rating}</td>
<td><a href="/songs/delete/${id}">delete</a> 
</tr>
</c:forEach>
</tbody>

</table>

</div>


</body>
</html>