/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.Filme;
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
public class FilmeDAO implements GenericDAO<Filme>{
    public static List<Filme> filmeBanco(){
        return new ArrayList<Filme>();
    }

    @Override
    public boolean create(Filme filme) {
        Connection connection;
        try {
            connection = Conexao.getInstance().getConnection();//criando conexao
            Statement statement = connection.createStatement();//criando statement
            statement.execute("INSERT INTO CINEMAJAVA.FILME(TITULO,DURACAO,CLASSIFICACAO,ID_DIRETOR,ESTREIA,GENERO) VALUES ('"+filme.getTitulo()+"',"+filme.getDuracao()+",'"+filme.getClassificacao()+"',"+filme.getDiretor().getPk()+","+filme.isEstreia()+",'"+filme.getGenero()+"')");//
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return true;
    }

    @Override
    public List<Filme> read() {
        ArrayList<Filme>salas = new ArrayList<Filme>();
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/empre", "mack", "mack");
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM CINEMAJAVA.FILME");
            while (result.next()) {
                salas.add(new Filme(result.getString("TITULO"),result.getInt("DURACAO"),result.getString("CLASSIFICACAO"),result.getInt("ID_DIRETOR"),result.getBoolean("ESTREIA"),result.getString("GENERO")));
            }
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return salas;
    }

    @Override
    public void update(Filme filme) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.FILME SET GENERO="+filme.getGenero()+", TITULO="+filme.getTitulo()+", ID_DIRETOR='"+filme.getDiretor().getPk()+", ESTREIA="+filme.isEstreia()+"' WHERE ID_FILME="+filme.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Filme filme) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.FILME WHERE TITULO = '" + filme.getTitulo()+"'");
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
