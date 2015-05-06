/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model;

/**
 *
 * @author felipemramos
 */
public class Filme {
    private String titulo;
    private int duracao;
    private char classificacao;
    private String diretor;
    private String distribuidora;
    private boolean cartaz;
    private boolean estreia;
    private boolean lancamento;
    private String genero;

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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public boolean isCartaz() {
        return cartaz;
    }

    public void setCartaz(boolean cartaz) {
        this.cartaz = cartaz;
    }

    public boolean isEstreia() {
        return estreia;
    }

    public void setEstreia(boolean estreia) {
        this.estreia = estreia;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", duracao=" + duracao + ", classificacao=" + classificacao + ", diretor=" + diretor + ", distribuidora=" + distribuidora + ", cartaz=" + cartaz + ", estreia=" + estreia + ", lancamento=" + lancamento + ", genero=" + genero + '}';
    }

    public Filme(String titulo, int duracao, char classificacao, String diretor, String distribuidora, boolean cartaz, boolean estreia, boolean lancamento, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.distribuidora = distribuidora;
        this.cartaz = cartaz;
        this.estreia = estreia;
        this.lancamento = lancamento;
        this.genero = genero;
    }
    
    
    
}
