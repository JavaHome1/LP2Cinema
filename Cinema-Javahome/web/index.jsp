<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>LOGIN</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css"> 
            html,body{
                padding:0;
                margin:0;
                font-family: Verdana,Arial;
            }
            header{
                background-color: #c0c0c0;
                height: 150px;
                padding: 20px;
                border-bottom: 5px solid #cfcfcf;
            }
            header form{
                margin: 0;
                width: 200px;
                float: right;
            }
            header form input[type="submit"]{
                background-color: #000;
                color: #fff;
            }
        </style>
    </head>
    <body>
        <header>
            <form action="MasterController" method="POST">
                <p>Usuario:<input type="text" name="campoNome"/></p>
                <p>Senha:<input type="password" name="campoSenha"/></p>
                <input type="hidden" name="command" value="Login"/>
                <p><input type="submit" value="Login"/></p>
            </form>
        </header>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <form action="MasterController" method="POST">
            <p>Email:<input type="text" name="campoEmail"/></p>
            <p>Usuario:<input type="text" name="campoNome"/></p>
            <p>Senha:<input type="password" name="campoSenha"/></p>
            <input type="hidden" value="Cadastro" name="command"/> 
            <p><input type="submit" value="cadastrar"/></p>
        </form>
        <footer>
            Javaflix &copy; Felipe e Rodrigo 
        </footer>
    </body>
</html>
