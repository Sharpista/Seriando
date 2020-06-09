

<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/global.css">
	<link rel="stylesheet" href="css/cadastro.css">
	<title>Tela de Cadastro</title>
</head>

<body>
<div class="container">
	<div class="box">
		<h2>Cadastre-se</h2>
		<form action="/usuario" class="form" method="post">
			<label for="nome">Nome</label>
			<input type="text" name="nome" placeholder="Digite seu nome">
			<label for="nome">E-mail</label>
			<input type="text" name="email" placeholder="Digite seu email">
			<label for="senha">Senha</label>
			<input type="password" name="senha" placeholder="Digite sua senha">
			<button class="btn-cadastro" type="submit">Confirmar</button>
		</form>
		<div class="logo">
			<img src="img/Logo-Seriando-Cadastro.png" alt="Seriando Logo">
		</div>
	</div>
</div>
</body>

</html>


