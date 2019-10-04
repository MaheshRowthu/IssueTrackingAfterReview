<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin data</title>
</head>
<body>
<h1>administrator</h1>
<%= request.getAttribute("name") %><br/>
<%= request.getAttribute("book") %><br/>
<%= request.getAttribute("students") %><br/>
</body>
</html>