<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="icon" href="img/favicon.png" />
	<link rel="stylesheet" href="css/global.css">
	<link rel="stylesheet" href="css/login.css"">
	<title>Tela de Login</title>
</head>

<body>
<div class="container">
	<img class="seriando-logo" src="img/Logo-Seriando.png" alt="Seriando Logo">
	<form action="/login" class="form" method="post">
		<label for="nome">E-mail</label>
		<input type="text" name="email" placeholder="E-mail">
		<label for="senha">Senha</label>
		<input type="password" name="senha" placeholder="Senha">
		<button class="btn-login" type="submit">Entrar</button>
	</form>
	<div class="links">
		<a href="#">Esqueceu sua senha?</a>
	</div>
	
</div>
</body>

</html>
