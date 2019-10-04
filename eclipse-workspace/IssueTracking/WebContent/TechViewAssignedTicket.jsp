<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,com.track.model.Issue"%>
<!DOCTYPE html>
<html>
<head>
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
			<th>Resolve</th>
			
		</tr>

		<%
			List<Issue> viewOfTechTeamAssignedIssueListObj = (List<Issue>) request.getAttribute("viewOfTechTeamAssignedIssueListObj");
		%>
		<%
			for (Issue issueListOfAssignedToTechTeamObj : viewOfTechTeamAssignedIssueListObj) {
				out.print("<tr>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getIssId() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getEmpId() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getIssType() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getIssDesc() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getPriority() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getStatus() + "</td>");
				out.print("<td>" + issueListOfAssignedToTechTeamObj.getPostedOn() + "</td><td>");
				
				%>
 				
				<form action="IssueResolvedByTechTeam" method="post" >
				<input type="hidden" value=<%=issueListOfAssignedToTechTeamObj.getTechId() %> name="techId">
				<input type="hidden" value=<%=issueListOfAssignedToTechTeamObj.getIssId()  %> name="currentIssueId">
				<input type="hidden" name="Assign" value="assign">
				<input type="submit"  value="Resolved">
				</form>
				 
			<%
				out.print("</td></tr>");
			}
		%>
	</table>
</body>
</html>