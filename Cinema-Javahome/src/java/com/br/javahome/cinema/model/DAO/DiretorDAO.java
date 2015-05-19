/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.Diretor;
import com.br.javahome.cinema.model.Diretor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo-Friedrich
 */
public class DiretorDAO implements GenericDAO<Diretor> {

    @Override
    public boolean create(Diretor dir) {
    Connection connection;
        try {
            connection = Conexao.getInstance().getConnection();//criando conexao
            Statement statement = connection.createStatement();//criando statement
            statement.execute("INSERT INTO  CINEMAJAVA.DIRETOR (NOME,REG) VALUES ('"+dir.getNome()+"','"+dir.getReg()+"')");//
            connection.close();;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        
        return true;    }

    @Override
    public List<Diretor> read() {
        ArrayList<Diretor>diretores = new ArrayList<Diretor>();
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/empre", "mack", "mack");
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM CINEMAJAVA.DIRETOR");
            while (result.next()) {
                diretores.add(new Diretor(result.getInt("ID_DIRETOR"),result.getString("NOME"),result.getString("REG")));
            }
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return diretores;
    }

    @Override
    public void update(Diretor dir) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.DIRETOR SET NOME= '" + dir.getNome()+ "' WHERE ID_DIRETOR = " + dir.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void delete(Diretor dir) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.DIRETOR WHERE ID_DIRETOR = " + dir.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DiretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}
