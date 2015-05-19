/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.SalaDAO;
import com.br.javahome.cinema.model.Sala;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipemramos
 */
public class SalaController extends HttpServlet {
    private int numero;
    private int capacidade;
    private int poltronasEspeciais;
    private String estado;
    
    
    public static ArrayList<Sala> salasBanco(){
        SalaDAO salaDao = new SalaDAO();
        ArrayList<Sala> salas = salaDao.read();
        return salas;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Sala sala = new Sala(numero,capacidade,poltronasEspeciais,estado);
        
        System.out.println(sala);
        
        SalaDAO salaDao = new SalaDAO();
        ArrayList<Sala> salas = salaDao.read();
        boolean achou = false;
        
        for (Sala salao : salas) {
            if (salao.getIdSala() == sala.getIdSala()){
                achou = true;
                break;
            }
        }
        
        if (achou){
            salaDao.update(sala);
            System.out.println("achou!!!!");
            request.getRequestDispatcher("WEB-INF/jsp/gerente/MenuGerente.jsp").forward(request, response);
        }
        else{
            salaDao.create(sala);
            System.out.println("criou!!!!");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("Entrou no posto!!!!!");
        
        this.numero = Integer.parseInt(request.getParameter("campoNumero"));
        this.capacidade = Integer.parseInt(request.getParameter("campoCapacidade"));
        this.poltronasEspeciais = Integer.parseInt(request.getParameter("campoPE"));
        this.estado = request.getParameter("estado");

        
        
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
