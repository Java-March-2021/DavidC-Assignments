<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<h1>${ product.name }</h1>
	<h3>${ product.description}</h3>
	<h4>Price: $ ${product.price}</h4>
	<h3>Category:</h3>
	<ol>
	<c:forEach items="${product.categories}" var="category">
	<li>${category.name}</li>
	</c:forEach> 
	</ol>
		<form action="/category/${category.id }" method="post">
			<input type="hidden" name="method" value="delete"/>
			<input type="submit" value="Delete" />
		
		</form>
		<a href="/product/edit/${product.id}" class="btn btn-danger">Edit Product</a>
	</div>
</body>
</html>