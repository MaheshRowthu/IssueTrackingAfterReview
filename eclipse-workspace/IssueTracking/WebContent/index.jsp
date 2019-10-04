<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body {
	background-image: url("");
	background-size: cover;
	font-family: "Comic Sans MS" sans-serif;
	background-color: #87CEEB;
	marigin: 0;
}

form {
	background-image: url("");
}

#submit {
	color: blue;
	background-color: orange;
}

table, th, tr, td {
	align: center;
	text-align: center;
	width: 100%;
}

input[type='text']
        input[type='date']
        input[type='time']
        input[type='month']
        input[type='number'] 
        input[type='password'] {
	font-size: 18px;
	height: 35px;
	border: none;
	outline: none;
	border-radius: 10px;
}

input[type='text']:focus, input[type='password']:focus, input[type='date']:focus,
	input[type='time']:focus, input[type='month']:focus, input[type='number']:focus,
	textarea:focus {
	box-shadow: 0 0 15px darkred;
	background-color: #AD9A79;
}

textarea {
	border: 1px solid black;
	outline: none;
	border-radius: 10px;
	width: 152px;
}

.button {
	width: 30%;
	border: none;
	font-size: 100px;
	padding: 10px 25px;
	border-radius: 25px;
	background-color: #4CAF50; /* Green */
}

.button:hover {
	box-shadow: 0 0 15px white;
	cursor: pointer;
}

.main-footer {
	background-color: black;
	padding: 10px;
	color: white;
	text-align: center;
}

.main-header {
	background-image:
		url("D:\dec\OnlineResume\WebContent\WEB-INF\forest.jpg");
	background-color: blue;
	background-size: cover;
	padding: 0px;
	color: white;
	font-size: 22px;
	text-align: right;
}

.main-footer small, .main-footer a {
	color: orange;
}

#form-div {
	align: center;
	width: 50%;
	height: 150%;
	margin: 50px auto;
	align: center;
	background: lightgrey;
	border-radius: 15px;
	background-image: url("user.png");
}

#form-div2 {
	align: center;
	width: 25%;
	padding: 25px;
	border-radius: 15px;
}

h3 {
	font-family: Arial, sans-serif;
	text-align: center;
	font-size: 30px;
	margin: 0;
	color: #5B5349;
}

.textInput {
	height: 28px;
	margin-bottom: 10px;
	border: 1px solid #6B7363;
	font-size: 1.2em;
	padding: 5px;
	width: 95%;
	border-radius: 10px;
}
#option {
  color: red;
  background-color: #87CEEB;
}
</style>

<!--Header-->
<%@ include file="Header.html"%>
<!-- Login  -->
<body>
	<div id="form-div">
		<form action="Login" method="post">
			<table>
				<div>
					<tr>
						<td><h3>Login Here</h3></td>
					</tr>
				</div>
				<div>
					<tr>
						<td><select required  name="type" style="width: 200px; height: 50px;"
							class="textInput" id="option1" >
								<option value="" id="option" disabled selected>You Are</option>
								<option value="normal">Employee</option>
								<option value="admin">Admin</option>
								<option value="tech">Tech Team</option>
						</select></td>
					</tr>
				</div>
				<div>
					<tr>
						<td><input type="email" name="user" placeholder="Your Mail Id"
							class="textInput" id="form-div2" style="width: 155px;" required></td>
					</tr>
				</div>
				<div>
					<tr>
						<td><input type="password" name="pass" placeholder="password"
							class="textInput" id="form-div2" style="width: 155px;" required></td>
					</tr>
				</div>
				<div>
					<tr>
						<td><button value="Login" class="button">Login</button></td>
					</tr>
				</div>
			</table>

		</form>
		<br />
	</div>
</body>

<!--Footer-->
<%@ include file="Footer.html"%>

</body>
</html>