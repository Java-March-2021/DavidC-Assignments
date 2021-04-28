<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h3>Edit ${product.name}</h3>

<form action="/product/edit/${product.id }" method="POST">
		<div class="form-group">
		<label for="name">Name</label>
		<input type="text" name="name" value="${product.name}"/>
	</div>
		<div class="form-group">
		<label for="description]">Description</label>
		<input type="text" name="description" value="${product.description}"/>
	</div>
		<div class="form-group">
		<label for="price">price</label>
		<input type="text" name="price" value="${product.price}"/>
	</div>
	<div class="form-group">
		<label for="categories">Put this Product in Category:</label>
		<select name="category_id">
		<c:forEach items="${allCategories}" var="category">
		<option value="${category.id}">${category.name}</option>
		</c:forEach>
		</select>
	</div>
	<button>Submit Changes</button>
</form>
</div>
</body>
</html>