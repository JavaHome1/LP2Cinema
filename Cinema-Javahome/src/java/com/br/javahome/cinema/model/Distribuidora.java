
package com.br.javahome.cinema.model;

import java.io.Serializable;

/**
 * Distribuidora dos filmes
 * @author Rodrigo-Friedrich
 * @version 1.0
 */
public class Distribuidora implements Serializable{
    private int pk;
    private String nome,endereco,telefone,site;

    public Distribuidora(int pk, String nome, String endereco, String telefone, String site) {
        this.pk = pk;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.site = site;
    }

    public Distribuidora(String nome) {
        this.nome = nome;
    }
    

    public int getPk() {
        return pk;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        return "Distribuidora{" + "pk=" + pk + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", site=" + site + '}';
    }
    
    
    
}
