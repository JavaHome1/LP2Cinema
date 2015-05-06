/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.SessaoDAO;
import com.br.javahome.cinema.model.Sessao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipemramos
 */
public class SessaoController extends HttpServlet {
    private int horario;
    private int idFilme;
    private int idSala;
    private double preco;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessaoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SessaoController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        
        this.horario = Integer.parseInt(request.getParameter("campoHora"));
//        this.idFilme = Integer.parseInt(request.getParameter("campoFilme"));
        this.idSala = Integer.parseInt(request.getParameter("campoSala").trim());
        this.preco = Double.parseDouble(request.getParameter("campoPreco"));
        SessaoDAO sessaoDao = new SessaoDAO();
        List<Sessao> sessoes = sessaoDao.read();
        boolean achou = false;
        
        Sessao sess = new Sessao(horario,idFilme,idSala,preco);
        System.out.println(sessoes);
        
        for (Sessao sessaoA : sessoes) {
            if (sessaoA.getPk() == sess.getPk()){
                achou = true;
                break;
            }
        }
        
        if (achou){
            sessaoDao.update(sess);
            System.out.println("achou!!!!");
        }
        else{
            sessaoDao.create(sess);
            System.out.println("what");
        }
        
        
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
