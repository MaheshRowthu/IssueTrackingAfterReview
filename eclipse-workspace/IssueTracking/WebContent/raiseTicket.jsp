<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input[type=text], input[type=number], input[type=mail], select, textarea
	{
	border: 1px solid #ccc;
	border-radius: 4px;
}
</style>
<body>
	<%@include file="HeaderAfterLogin.jsp"%>
	<h1>Issue Details Form:</h1>
	<div align="center">
		<form action="Sucessful" method="post" class="form" id="form">
			<table>
				<tr>
					<td><input type="hidden" name="mailId"
						value=<%=request.getAttribute("mailId")%>> Employee Id :</td>
					<td><input type="number"  name="empId" min="1901" max="1905"
						required></td>
				</tr>
				<tr></tr>
				<!-- 	<tr>
					<td>Employee MailId :</td>
					<td><input type="mail" size="30" maxlength="30" name="empMail"
						required></td>
				</tr>
				 -->
				<tr></tr>
				<tr>
					<td>Category :</td>
					<td><select required name="Category">
							<option value="" disabled selected>Select</option>
							<option value="Software">Software</option>
							<option value="Physical Workstation">Physical Workstation</option>
							<option value="Hardware">Hardware</option>
					</select></td>
				</tr>
				<tr></tr>
				<tr>
					<td>Issue Description :</td>
					<td><textarea rows="3" cols="80" name="IssueDesc" required></textarea>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>Priority:</td>
					<td><select name="Priority">
							<option value="" disabled selected>Select</option>
							<option value="1">1-High</option>
							<option value="2">2-Above Average</option>
							<option value="3">3-Average</option>
							<option value="4">4-Below Average</option>
							<option value="5">5-Low</option>
					</select></td>
				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td><input type="Submit" value="Submit" name="submit">
					</td>
				</tr>
				<tr></tr>
			</table>
		</form>
	</div>
</body>
</html>



