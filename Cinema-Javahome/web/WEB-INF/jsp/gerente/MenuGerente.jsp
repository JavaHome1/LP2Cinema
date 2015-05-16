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
        <a href="${pageContext.request.contextPath}/MasterController?command=Venda.ingresso">Vender Ingresso</a><br/>
        <a href="${pageContext.request.contextPath}/Venda?command=catalogo">Exibir Catalogo</a><br/>
        <a href="${pageContext.request.contextPath}/Gerente?command=sala">Manter Sala de Projeção</a><br/>
        <a href="${pageContext.request.contextPath}/Gerente?command=filme">Manter Filmes</a><br/>
        <a href="${pageContext.request.contextPath}/Gerente?command=sessao">Manter Sessoes de um filme</a><br/>
        <a href="${pageContext.request.contextPath}/Gerente?command=usuario">Manter Usuario</a><br/>
    </body>
</html>
