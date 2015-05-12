/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import com.br.javahome.cinema.model.Filme;
import java.sql.Connection;
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
            statement.execute("INSERT INTO CINEMAJAVA.FILME(IG_FILME,TITULO,DURACAO,CASSIFICACAO,ID_DIRETOR,ID_DISTRIBUIDORA,ESTREIA,GENERO) VALUES ("+filme.getPk()+","+filme.getTitulo()+","+filme.getDuracao()+","+filme.getClassificacao()+","+filme.getDiretor().getPk()+","+filme.getDistribuidora().getPk()+","+filme.isEstreia()+","+filme.getGenero()+",");//
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Filme j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Filme filme) {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CINEMAJAVA.FILME WHERE ID_FILME = " + filme.getPk());
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
