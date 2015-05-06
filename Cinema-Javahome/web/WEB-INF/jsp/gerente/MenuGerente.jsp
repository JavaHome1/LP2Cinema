<%-- 
    Document   : MenuGerente
    Created on : 05/05/2015, 22:40:08
    Author     : Rodrigo-Friedrich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        ACESSADO PELO GERENTE<br/>
        <a href="${pageContext.request.contextPath}/controller?command=cargo.listar">Vender Ingresso</a><br/>
        <a href="${pageContext.request.contextPath}/Gerente?command=sala">Manter Sala de Projeção</a><br/>
        <a href="${pageContext.request.contextPath}/ManterFilme">Manter Filmes</a><br/>
        <a href="${pageContext.request.contextPath}/ManterSessao">Manter Sessoes de um filme</a><br/>
        <a href="${pageContext.request.contextPath}/ManterUsuario">Manter Usuario</a><br/>
    </body>
</html>
