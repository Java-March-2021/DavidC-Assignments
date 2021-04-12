<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Dojo</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>${ dojo.name } </h1>
		<table class="table table-dark">
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojo.ninja}" var="ninja">
				<tr>
					<td>${ ninja.firstName } $ { ninja.lastName } </td>
					<td>${ninja.age}</td>
					<td><a href="/delete/${ninja.id}">Delete from Dojo</a></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
</body>
</html>