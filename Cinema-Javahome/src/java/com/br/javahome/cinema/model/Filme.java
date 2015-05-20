/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model;

import com.br.javahome.cinema.model.DAO.DiretorDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipemramos
 */
public class Filme {
    private int pk;
    private String titulo;
    private int duracao;
    private char classificacao;
    private Diretor diretor;
    private boolean estreia;
    private String genero;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public char getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    public boolean isEstreia() {
        return estreia;
    }

    public void setEstreia(boolean estreia) {
        this.estreia = estreia;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Filme(String titulo, int duracao, char classificacao, Diretor diretor, boolean estreia, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.estreia = estreia;
        this.genero = genero;
    }
    
    public Filme(String titulo, int duracao, String classificacao, int idDiretor, boolean estreia, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao.charAt(0);
        
        this.estreia = estreia;
        this.genero = genero;
        
        DiretorDAO dir = new DiretorDAO();
        List<Diretor> dirAr = dir.read();
        for (Diretor dirAr1 : dirAr) {
            if (dirAr1.getPk() == idDiretor) {
                this.diretor = dirAr1;
            }
        }
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + pk + ", titulo=" + titulo + ", duracao=" + duracao + ", classificacao=" + classificacao + ", diretor=" + diretor + ", estreia=" + estreia + ", genero=" + genero + '}';
    }
    
    
    
    
    
}
