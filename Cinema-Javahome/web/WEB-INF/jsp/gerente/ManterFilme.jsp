<%-- 
    Document   : ManterFilme
    Created on : 06/05/2015, 01:22:55
    Author     : Rodrigo-Friedrich
--%>

<%@page import="com.br.javahome.cinema.model.DAO.FilmeDAO"%>
<%@page import="com.br.javahome.cinema.model.Filme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manter Filme</title>
    </head>
    <body>
        <h1>Manutenção de Filmes</h1>

        <%

            FilmeDAO fdao = new FilmeDAO();
            for (Filme filme : fdao.read()) {
                out.print("<p><option  value='" + filme.getTitulo() + "'>" + filme.getTitulo() + "</option><a>editar</a><a>DELETAR</a></p>");
            }
        %>
    </body>
</html>
