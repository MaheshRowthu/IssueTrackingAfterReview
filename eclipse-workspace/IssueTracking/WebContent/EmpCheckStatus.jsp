<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.List,com.track.model.Issue" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW RAISED TICKETS</title>
<p align="left">
<h3>VIRTUSA</h3>
</p>
</head>
<body>
<%@include file="HeaderAfterLogin.jsp"%>
	<table border="1" style="width: 100%">
		<center>
			<h1>Raised Tickets</h1>
		</center>
		<tr>
			<th>IssId</th>
			<th>Employee Id</th>
			<th>IssType</th>
			<th>IssDesc</th>
			<th>Priority</th>
			<th>Status</th>
			<th>Posted On</th>
			<th>Solved On</th>
			<th>Solved By</th>
		</tr>
		
<%List<Issue> raisedIssueStatus=(List<Issue>)request.getAttribute("raisedIssueStatus"); %>		
		<%for(Issue issueObj2:raisedIssueStatus) 
		{
			out.print("<tr>");
			out.print("<td>"+issueObj2.getIssId() +"</td>");
			out.print("<td>"+issueObj2.getEmpId() +"</td>");
			out.print("<td>"+issueObj2.getIssType() +"</td>");
			out.print("<td>"+issueObj2.getIssDesc() +"</td>");
			out.print("<td>"+issueObj2.getPriority() +"</td>");
			out.print("<td>"+issueObj2.getStatus() +"</td>");
			out.print("<td>"+issueObj2.getPostedOn() +"</td>");
			out.print("<td>"+issueObj2.getSolvedOn() +"</td>");
			out.print("<td>"+issueObj2.getTechId()+"</td>");
			out.print("</tr>");
		}%>
		
	</table>
</body>
</html>
