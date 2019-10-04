<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.track.model.Issue"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW RESOLVED TICKETS</title>
</head>
<body>
	<%@include file="HeaderAfterLogin.jsp"%>
	<table border="1" style="width: 100%">
		<center>
			<h1>Resolved Tickets</h1>
		</center>
		<tr>
			<th>IssId</th>
			<th>IssType</th>
			<th>IssDesc</th>
			<th>Priority</th>
			<th>Posted_on</th>
			<th>Solved_on</th>
			<th>EmpId</th>
			<th>SolvedBy</th>
		</tr>

		<%
			List<Issue> adminViewOfResolvedTicketListObj = (List<Issue>) request
					.getAttribute("adminViewOfResolvedTicketListObj");
		%>
		<%
			for (Issue resolvedTicketListToAdminObj : adminViewOfResolvedTicketListObj) {
				out.print("<tr>");
				out.print("<td>" + resolvedTicketListToAdminObj.getIssId() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getEmpId() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getIssType() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getIssDesc() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getPriority() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getStatus() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getPostedOn() + "</td>");
				out.print("<td>" + resolvedTicketListToAdminObj.getTechId() + "</td>");
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>