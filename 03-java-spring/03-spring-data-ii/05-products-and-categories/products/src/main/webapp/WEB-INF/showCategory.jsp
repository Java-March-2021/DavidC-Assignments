<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Category</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>${ category.name }</h1>
		
		<h4>Products in the Category</h4>
		<ol>
		<c:forEach items="${category.products }" var="product">
		<li><a href="/product/${product.id}">${product.name}</a></li>
		</c:forEach>
		</ol>
		
	
	

		<a href="/category/edit/${category.id}">Edit Category</a>
	</div>

</body>
</html>