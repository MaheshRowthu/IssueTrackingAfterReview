<!DOCTYPE html>
<html>
<style>
body {
	background-image: url("");
	background-size: cover;
	font-family: "Comic Sans MS" sans-serif;
	background-color: #87CEEB;
	marigin: 0;
	background-size: cover;
	font-family: "Comic Sans MS" sans-serif;
	background-color: #87CEEB;
}

form {
	align: right;
}

h1 {
	text-align: center;
	color: white;
}

h3 {
	text-align: right;
}

h4 {
	text-align: left;
	color: orange;
}

h6 {
	color: orange;
}

input[type='text']
        input[type='date']
        input[type='time']
        input[type='month']
        input[type='number'] {
	font-size: 18px;
	height: 35px;
	border: none;
	outline: none;
	border-radius: 10px;
}

input[type='text']:focus, input[type='date']:focus, input[type='time']:focus,
	input[type='month']:focus, input[type='number']:focus, textarea:focus {
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
	background-color: orange;
	color: white;
	border: none;
	font-size: 25px;
	padding: 10px 25px;
	border-radius: 10px;
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
	background-image: url(".png");
	background-color: black;
	background-size: cover;
	padding: 0px;
	color: white;
	font-size: 15px;
	text-align: right;
}

.main-footer small, .main-footer a {
	color: orange;
}
</style>

<head>
<title>Issue Tracking</title>
</head>
<body>
	<!-- Main Header -->
	<header class="main-header">
		
		
		<form action="LogoutServlet" method="post">
			<h1>
				<i>Issue Tracking</i>
			</h1>
			<h4>Virtusa IT Services</h4>
			<h3>
				<input type="submit" value="Logout"> &nbsp;
			</h3>
		</form>

	</header>

</body>
</html>