<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
</head>
<body>
<div class="header">
	<h3>Top Ten Songs:</h3>
	<a href="/dashboard">Dashboard</a>
</div>

<div class="topTen">
	<table class="table table-dark">
	<thead>
		<tr>
			<td>Rating</td>
			<td>Title</td>
			<td>Artist</td>
		</tr>
	</thead>
		<tbody>
		<c:forEach items="${songs}" var="song">
		<tr>
		<td>${song.Rating}</td>
		<td>${song.Name}</td>
		<td>${song.Artist}</td>
		</tr>
		</c:forEach>
		</tbody>

</table>



</div>

</body>
</html>