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
<title>Questions Dashboard</title>

 <link rel="stylesheet" type="text/css" href="css/style.css">
 <script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<h1>Questions Dashboard</h1>

<table class="table table-dark">
<thead>
<tr>
<td>Question</td>
<td>Tags</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allQuestions}" var="question">
<tr>
<td><a href="/question/${question.id}">${question.question}</a></td>
<td>${tag.name}</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="/question/new">New Question</a>
</body>
</html>