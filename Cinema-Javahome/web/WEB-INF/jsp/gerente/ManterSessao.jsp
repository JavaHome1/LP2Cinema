<%-- 
    Document   : ManterSessao
    Created on : 06/05/2015, 01:28:58
    Author     : Rodrigo-Friedrich
--%>

<%@page import="com.br.javahome.cinema.model.Distribuidora"%>
<%@page import="com.br.javahome.cinema.model.Distribuidora"%>
<%@page import="com.br.javahome.cinema.model.Diretor"%>
<%@page import="com.br.javahome.cinema.model.Filme"%>
<%@page import="com.br.javahome.cinema.model.Sala"%>
<%@page import="com.br.javahome.cinema.controller.SalaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manter Sessão</title>
    </head>
    <body>
        <h1>Manutenção de Sessão</h1>
        <form action="MasterController" method="POST">
            <p>Sala:<select name="campoSala">
                    <%
                        for (Sala salao : SalaController.salasBanco()) {
                            out.print("<option  value='" + salao.getIdSala() + "'>" + salao.getIdSala() + "</option>");
                        }
                    %>
                </select>
            </p>
            <p>Filme:<select >
                    <%
//                        for (Filme filme : FilmeController.filmesBanco()) {
                        Diretor d = new Diretor("Luciano","3");
                        Distribuidora dd = new Distribuidora("JavaMount");
                        Filme filme = new Filme("frozen",120,'k',d,dd,true,"action");
                            out.print("<option  value='" + filme.getTitulo() + "'>" + filme.getTitulo() + "</option>");
//                        }
                    %>
                </select>
            </p>
            <p>Horario:<input type="text" name="campoHora" required/></p>
            <p>Quantidade Max:<input type="text" name="campoQTD" required/></p>
            <p>Preco:<input type="text" name="campoPreco" required/></p>
            <input type="hidden" name="command" value="Sessao.manter"
            <p><input type="submit" value="Salvar"/></p>
        </form>
    </body>
</html>
