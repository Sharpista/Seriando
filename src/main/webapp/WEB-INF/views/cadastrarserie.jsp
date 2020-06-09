<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/global.css">
	<link rel="stylesheet" href="css/cadastro.css">
	<title>Tela de Cadastro de Serie</title>
</head>

<body>
<div class="container">
	<div class="box">
		<h2>Cadastrar Serie</h2>
		<form action="/salvarSerie" class="form" method="post">
			<label for="nome">Titulo</label>
			<input type="text" name="titulo" placeholder="Titulo">
			<label for="nome">Descrição</label>
			<input type="text" name="descricao" placeholder="Descrição">
			<label for="text">Atores</label>
			<input type="text" name="atores" placeholder="Atores">
			<label for="senha">Temporadas</label>
			<input type="text" name="temporadas" placeholder="Duração">
			<input type="hidden" name="usuario" value="<%= request.getSession().getId() %>"/>
			<button class="btn-cadastro" type="submit">Confirmar</button>
		</form>
		<div class="logo">
			<img src="img/Logo-Seriando-Cadastro.png" alt="Seriando Logo">
		</div>
	</div>
</div>
</body>

</html>


