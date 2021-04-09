<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<body>
<div class="container">
<table class="table table-dark">
<thead>
<tr>
<td> </td>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>action</td>
</tr>
</thead>
<tbody>
<c:forEach items="${langs}" var="lang">
<tr>
<td>${lang.id}</td>
<td>${lang.name}</td>
<td>${lang.creator}</td>
<td>${lang.version}</td>

<td><a href="/langs/delete/${id}">Delete</a> 
<td><a href="/langs/edit/${id}">Edit</a> 
</tr>
</c:forEach>
</tbody>





</table>








</div>





</body>
</html>