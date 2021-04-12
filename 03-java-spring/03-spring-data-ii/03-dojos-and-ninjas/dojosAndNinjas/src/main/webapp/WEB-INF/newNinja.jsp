<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<h1>New Ninja</h1>
	<form:form method="POST" action="/ninja/new" modelAttribute="ninja">
		<div class="form-group">
		<form:label path="dojo">Dojo:</form:label>
		<form:errors path="dojo"/>  
			<form:select class="form-control" path="dojo" >
				<c:forEach items="${ allDojos }"  var="dojo">
    				<option value="${dojo.id}">${ dojo.name }</option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<form:errors path="dojo"/>
			<form:label path="${dojo}">First Name</form:label>
			<form:input class="form-control" path="firstName"/>
		</div>
		<div class="form-group">
			<form:errors path="dojo"/>
			<form:label path="${dojo}">Last Name</form:label>
			<form:input class="form-control" path="lastName"/>
		</div>
			<div class="form-group">
			<form:label path="${dojo}">Age</form:label>
			<form:input class="form-control" path="age"/>
		</div>
		<button type="submit">Create</button>
	</form:form>

</div>

</body>
</html>