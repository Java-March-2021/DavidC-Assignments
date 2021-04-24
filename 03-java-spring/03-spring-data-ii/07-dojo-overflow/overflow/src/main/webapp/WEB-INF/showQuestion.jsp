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
<title>Show Question</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
 <script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
	<div class="container">
	<h2>${question.question}</h2>
	<h4>Tags: ${taggs.subject}</h4>
	<div class="row">
		<div class="col">
		<div class="table">
		<table class="table table-dark">
		<thead>
		<tr>
		<td>Answers</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${allAnswers}" var="answer">
		<tr>
		<td>${answers.answer}</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	<div class="col">
	<h4>Add your answer</h4>
	<form:form method="POST" action="/question/{id}" modelAttribute="answer" >
	<form:label path="answer">Answer:</form:label>
	<form:errors path="answer"></form:errors>
	<form:textarea class="form-control" path="answer"></form:textarea>
	<button>Answer It!</button>
	</form:form>
	</div>
	</div>
	
	</div>
</body>
</html>