/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.Sessao;
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
public class SessaoDAO implements GenericDAO<Sessao> {

    @Override
    public boolean create(Sessao sessao) {
    Connection connection;
        try {
            connection = Conexao.getInstance().getConnection();//criando conexao
            Statement statement = connection.createStatement();//criando statement
            statement.execute("INSERT INTO  CINEMAJAVA.SESSAO (ID_Sessao,HORARIO,ID_FILME,ID_SALA,INGRESSODISPONIVEL,THREED,LEGENDADE,PRECO) VALUES '" + sessao.getPk()+ "','"+sessao.getHorario()+"',"+sessao.getIdFilme+"',"+sessao.getSala+"',"+sessao.getIngressosDisponiveis+"',"+sessao.THREED+"',"+sessao.getlegendade+"',"+sessao.getPreco;//
            connection.close();;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        
        return true;    }

    @Override
    public List<Sessao> read(Sessao sessao  ) {
        ArrayList<Sessao>Sessoes = new ArrayList<Sessao>();
        try {
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/empre", "mack", "mack");
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM CINEMAJAVA.Sessao");
            while (result.next()) {
                Sessoes.add(new Sessao(result.getInt("ID_Sessao"),result.getInt("HORARIO"),result.getInt("HORARIO"),result.getInt("ID_FILME"),result.getInt("idSala"),result.getInt("INGRESSODISPONIVEL"),result.getDouble("PRECO"),result.getBoolean("THREED)"),result.getBoolean("LEGENDADO")));
            }
            connection.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return Sessoes;
    }

    @Override
    public void update(Sessao sessao) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CINEMAJAVA.SESSAO  SET HORARIO = '" + sessao.getHorario()+ "' WHERE ID_Sessao = " + sessao.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void delete(Sessao sessao) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.SESSAO WHERE ID_Sessao = " + sessao.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}
