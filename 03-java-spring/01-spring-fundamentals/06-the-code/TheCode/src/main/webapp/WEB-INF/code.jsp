<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${2+2}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WhatisThecode?</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>What is the code?</h1>
<form method="POST" action="/">
<label>Code: <input type="text" name="guess"></label>
<button>Try Code</button>
</form>


</body>
</html>