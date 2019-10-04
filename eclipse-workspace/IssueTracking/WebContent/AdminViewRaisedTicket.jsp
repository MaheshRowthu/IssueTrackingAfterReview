<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.track.model.Issue"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW RAISED TICKETS</title>
</head>

<body>
<%@include file="HeaderForAdminWithHomeButton.jsp"%>
	<table border="1" style="width: 100%">
		<center>
			<h1>Raised Tickets</h1>
		</center>
		<tr>
			<th>IssId</th>
			<th>EmpId</th>
			<th>IssType</th>
			<th>IssDesc</th>
			<th>Priority</th>
			<th>Posted_on</th>
			<th>Assigning With</th>
			<th>Assgin To</th>
		</tr>

		<%
			List<Issue> raisedIssueList = (List<Issue>) request.getAttribute("raisedIssueList");
		%>
		<%
			for (Issue issueListRaisedObj : raisedIssueList) {
				out.print("<tr>");
				out.print("<td>" + issueListRaisedObj.getIssId() + "</td>");
				out.print("<td>" + issueListRaisedObj.getEmpId() + "</td>");
				out.print("<td>" + issueListRaisedObj.getIssType() + "</td>");
				out.print("<td>" + issueListRaisedObj.getIssDesc() + "</td>");
				out.print("<td>" + issueListRaisedObj.getPriority() + "</td>");
				out.print("<td>" + issueListRaisedObj.getPostedOn() + "</td><td>");
		%>
		<form action="AdminAssignToEngineer" method="post">

			<select required name="priority">
			<option value="" disabled selected>Select</option>
				<option value="1">1-High</option>
				<option value="2">2-Above Average</option>
				<option value="3">3-Average</option>
				<option value="4">4-Below Average</option>
				<option value="5">5-Low</option>
			</select>
		</td>
		<td><input type="hidden" name="issueId"
			value=<%=issueListRaisedObj.getIssId()%>> <input
			type="submit" value="AssignTo">
			</form> <%
 				out.print("</td></tr>");
 	}
 %>
	</table>	
</body>
</html>