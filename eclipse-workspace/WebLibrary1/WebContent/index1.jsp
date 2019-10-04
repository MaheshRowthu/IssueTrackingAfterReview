<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Home for User</h1>
<% String message=(String) request.getAttribute("errorMessage");
		out.print(message);%><br/>
<form action="LoginServlet" method="post">
	User Name : <input type ="text" name = "userid"/><br/>
	Password : <input type = "password" name = "password" /><br/>
	<input type = "submit" value="login"/>
	</form>
</body>
</html>