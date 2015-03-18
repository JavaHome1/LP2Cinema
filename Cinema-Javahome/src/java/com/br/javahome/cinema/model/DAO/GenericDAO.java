/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.model.DAO;

import java.util.List;

/**
 *
 * @author Rodrigo-Friedrich
 */
public interface GenericDAO {
    //CRUD
    
    //C - CREATE
    public boolean create(Object object);
    
    //R - READ
    public List<Object> read();
    
    //U - UPDATE
    public boolean update(Object object);
    
    //D - DELETE
    public boolean delete(Object object);
    
}
