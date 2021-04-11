<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Relationships</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<table class="table table-dark">
<thead>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Licensed?</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allPersons}" var="person">
<tr>
<td><a href="/person/${person.id}">${person.firstName}</a></td>
<td><a href="/person/${person.id}">${person.lastName}</a></td>
<td><a href="/license/new">Get New License</a> 

</tr>
</c:forEach>
</tbody>
</table>
<a href="/person/new">Add Person</a>
</div>
</body>
</html>