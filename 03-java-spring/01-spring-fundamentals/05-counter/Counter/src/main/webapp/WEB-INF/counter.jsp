<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>your_server/counter</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>You have visited <c:out value="${currentCount}"/> times</h1>
<c:forEach items="${timesVisited}" var="tv">
</c:forEach>
		<a href="/"><button>Test Another Visit?</button></a>
		<a href="/reset"><button>Reset Session</button></a>
</body>


</html>