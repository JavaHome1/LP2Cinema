
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.User;
import java.util.ArrayList;


/**
 *
 * @author 31409490
 */
public class Autenticador {
    private String nome,senha;
    private int id_func;

    public Autenticador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public int autentica(){
        ArrayList<User> users = new ArrayList<>();// alterar para consulta no banco de dados
            users.add(new User("felipe","ramos",0));// remover os add
            users.add(new User("admin","admin",0));
            users.add(new User("rodrigo","friedrich",0));
            for (User user : users) {
                if (nome.equals(user.getNome()) && senha.equals(user.getSenha())) {
                    return user.getId_func();
                }
            }
            return -1; 
    }
}
