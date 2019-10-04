<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue Tracking</title>
</head>
<body>
<%@include file="HeaderAfterLogin.jsp"%>
<p><%=request.getAttribute("issueId") %>Issue resolved by you(<%=request.getAttribute("techId") %>)</p>
</body>
</html>