<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<div class="container">
<h1>Our Products</h1>
<a href="product/new">  Click to add a new Product!</a> | <a href="/">Return to Categories</a>
<table class="table table-dark">
<thead>
<tr>
<td>Products</td>
<td>Category</td>
<td>Action</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allProducts}" var="product">
<tr>
<td><a href="/product/${product.id}">${product.name}</a></td>
<td>${product.categories.size()}</td>
<td><a href="/product/delete/${product.id }">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>
