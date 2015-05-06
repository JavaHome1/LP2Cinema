/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.SalaDAO;
import com.br.javahome.cinema.model.DAO.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipemramos
 */

public class GerenteController extends HttpServlet {

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
        if (request != null && !("".equals(request.getParameter("command").trim()))) {
            switch (request.getParameter("command")) {
                case "sala":
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/ManterSala.jsp").forward(request, response);
                    break;
                case "usuario":
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/ManterUsuario.jsp").forward(request, response);
                    break;
                case "ingresso":
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/VenderIngresso.jsp").forward(request, response);
                    break;    
                case "filme":
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/ManterFilme.jsp").forward(request, response);
                    break;   
                case "sessao":
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/ManterSessao.jsp").forward(request, response);
                    break;    
            }
        }
            
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        
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
