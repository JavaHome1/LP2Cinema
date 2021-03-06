/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipemramos
 */
public class MasterController extends HttpServlet {

    private String command;

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

        if (command != null && !"".equals(command)) {
            if (command.equals("Login")) {
                System.out.println("/login");
                RequestDispatcher rd = request.getRequestDispatcher("LoginController");
                rd.forward(request, response);
            }
            if (command.startsWith("Venda.")) {
                RequestDispatcher rd = request.getRequestDispatcher("/Venda");
                rd.forward(request, response);
            }

            if (command.startsWith("User.")) {
                request.getRequestDispatcher("/User").forward(request, response);
            }
            if (command.startsWith("Gerente.")) {
                request.getRequestDispatcher("/Gerente").forward(request, response);
            }
            if (command.startsWith("Sala.")) {
                request.getRequestDispatcher("/SalaController").forward(request, response);
            }
            if (command.startsWith("Filme.")) {
                request.getRequestDispatcher("/FilmeController").forward(request, response);
            }
            if (command.startsWith("Sessao.")) {
                request.getRequestDispatcher("/SessaoController").forward(request, response);
            }
            if (command.startsWith("Cadastro")) {
                request.getRequestDispatcher("/CadastroController").forward(request, response);
            }
        } else {
            response.sendRedirect("erro.jsp");
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MasterController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Presta atençao que mandou pro lugar errado hein! Estamos em MASTER</h1>");
            out.println("<h3>Command =  " + command + "</h3>");
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
        command = request.getParameter("command");
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
        command = request.getParameter("command");
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
