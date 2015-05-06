<%-- 
    Document   : UserHome
    Created on : 05/05/2015, 22:34:29
    Author     : Rodrigo-Friedrich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Olá,<% out.print(request.getAttribute("nome")); %>
        <br/>
        <a href="${pageContext.request.contextPath}/Venda?command=catalogo">Acessar catálogo</a><br/>
        <a href="${pageContext.request.contextPath}/User?command=perfil">Acessar perfil</a><br/>
    </body>
</html>
