<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seriando - Filmes e Séries do seu jeito!</title>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <link href="css/global.css" rel="stylesheet" type="text/css">

</head>

<body>
<div class="container">
    <nav class="nav-links">
        <ul>
            <li onclick="location.href='/formLogin';" class="login">Login</li>
            <li onclick="location.href='/cadastrar';">Cadastrar</li>
        </ul>
    </nav>
    <section class="seriando-content">
        <div class="content">
            <img src="img/Logo-Seriando.png" alt="Seriando Logo">
            <p class="seriando-descricao">Seus filmes e séries <br />
                do <span class="pink-color">SEU JEITO!</span></p>
        </div>
    </section>
    <div class="shapes">
        <img class="s-1" src="css/shape-index-1.svg">
        <img class="s-2" src="css/shape-index-2.svg">
    </div>
</div>
</body>

</html>
