<%-- 
    Document   : ManterFilme
    Created on : 06/05/2015, 01:22:55
    Author     : Rodrigo-Friedrich
--%>

<%@page import="com.br.javahome.cinema.controller.MasterController"%>
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
                out.print("<p>" + filme.getTitulo() + "<a href=${pageContext.request.contextPath}/MasterController?command=Filme.editar&nome="+filme.getTitulo()+">EDITAR </a>"
                        + "<a href=${pageContext.request.contextPath}/MasterController?command=Filme.deletar&nome="+filme.getTitulo()+"> DELETAR</a></p>");
            }
        %>
        
        <a href="${pageContext.request.contextPath}/MasterController?command=Filme.criar">Criar novo filme</a><br/>
    </body>
</html>
