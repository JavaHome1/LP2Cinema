
package com.br.javahome.cinema.model;

import java.io.Serializable;

/**
 * Classe que define Diretor do filme
 * @author Rodrigo-Friedrich
 * @version 1.0
 */
public class Diretor implements Serializable{
    private int pk;
    private String nome;
    private String reg;
    
/**
 * 
 * @param pk primary key
 * @param nome nome do diretor
 * @param reg registro
 */
    public Diretor(int pk, String nome, String reg) {
        this.pk = pk;
        this.nome = nome;
        this.reg = reg;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
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

    @Override
    public String toString() {
        return "Diretor{" + "pk=" + pk + ", nome=" + nome + ", reg=" + reg + '}';
    }

    
    
    
}
