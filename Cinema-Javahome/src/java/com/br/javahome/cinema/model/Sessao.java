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
public class Sessao {
    
    private int pk,horario,idFilme,idSala,ingressoDisponovel;
    private double preco;
    private boolean lagendade,threeD;

    public Sessao(int pk, int horario, int idFilme, int idSala, int ingressoDisponovel, double preco, boolean lagendade, boolean threeD) {
        this.pk = pk;
        this.horario = horario;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.ingressoDisponovel = ingressoDisponovel;
        this.preco = preco;
        this.lagendade = lagendade;
        this.threeD = threeD;
    }

    public Sessao(int aInt, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4, double aDouble, boolean aBoolean, boolean aBoolean0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIngressoDisponovel() {
        return ingressoDisponovel;
    }

    public void setIngressoDisponovel(int ingressoDisponovel) {
        this.ingressoDisponovel = ingressoDisponovel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLagendade() {
        return lagendade;
    }

    public void setLagendade(boolean lagendade) {
        this.lagendade = lagendade;
    }

    public boolean isThreeD() {
        return threeD;
    }

    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }
    
    
}
