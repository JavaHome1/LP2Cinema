/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model;

/**
 *
 * @author Rodrigo-Friedrich
 */
public class User {
    private String nome;
    private String senha;
    private int id_func;
    private boolean isAdmin;

    public User(String nome, String senha, int id_func,boolean adm ) {
        this.nome = nome;
        this.senha = senha;
        this.id_func = id_func;
        this.isAdmin = adm;
    }

    public User(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", senha=" + senha + ", id_func=" + id_func + ", isAdmin=" + isAdmin + '}';
    }
    
    
}
