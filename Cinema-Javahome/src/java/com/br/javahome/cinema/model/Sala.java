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
public class Sala {
    private int idSala;
    private int capacidade;
    private int poltronasEspeciais;
    private String estado;

    public Sala() {
    }
    
    public Sala(int idSala, int capacidade, int poltronasEspeciais, String estado) {
        this.idSala = idSala;
        this.capacidade = capacidade;
        this.poltronasEspeciais = poltronasEspeciais;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPoltronasEspeciais() {
        return poltronasEspeciais;
    }

    public void setPoltronasEspeciais(int poltronasEspeciais) {
        this.poltronasEspeciais = poltronasEspeciais;
    }

    @Override
    public String toString() {
        return "Sala{" + "idSala=" + idSala + ", capacidade=" + capacidade + ", poltronasEspeciais=" + poltronasEspeciais + ", estado=" + estado + '}';
    }
    
    
}
