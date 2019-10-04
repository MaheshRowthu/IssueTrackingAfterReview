<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<!-- Login  -->
<%String message=(String)request.getAttribute("errorMessage"); 
out.println(message);
%>
<br>
<form action="./sound" method="POST">  
Name:<input type="text" name="username"/><br/><br/>  
Password:<input type="text" name="password"/><br/><br/>  
<input type="submit" value="login"/>  
<br>
<br>
<br>
</form>

</body>
</html>