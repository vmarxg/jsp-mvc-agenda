<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1>
<title>Projeto fj21-agenda</title>

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<link href="http://localhost:8080/jsp-agenda-mvc/assets/css/login.css" rel="stylesheet">

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Login via site</h3>
					</div>
					<div class="panel-body">
						<form accept-charset="ISO-8859-1" role="form">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="yourmail@example.com"
										name="email" type="text">
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="password" type="password" value="">
								</div>
								<div class="checkbox">
									<label> <input name="remember" type="checkbox"
										value="Remember Me"> Remember Me
									</label>
								</div>
								<input class="btn btn-lg btn-success btn-block" type="submit"
									value="Login">
							</fieldset>
						</form>
						<hr />
						<h4 style="text-align:center">OU</h4>
						<input class="btn btn-lg btn-facebook btn-block" type="submit"
							value="Login via facebook">
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>