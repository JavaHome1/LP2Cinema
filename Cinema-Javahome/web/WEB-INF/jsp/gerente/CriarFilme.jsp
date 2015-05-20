<%-- 
    Document   : CriarFilme
    Created on : 13/05/2015, 08:31:18
    Author     : Rodrigo Friedrich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar Filme</title>
    </head>
    <body>
        <h1>Criar novo filme:</h1>
        <form action ="MasterController" method = "POST">
            <p>Título:</p> <input type="text" name="nome" required><br/>
            <p>Duração:</p> <input type="number" name="duracao" required><br/>
            <p>Classificação:</p> <input type="text" maxlength="1" name="classificacao" required><br/>
            <p>Diretor:</p> <input type="text" name="diretor" required><br/>
            <p>Estréia:</p> <input type="checkbox" name="estreia">
            <p>Gênero:</p>  <input type="text" name="genero">
            <input name="command" type="hidden" value="Filme.inserir"><br/>
            <input type="submit" value="Enviar" >
        </form>
    </body>
</html>
