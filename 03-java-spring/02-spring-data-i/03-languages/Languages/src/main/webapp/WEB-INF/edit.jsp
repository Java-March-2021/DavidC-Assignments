<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit language</title>
</head>
<body>

<div class="container">

<form action="/langs/edit" method="PUT">
	<div class="form-group">
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<label for="name">Name</label>
		<input type="text" name="name">
	</div>

<div class="form-group">
	<label for="creator">Creator</label>
	<input type="text" name="creator">
</div>


<div class="form-group">
<label for="version">Version</label>
<input type="number" name="pages">
</div>
<button type="submit">submit</button>

</form>


</div>

</body>
</html>