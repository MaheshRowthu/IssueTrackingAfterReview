<%@page import="com.track.model.TechEngineer,java.util.List"%>
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
	<p>Please select one Technical Engineer</p>
	Current Issue Id is:
	<%=request.getAttribute("currentIssueId")%><br/>
	Assigning with priority of:
	<%=request.getAttribute("priority") %>
	<center>
		<h1>Assigning issue to Tech Engineer</h1>
	</center>
	<table border="3" style="width: 100%">

		<tr>
			<th>Tech Id</th>
			<th>Tech Name</th>
			<th>Assign</th>
		</tr>

		<%
			List<TechEngineer> techTeamList = (List<TechEngineer>) request.getAttribute("techTeamList");
		%>
		<%
			for (TechEngineer techEngineerListObj : techTeamList) {

				out.print("<tr>");
				out.print("<td>" + techEngineerListObj.getTechId() + "</td>");
				out.print("<td>" + techEngineerListObj.getTechName() + "</td><td>");
		%>
		
		<form action="AssignIssueToTechEngineer" method="post">
			<input type="hidden" value=<%=techEngineerListObj.getTechId()%>
				name="techId"> 
				
				<input type="hidden"
				value=<%=request.getAttribute("currentIssueId")%>				
				name="currentIssueId">
				
				<input type="hidden" value=<%=request.getAttribute("priority") %> name="priority">
				
				 <input type="hidden" name="Assign"
				value="assign"> <input type="submit" value="Assign">
		</form>

		<%
				out.print("</td>");
				out.print("</td></tr>");
			}
		%>
	</table>
</body>
</html>