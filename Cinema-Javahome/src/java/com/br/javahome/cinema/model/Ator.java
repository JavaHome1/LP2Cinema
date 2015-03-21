
package com.br.javahome.cinema.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Define atores do filme
 * @author Rodrigo-Friedrich
 * @version 1.0
 */
public class Ator implements Serializable{
    private int pk;
    private String nome,nacionalidade;
    private int idade;

    public Ator(int pk, String nome, String nacionalidade, int idade) {
        this.pk = pk;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade=idade;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getDataNasc() {
        return idade;
    }

    public void setDataNasc(int idade) {
        this.idade=idade;
    }
    
}

