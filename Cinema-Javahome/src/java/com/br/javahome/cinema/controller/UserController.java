/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.UserDAO;
import com.br.javahome.cinema.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo-Friedrich
 */
public class UserController extends HttpServlet {

    private String nome;
    private final UserDAO udao = new UserDAO();

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
                case "User.catalogo":
                    request.getRequestDispatcher("WEB-INF/jsp/usuario/Catalogo.jsp").forward(request, response);
                    break;
                case "User.perfil":
                    request.getRequestDispatcher("WEB-INF/jsp/usuario/ManterPerfil.jsp").forward(request, response);
                    break;
                case "User.promover":
                    for (User user : udao.read()) {
                        if (user.getNome().equals(nome)) {
                            System.out.println(user);
                            udao.upgrade(user);
                            System.out.println(user);
                        }
                    }

                    request.getRequestDispatcher("WEB-INF/jsp/gerente/MenuGerente.jsp").forward(request, response);
                    break;
                case "User.deletar":
                    for (User user : udao.read()) {
                        if (user.getNome().equals(nome)) {
                            udao.delete(user);
                        }
                    }

                    request.getRequestDispatcher("WEB-INF/jsp/gerente/MenuGerente.jsp").forward(request, response);
                    break;

            }
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

        nome = request.getParameter("nome");
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
