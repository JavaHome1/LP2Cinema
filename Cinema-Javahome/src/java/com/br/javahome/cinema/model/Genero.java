
package com.br.javahome.cinema.model;

import java.io.Serializable;

/**
 * Classe para gêneros de filmes
 * @author Rodrigo-Friedrich
 * @version 1.0
 */
public class Genero implements Serializable{
    private int pk ;
    private String nome;

    public Genero(int pk, String nome) {
        this.pk = pk;
        this.nome = nome;
    }

    public int getPk() {
        return pk;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Genero{" + "pk=" + pk + ", nome=" + nome + '}';
    }
    
    
}
