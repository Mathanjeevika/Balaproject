<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="plugincss/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="plugincss/fontawesome-free/css/all.min.css">
<link rel="stylesheet" href="customcss/custom.css">
</head>
<body>
	<div class="container login-box">

		<div class="offset-md-4 col-md-4 login-container">
			<div class="app-title text-center">School Management</div>
			<form id="login-form">
				<div class="form-group row divider">
					<input type="text" class="form-control form-control-sm"
						id="userName" name="userName" placeholder="User Name">

				</div>
				<div class="form-group row divider">
					<input type="password" class="form-control form-control-sm"
						name="password" id="password" placeholder="Password">
				</div>

				<div class="form-group row text-right divider">
					<div class=" col-md-6  col-sm-6">
						<button type="submit" class="btn btn-reset btn-sm btn-block">
							<i class="fa fa-sign-in" aria-hidden="true"></i> Reset
						</button>
					</div>
					<div class=" col-md-6  col-sm-6">
						<button type="submit" class="btn btn-info btn-sm btn-block ">
							<i class="fa fa-sign-in"></i> Sign in
						</button>
					</div>
				</div>
			</form>

		</div>
	</div>


</body>
<!-- jQuery -->
<script src="pluginjs/jquery/jquery.min.js"></script>

<!-- Bootstrap 4 -->
<script src="pluginjs/bootstrap/bootstrap.min.js"></script>

<script src="pluginjs/jquery-validation/jquery.validate.min.js"></script>

<script src="customjs/login-validate.js"></script>
</html>