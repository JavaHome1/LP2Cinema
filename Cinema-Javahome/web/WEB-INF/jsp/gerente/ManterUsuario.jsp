<%-- 
    Document   : ManterUsuario
    Created on : 06/05/2015, 00:09:05
    Author     : Rodrigo-Friedrich
--%>

<%@page import="com.br.javahome.cinema.model.User"%>
<%@page import="com.br.javahome.cinema.model.DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manter Usuario</title>
    </head>
    <body>
        <h1>Manutenção de Usuário</h1>
        
        <%

            UserDAO udao = new UserDAO();
            for (User usuario : udao.read()) {
                out.print("<p><option  value='" + usuario.getNome() + "'>" + usuario.getNome() + "</option><a>editar</a><a>DELETAR</a></p>");
            }
        %>
    </body>
</html>
