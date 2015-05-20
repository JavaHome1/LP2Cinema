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
                out.print(usuario.getNome()+"   <a href='MasterController?command=User.promover&nome="+usuario.getNome()+"'>PROMOVER</a>   |   <a href='MasterController?command=User.deletar&nome="+usuario.getNome()+"'>DELETAR</a></p>");
            }
        %>
        <a href="">Voltar</a>
    </body>
</html>
