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
        
        listar filmes
        <%
            FilmeDAO filmeDAO = new FilmeDAO();
           for(Filme filme : FilmeDAO.filmeBanco() ){
               out.println("<a>"+filme.getTitulo() + "<a/><br/>"); // link vai pra pagina de edição de filme 
           } 
            
        %>
        
        <h1><a href="${pageContext.request.contextPath}/MasterController?command=Filme.criar">SETAR FILME</a><br/></h1>
    </body>
</html>
