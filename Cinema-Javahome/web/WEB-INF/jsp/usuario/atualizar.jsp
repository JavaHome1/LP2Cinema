<%-- 
    Document   : atualizar
    Created on : 20/05/2015, 03:21:14
    Author     : felipemramos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cuidado!!!</h1>
        <form action="MasterController" method="POST">
            <% 
            out.println("<input type='hidden' name='nome' value='"+request.getParameter("nome")+"'/><br/>");
        %>
            Nova Senha:<input type="text" name="senha" placeholder='PONHA SUA SENHA AKI'/><br/>
            Novo Email:<input type="text" name="email" placeholder='PONHA SEU EMAIL AKI'/><br/>
            <input type='hidden' name="command" value="User.update"/>
            <input type="submit" value="Trocar">
        </form>
        
    </body>
</html>
