<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<style >
	.login-form{
		width: :500px;
		height:240px;
		position: absolute;
		background-color: blue;
		border-radius:20px;
		top:50%;
		left:50%;
		margin-right: -50%;		
		transform: translate(-50%, -50%);
	}
</style>
</head>
<body>
	<h2>${errorMsg}</h2>
	<div class="login-form">
		<div class="container-fluid">
			<form method="post">
				<input type="text" name="userId" class="form-control mt-3" placeholder="username" />
				<input type="password" name="password" class="form-control mt-3"/>
				<center>
					<button class="btn btn-outline-dark btn-block mt-3">Login</button>
				</center>
			</form>
		</div>
	</div>

	
</body>
</html>