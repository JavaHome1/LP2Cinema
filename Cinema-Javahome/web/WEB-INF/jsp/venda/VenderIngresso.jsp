<%-- 
    Document   : VenderIngresso
    Created on : 06/05/2015, 01:21:51
    Author     : Rodrigo-Friedrich
--%>

<%@page import="java.util.List"%>
<%@page import="com.br.javahome.cinema.model.DAO.FilmeDAO"%>
<%@page import="com.br.javahome.cinema.model.Distribuidora"%>
<%@page import="com.br.javahome.cinema.model.Diretor"%>
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
        <form action="MasterController" method="POST">

            <p>Filme:<select >
                    <%
                        FilmeDAO fdao = new FilmeDAO();
                        List<Filme> filmes = fdao.read();
                        for(Filme filme: filmes){
                            out.print("<option  value='" + filme.getTitulo() + "'>" + filme.getTitulo() + "</option>");
                        }    
                    %>
                </select>
            </p>
            <p>Sessoes:<select name="campoSessao">
                    <%
//                        for (Sala salao : SalaController.salasBanco()) {
//                            out.print("<option  value='" + salao.getIdSala() + "'>" + salao.getIdSala() + "</option>");
//                        }
                    %>
                </select>
            </p>
            <p>Quantidade:<input type="number" name="campoQTD" required/></p>
            <p>Preco:R$ </p>
            <input type="hidden" name="command" value="Venda.comprar"/>
            <p><input type="submit" value="Comprar"/></p>
        </form>
    </body>
</html>
