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
        <title>Menu Gerente</title>
    </head>
    <body>
        <h1>MENU DO GERENTE</h1>
        <br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.ingresso">Vender Ingresso</a><br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.catalogo">Exibir Catalogo</a><br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.sala">Manter Sala de Projeção</a><br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.filme">Manter Filmes</a><br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.sessao">Manter Sessoes de um filme</a><br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=Gerente.usuario">Manter Usuario</a><br/>
    </body>
</html>
