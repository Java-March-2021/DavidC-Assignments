<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:out value="${2+2}">
</c:out>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
 <script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>What is your question?</h1>
<form:form method="POST" action="/question/new" modelAttribute="question">
<div class="form-group">
<form:label path="question">Question:</form:label>
<form:errors path="question"></form:errors>
<form:textarea class="form-control" path="question" ></form:textarea>
</div>
<div class="form-group">
<form:label path="tags">Tags:</form:label>
<form:errors path="tags"></form:errors>
<form:input class="form-control" path="tags"></form:input>
</div>
<button>Submit</button>
</form:form>
</div>
</body>
</html>