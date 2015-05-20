<%-- 
    Document   : ManterPerfil
    Created on : 06/05/2015, 02:17:29
    Author     : Rodrigo-Friedrich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil de Usuário</title>
    </head>
    <body>
        <h1>MANTER PERFIL!</h1>
        <p><a href="${pageContext.request.contextPath}/MasterController?command=User.atualizar">atualizar</a></p>
        <p><a href="${pageContext.request.contextPath}/MasterController?command=User.deletarU">morrer</a></p>
    </body>
</html>
