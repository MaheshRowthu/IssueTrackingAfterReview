<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%@include file="HeaderAfterLogin.jsp"%>
<br/>
Your MailId is:${Admin.mail}
<br/>
<br/>
<input type="hidden" value="${Admin.mail}" name="mailId">
<div id="container">
<form action="AdminViewRaisedTickets" method="post">
<input type="hidden" value="${Admin.mail}" name="mailId">
<button id="button1">View Raised Tickets</button>
</form>
<br/>
<form action="AdminViewAssignIssue" method="post">
<input type="hidden" value="${Admin.mail}" name="mailId">
<button id="button2">View Assign Issues</button>
</form>
<br/>
<form action="AdminViewResolvedTicket" method="post">
<input type="hidden" value="${Admin.mail}" name="mailId">
<button id="button3">View Resolved Tickets</button>
</form>
<br/>

<!-- 
<form action="AdminViewTicketStatus" method="post">
<button id="button4">View Ticket Status</button>
</form>
-->

</div>

</body>
</html>