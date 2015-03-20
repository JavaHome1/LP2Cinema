/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Rodrigo-Friedrich
 */
public interface GenericDAO<Tipo> extends Serializable {
    //CRUD
    
    //C - CREATE
    public boolean create(Tipo j);
    
    //R - READ
    public List<Tipo> read(Tipo j);
    
    //U - UPDATE
    public void update(Tipo j);
    
    //D - DELETE
    public void delete(Tipo j);
    
}
