package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.UserDAO;
import com.br.javahome.cinema.model.User;
import java.util.ArrayList;

/**
 *
 * @author 31409490
 */
public class Autenticador {

    private String nome, senha;
    private int id_func;

    public Autenticador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public int autentica() {
        UserDAO udao = new UserDAO();
        for (User usuario : udao.read()) {
            if (nome.equals(usuario.getNome()) && senha.equals(usuario.getSenha())) {
            System.out.println("ISADMINNNNNN :"+usuario.isIsAdmin());
                if(usuario.isIsAdmin()){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        }
        return -1;
    }
}
