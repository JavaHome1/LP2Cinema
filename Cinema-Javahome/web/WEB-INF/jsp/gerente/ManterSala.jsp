

<%@page import="com.br.javahome.cinema.model.Sala"%>
<%@page import="com.br.javahome.cinema.model.DAO.SalaDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MasterController" method="POST">
            <p>Numero:<input type="number" name="campoNumero" required/></p>
            <p>Capacidade:<input type="number" name="campoCapacidade" required/></p>
            <p>Poltronas Epeciais:<input type="number" name="campoPE" required/></p>
            <p>Estado
                <br/><input type="radio" name="estado" value="manutenção" checked/>Em Manutenção
                <br/><input type="radio" name="estado" value="Ativa"/>Ativa
                <br/><input type="radio" name="estado" value="lotada"/>Lotada
            </p>
            <input type="hidden" name="command" value="Sala.manter"
            <p><input type="submit" value="Salvar"/></p>
        </form>
        <h1>LISTAR SALAS</h1>
        <%
           SalaDAO saladao = new SalaDAO();
           for (Sala sala : saladao.read() ){
               out.println("<a> Número da sala:"+ sala.getIdSala() +"<a/><br/>"); // link vai pra pagina de edição de salas
           } 
            
        %>  
        
    </body>
</html>
