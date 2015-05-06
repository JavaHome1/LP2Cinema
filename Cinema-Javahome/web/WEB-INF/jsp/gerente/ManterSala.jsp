<%-- 
    Document   : mantersalinha
    Created on : 06/05/2015, 00:42:15
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
        <form action="LoginController" method="POST">
            <p>Numero:<input type="text" name="campoNumero"/></p>
            <p>Capacidade:<input type="text" name="campoCapacidade"/></p>
            <p>Poltronas Epeciais:<input type="text" name="campoPE"/></p>
            <p>Estado
                <br/><input type="radio" name="estado" value="manutenção"/>em manutenção
                <br/><input type="radio" name="estado" value="Ativa"/>Ativa
                <br/><input type="radio" name="estado" value="lotada"/>lotada
            </p>
            <p><input type="submit" value="Salvar"/></p>
        </form>
    </body>
</html>
