<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Category</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h3>Edit ${category.name }</h3>

<form action="/category/edit/${category.id}" method="POST">
<div class="form-group">
	<label for="name">Name</label>
	<input type="text" name="name" value="${category.name}"/>
</div>
<div class="form-group">
	<label for="products">Add a Product to this Category:</label>
		<select name="product_id">
		<c:forEach items="${allProducts}" var="product">
		<option value="${product.id}">${product.name}</option>
		</c:forEach>
		</select>
</div>
<button>Submit Changes</button>
</form>
</div>
</body>
</html>