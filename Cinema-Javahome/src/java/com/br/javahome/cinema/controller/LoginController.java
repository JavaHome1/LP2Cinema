/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31458904
 */
@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {
    private String nome;
    private String senha;
    
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
            //verificar se gerente/usuario/atendente
            System.out.println("LOGINCONTROLLER");
            Autenticador aut=new Autenticador(nome,senha);
            System.out.println(aut.autentica());
            switch(aut.autentica()){
                case 0:
//                    Gerente
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/MenuGerente.jsp").forward(request, response);
                    break;
                case 1:
//                    Página de usuário
                    request.setAttribute("nome", nome);
                    request.getRequestDispatcher("WEB-INF/jsp/usuario/MenuUsuario.jsp").forward(request, response);
                    break;
                default:
//                    Erro
                    try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet CadastroController</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("Eae cara? tenta entrar na sua conta com nome de usuario e senha corretos meu!");
                    out.println("</body>");
                    out.println("</html>");
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
        
        nome=request.getParameter("campoNome");
        senha=request.getParameter("campoSenha");
        
        
        
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
