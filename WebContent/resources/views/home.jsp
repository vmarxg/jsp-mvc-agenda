<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1>
<title>Projeto fj21-agenda</title>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="http://localhost:8080/jsp-agenda-mvc/assets/css/home.css" rel="stylesheet">

</head>
<body>
	<div class="carousel fade-carousel slide" data-ride="carousel"
		data-interval="4000" id="bs-carousel">
		<!-- Overlay -->
		<div class="overlay"></div>

		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#bs-carousel" data-slide-to="0" class="active"></li>
			<li data-target="#bs-carousel" data-slide-to="1"></li>
			<li data-target="#bs-carousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item slides active">
				<div class="slide-1"></div>
				<div class="hero">
					<hgroup>
						<h1>AGENDA</h1>
						<h3>Projeto Agenda de Contatos POO-II</h3>
					</hgroup>
					<!-- <button  role="button">Contatos</button> -->
					<input class="btn btn-hero btn-lg" type="button" onclick="location.href='app/contatos?logica=ListaContatos'" value="Contatos" />
				</div>
			</div>
			<div class="item slides">
				<div class="slide-2"></div>
				<div class="hero">
					<hgroup>
						<h1>AGENDA</h1>
						<h3>Projeto Agenda de Contatos POO-II</h3>
					</hgroup>
					<button class="btn btn-hero btn-lg" role="button">See all
						features</button>
				</div>
			</div>
			<div class="item slides">
				<div class="slide-3"></div>
				<div class="hero">
					<hgroup>
						<h1>AGENDA</h1>
						<h3>Projeto Agenda de Contatos POO-II</h3>
					</hgroup>
					<button class="btn btn-hero btn-lg" role="button">See all
						features</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>