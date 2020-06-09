
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, br.com.seriando.model.Produto"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.10.2/css/all.css"
	integrity="sha384-rtJEYb85SiYWgfpCr0jn174XgJTn4rptSOQsMroFBPQSGLdOC5IbubP6lJ35qoM9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Lista De Filmes</title>
</head>
<body>
	<h5 class="card-header text-center bg-dark text-white">
		<a href="/views/inicio.jsp"
			class="text-decoration-none text-white"><i
			class="fas fa-arrow-left float-left"></i></a> LISTA DE FILMES
	</h5>
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th scope="col">Titulo</th>
				<th scope="col">Descrição</th>
				<th scope="col">Atores</th>
				<th scope="col">Duração</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${filmes}" var="produto">
				<tr>
					<th scope="row">${produto.titulo}</th>
					<td>${produto.descricao}</td>
					<td>${produto.atores}</td>
					<td>${produto.duracao}</td>
					<td><a class="btn btn-warning btn-sm"
						href="/editarFilme/${produto.idProduto}">Editar</a> <a
						class="btn btn-danger btn-sm" href="/deletarFilme/${produto.idProduto}">Excluir</a></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>
