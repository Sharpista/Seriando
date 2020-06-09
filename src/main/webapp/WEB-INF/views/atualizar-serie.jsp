<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="../css/global.css">
	<link rel="stylesheet" href="../css/cadastro.css">
	<title>Tela de Edição</title>
</head>
<body>
<div class="container">
	<div class="box">
	<a onclick="location.href='/inicio';"></a>
		<h2>Edição</h2>
		<form action="/atualizarSerie/${produto.idProduto}" class="form" method="post">
			<label for="nome">Titulo</label>
			<input type="text" name="titulo" value="${produto.titulo}" placeholder="Titulo">
			<label for="nome">Descrição</label>
			<input type="text" name="descricao" value="${produto.descricao}"placeholder="Descrição">
			<label for="text">Atores</label>
			<input type="text" name="atores" value="${produto.atores}" placeholder="Atores">
			<label for="senha">Temporadas</label>
			<input type="text" name="duracao" value="${produto.temporadas}"placeholder="Duração">
			<button class="btn-cadastro" type="submit">Confirmar</button>
		</form>
		<div class="logo">
			<img src="img/Logo-Seriando-Cadastro.png" alt="Seriando Logo">
		</div>
	</div>
</div>
</body>

</html>


