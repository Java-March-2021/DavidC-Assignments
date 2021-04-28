<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
<h3>New Product</h3>
<form:form method="POST" action="/product/new" modelAttribute="product">

<div class="form-group">
<form:label path="name">Name:
<form:errors path="name"/>
<form:input path="name"/>
</form:label>
</div>
<div class="form-group">
<form:label path="description">Description:
<form:errors path="description"/>
<form:input path="description"/>
</form:label>
</div>
<div class="form-group">
<form:label path="price">Price:
<form:errors path="price"/>
<form:input path="price"/>
</form:label>
</div>

<button>Add Product</button>
</form:form>



</div>
</body>
</html>