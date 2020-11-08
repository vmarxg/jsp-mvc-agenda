<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		<table class="table table-responsive">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Endereço</th>
					<th>Data Nascimento</th>
				</tr>
			</thead>
			<tbody class="table-striped">
				<c:forEach var="contato" items="${contatos}" varStatus="id">
					<tr style="background: ${id.count% 2== 0? '#AE8': '#FFF'}">
						<td>${contato.id}</td>
						<td>${contato.nome}</td>
						<!-- Substituindo o uso apenas o IF para o c:choose-->
						<td><c:choose>
								<c:when test="${not empty contato.email}">
									<a href="mailto:${contato.email}">${contato.email}</a>
								</c:when>
								<c:otherwise>E-mail não informado</c:otherwise>
							</c:choose></td>
						<td>${contato.endereco}</td>
						<td><fmt:formatDate value="${contato.dataNascimento.time}"
								pattern="dd/MM/yyyy" /></td>													
						<td><a href="contatos?logica=EditaContato&id=${contato.id}">Editar</a>
						<td><a href="contatos?logica=RemoveContato&id=${contato.id}">Remover</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<!-- <a href="contatos?logica=AdicionaContatoForm">Adicionar Contato</a> -->
		<!-- ou -->
		<input type="button" onclick="location.href='contatos?logica=AdicionaContatoForm';" value="Adicionar Contato" class="btn btn-primary btn-lg"/>
		
	</div>
	<!-- fim .container -->
	<c:import url="../../template/rodape.jsp" />
</body>
</html>
