/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.Ator;
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
 * @author felipemramos
 */
public class AtorDAO implements GenericDAO<Ator> {

    @Override
    public boolean create(Ator ator) {
    Connection connection;
        try {
            connection = Conexao.getInstance().getConnection();//criando conexao
            Statement statement = connection.createStatement();//criando statement
            statement.execute("INSERT INTO  CINEMAJAVA.ATOR (NOME,NACIONALIDADE,IDADE) VALUES ('"+ator.getNome()+"','"+ator.getNacionalidade()+"', "+ator.getDataNasc()+")");//
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        
        return true;    }

    @Override
    public List<Ator> read() {
        ArrayList<Ator>atores = new ArrayList<Ator>();
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/empre", "mack", "mack");
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM CINEMAJAVA.ATOR");
            while (result.next()) {
                atores.add(new Ator(result.getInt("ID_ATOR"),result.getString("NOME"),result.getString("NACIONALIDADE"),result.getInt("IDADE")));
            }
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return atores;
    }

    @Override
    public void update(Ator ator) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.ATOR SET NOME= '" + ator.getNome()+ "' WHERE ID_ATOR = " + ator.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void delete(Ator ator) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.ATOR WHERE ID_ATOR = " + ator.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AtorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}