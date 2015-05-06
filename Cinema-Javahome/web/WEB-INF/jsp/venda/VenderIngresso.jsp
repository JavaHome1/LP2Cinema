<%-- 
    Document   : VenderIngresso
    Created on : 06/05/2015, 01:21:51
    Author     : Rodrigo-Friedrich
--%>

<%@page import="com.br.javahome.cinema.model.Filme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vender Ingresso</title>
    </head>
    <body>
        <h1>Venda de Ingressos</h1>
        <form action="ComparController" method="POST">
            
            <p>Filme:<select >
                    <%
//                        for (Filme filme : FilmeController.filmesBanco()) {
                        Filme filme = new Filme("frozen",120,'k',"luciano","JavaMount",true,true,true,"action");
                            out.print("<option  value='" + filme.getTitulo() + "'>" + filme.getTitulo() + "</option>");
//                        }
                    %>
                </select>
            </p>
            <p>Sessoes:<select name="campoSala">
                    <%
//                        for (Sala salao : SalaController.salasBanco()) {
//                            out.print("<option  value='" + salao.getIdSala() + "'>" + salao.getIdSala() + "</option>");
//                        }
                    %>
                </select>
            </p>
            <p>Quantidade:<input type="number" name="campoQTD" required/></p>
            <p>Preco:R$</p>
            <p><input type="submit" value="Comprar"/></p>
        </form>
    </body>
</html>
