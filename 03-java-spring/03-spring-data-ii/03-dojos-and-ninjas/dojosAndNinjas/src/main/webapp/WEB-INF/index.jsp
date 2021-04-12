<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Welcome to the Dojo DB!</h1>
<a href="/dojo/new">Add A Dojo</a>
<p>    </p>
<a href="/ninja/new">Add a Ninja</a>
<table class="table table-dark">
<thead>
<tr>
<td>Dojo Name</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allDojos}" var="dojo">
<tr>
<td><a href="/dojo/${dojo.id}">${dojo.name}</a></td>

</tr>
</c:forEach>
</tbody>
</table>



</div>

</body>
</html>