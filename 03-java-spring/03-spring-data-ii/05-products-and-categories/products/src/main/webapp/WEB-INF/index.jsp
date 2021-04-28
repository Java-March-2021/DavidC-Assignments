<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<div class="container">
<h1>Welcome to Stuff Dot Com!</h1>
<a href="category/new">Click to add a new Category!</a> | <a href="product/new">  Click to add a new Product!</a> |
<a href="/products">See all our Products!</a>
<table class="table table-dark">
<thead>
<tr>
<td>Categories of Products</td>
<td>Number of Products</td>
<td>Action</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allCategories}" var="category">
<tr>
<td><a href="/category/${category.id}">${category.name}</a></td>
<td>${category.products.size()}</td>
<td><a href="/category/delete/${category.id }">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>



</div>
</body>
</html>