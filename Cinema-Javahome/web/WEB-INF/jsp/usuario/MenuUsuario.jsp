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
        <h1>
            Olá, <% out.print(request.getAttribute("nome"));%>
        </h1>
        <br/>
        <a href="${pageContext.request.contextPath}/MasterController?command=User.catalogo">Acessar catálogo</a><br/>
        <% 
            out.println("<a href='MasterController?command=User.perfil&nome="+request.getAttribute("nome")+"'>Acessar perfil</a><br/>");
        %>
        
    </body>
</html>
