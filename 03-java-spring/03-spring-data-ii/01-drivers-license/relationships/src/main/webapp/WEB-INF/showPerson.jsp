<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Person</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<h1>${ person.firstName } ${person.lastName }</h1>
		<c:choose>
		<c:when test="${person.license != null}">
			<p>License Number: ${ person.license.number }</p>
			<p>State: ${ person.license.state }</p>
			<p>Expiration Date: ${person.license.expirationDate}</p>
		</c:when>
		<c:otherwise>
		<p><a href="/license/new">New License Registration</a></p>
		</c:otherwise>
		</c:choose>
	</div>
</body>
</html>