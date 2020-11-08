<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="datepicker"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto fj21-agenda</title>

<link href="../assets/css/jquery.css" rel="stylesheet">
<link href="../assets/css/bootstrap.css" rel="stylesheet">
<link href="../assets/css/bootstrap-theme.css" rel="stylesheet">
<script src="../assets/js/jquery.js"></script>
<script src="../assets/js/jquery-ui.js"></script>

</head>

<body>
<c:import url="../../template/cabecalho.jsp" />

<div class="container">
	<div class="panel">
		<form action="contatos?logica=AdicionaContato" method="POST">
			<fieldset>
				<legend>Dados do contato</legend>
				<div class="form-group">
					<label for="nome">Nome</label>
					<div class="input-group">
						<input type="text" name="nome" required autofocus>
					</div>
				</div>
				<div class="form-group">
					<label for="email">Email</label>
					<div class="input-group">
						<input type="email" name="email" placeholder="email@exemplo.com"
							required>
					</div>
				</div>
				<div class="form-group">
					<label for="endereco">Endereço</label>
					<div class="input-group">
						<input type="text" name="endereco" required>
					</div>
				</div>
				<div class="form-group">
					<label for="dataNascimento">Data Nascimento</label>
					<div class="input-group">
						<!-- <input type="text" name="dataNascimento" required/> -->
						<datepicker:campoData id="dataNascimento" />					
					</div>
				</div>
				<br>
				<div>
					<input type="submit" value="Gravar contato" class="btn btn-primary btn-lg" />
				</div>
			</fieldset>
		</form>
	</div>
	<!-- fim .panel -->
</div>
<!-- fim .container -->
<c:import url="../../template/rodape.jsp" />
</body>
</html>