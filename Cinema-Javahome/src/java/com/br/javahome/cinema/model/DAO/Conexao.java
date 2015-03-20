/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Rodrigo-Friedrich
 */
public class Conexao {
    ResourceBundle bundle;
    
    private static Conexao conexao;
    
    private Conexao() {
         bundle=ResourceBundle.getBundle("br.mackenzie.fci.ec.lp2.util.configuracoes");
    }
    
    public static Conexao getInstance(){
        if (conexao == null){
            conexao = new Conexao();
        }
        return conexao;
    }
    
    public Connection getConnection () throws ClassNotFoundException, SQLException{
        Class.forName(bundle.getString("driver"));
        return DriverManager.getConnection(bundle.getString("servidor") , bundle.getString("usuario"), bundle.getString("senha"));
    } 
}
