<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<h1>New License</h1>

<form:form action="/license/new" method="POST" modelAttribute="license">
		<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
			<form:label path="license">Person</form:label>
			<form:select class="form-control" path="person" >
				<c:forEach items="${ persons }"  var="p">
    				<form:option value="${person.id}">${ person.firstName }${ person.lastName }</form:option>
				</c:forEach>
			</form:select>
		</div>
	<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<form:label path="State">State</form:label>
		<form:input class="form-control" path="State"/>
	</div>
		<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<form:label path="expirationDate">Expiration Date</form:label>
		<form:input class="form-control" path="expirationDate"/>
	</div>
	<button type="submit">Create</button>
	
</form:form>	
</div>
</body>
</html>