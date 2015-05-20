/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.User;
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
public class UserDAO implements GenericDAO<User> {

    @Override
    public boolean create(User user) {
        Connection connection;
        try {
            connection = Conexao.getInstance().getConnection();//criando conexao
            Statement statement = connection.createStatement();//criando statement
            statement.execute("INSERT INTO  CINEMAJAVA.USUARIO (NOME,SENHA) VALUES ('" + user.getNome() + "','" + user.getSenha() + "')");//
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    @Override
    public List<User> read() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/empre", "mack", "mack");
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM CINEMAJAVA.USUARIO");
            while (result.next()) {
                users.add(new User(result.getString("NOME"), result.getString("SENHA"), result.getInt("ID_USER"),result.getBoolean("ADMIN")));
            }
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public void update(User user) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.USUARIO SET NOME= '" + user.getNome());//permitir mudança de senha e de função
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void upgrade(User user) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.USUARIO SET ADMIN= TRUE WHERE NOME = '"+user.getNome()+"'");//permitir mudança de senha e de função
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(User user) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.USUARIO WHERE NOME = " + user.getNome());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
