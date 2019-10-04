<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>



<head>
<meta charset="ISO-8859-1">
<title>Issue Tracking</title>
</head>
<style>
#submit {
	color: orange;
	width: 290px;
	height: 60px;
	outline: none;
}

input[type=submit] {
	color: orange
}

h3 {
	align: center;
}
</style>
<%@include file="HeaderAfterLogin.jsp"%>
<body>
	<h2>
		<table style="width: 100%;">

			<tr>
				<th><input type="Submit" value="Home" id="submit" /></th>
				<th></th>
				<th>Welcome</th>
			</tr>
			<tr>
				<th>
					<form action="RaiseTicketServlet" method="post">
						<input type="hidden" value="${Employee.mail}" name="mailId">
						<input type="hidden" value=<%=request.getAttribute("mailId") %> name="mailId">
						<input type="Submit" value="Raise A Ticket" id="submit" />
					</form>
				</th>
				<th></th>
				<th>Your MailId is:${Employee.mail}</th>
			</tr>
			<tr>
				<th>
					<form action="TicketStatusServlet" method="post">
						<input type="hidden" value="${Employee.mail}" name="mailId">
						<input type="hidden" value=<%=request.getAttribute("mailId") %> name="mailId">
						
						<input type="Submit" value="Ticket Status Update" id="submit" />
					</form>
				</th>
				<th></th>
				<th></th>
			</tr>

		</table>
	</h2>





</body>
</html>
