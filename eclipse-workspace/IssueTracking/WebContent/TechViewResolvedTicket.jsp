<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ page import="java.util.List,com.track.model.Issue"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> VIEW RESOLVED TICKETS</title>
</head>
<body>
<%@include file="HeaderAfterLogin.jsp"%>
<table border = "3" style="width:100%">
<center>
<h1>Resolved Tickets</h1>
</center>
<tr>
<th>IssId</th>
<th>EmpId</th>
<th>IssType</th>
<th>IssDesc</th>
<th>Priority</th>
<th>status</th>
<th>Posted_on</th>
<th>Solved_on</th>
</tr>
		<%
		List<Issue> viewOfTechTeamResolvedIssueListObj = (List<Issue>) request.getAttribute("viewOfTechTeamResolvedIssueListObj");
		%>
		<%
			for (Issue resolvedTicketListToTechTeamObj : viewOfTechTeamResolvedIssueListObj) {
				
				out.print("<tr>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getIssId() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getEmpId() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getIssType() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getIssDesc() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getPriority() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getStatus() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getPostedOn() + "</td>");
				out.print("<td>" + resolvedTicketListToTechTeamObj.getSolvedOn() + "</td>");
				out.print("</tr>");
			}
		%>
 
</table>
</body>
</html>