<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Page</title>
</head>
<body>
my profile<br/>
Name: <%= request.getParameter("userid")%><br/>
Name: <%out.print(request.getParameter("userid")); %><br/>
tour: hyd to ladakh</br>
duration : 1 month</br>
mode of transport : bike</br>
</body>
</html>