<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="HeaderAfterLogin.jsp"%>
<p>you are tech team</p>
Your MailId is:${techTeam.mail}

<br/>
<br/>
<div id="container">
<form action="TechViewAssignedTicket" method="post">
<input type="hidden" value="${techTeam.mail}" name="mailId">
<button id="button1">View Assigned Tickets</button>
</form>
<br/>
<!-- 
<form action="TechUpdateTicketStatus" method="post">
<button id="button2">Update Ticket Status</button>
</form>
 -->
<br/>
<form action="TechViewResolvedTicket" method="post">
<input type="hidden" value="${techTeam.mail}" name="mailId">
<button id="button3">View Resolved Tickets</button>
</form>
<br/>
</div>
</body>
</html>