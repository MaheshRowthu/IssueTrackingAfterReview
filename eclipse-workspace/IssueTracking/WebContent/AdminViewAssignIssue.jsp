<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.track.model.Issue"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>VIEW ASSIGNED TICKETS</title>
</head>
<body>
	<%@include file="HeaderAfterLogin.jsp"%>
	<table border="3" style="width: 100%">
		<center>
			<h1>Assigned Tickets</h1>
		</center>
		<tr>
			<th>IssId</th>
			<th>EmpId</th>
			<th>IssType</th>
			<th>IssDesc</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Posted_on</th>
			<th>AssignedTo</th>
		</tr>
		<%
			List<Issue> viewOfAssignIssueListObj = (List<Issue>) request.getAttribute("viewOfAssignIssueListObj");
		%>
		<%
			for (Issue issueListOfAssignedObj : viewOfAssignIssueListObj) {
				out.print("<tr>");
				out.print("<td>" + issueListOfAssignedObj.getIssId() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getEmpId() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getIssType() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getIssDesc() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getPriority() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getStatus() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getPostedOn() + "</td>");
				out.print("<td>" + issueListOfAssignedObj.getTechId() + "</td>");
				out.print("</tr>");
			}
		%>

	</table>
</body>
</html>