<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RequestReadServlet" method="post">
<input type="text"name="userid"><br/>
<input type="password" name="password"><br/>
<input type="hidden" name="sessionid" value="sess123"><br/>
Languages you are comfortable with <br/>
<input type="checkbox" name="lang1" value="java">Java<br/>
<input type="checkbox" name="lang2" value="c">C<br/>
<input type="checkbox" name="lang3" value="c++">C++<br/>
Choose one option <br/>
<input type="radio" name="sex" value="m"> Male <br/>
<input type="radio" name="sex" value="f"> Female <br/>
<input type="radio" name="sex" value="o"> Others <br/>
Choose difficulty level<br/>
<select name="difficulty">
<option value="easy">Easy</option>
<option  value="medium">Medium</option>
<option  value="expert">Expert</option>
</select>
<input type="submit" value="Submit">
</form>
</body>
</html>