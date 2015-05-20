/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.javahome.cinema.controller;

import com.br.javahome.cinema.model.DAO.DiretorDAO;
import com.br.javahome.cinema.model.DAO.FilmeDAO;
import com.br.javahome.cinema.model.Diretor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipemramos
 */
public class FilmeController extends HttpServlet {

    private String command;
    FilmeDAO fdao = new FilmeDAO();
    DiretorDAO ddao = new DiretorDAO();
    private String titulo;
    private int duracao;
    private String classificacao;
    private String diretor;
    private int idDir = -1;
    private boolean estreia;
    private String genero;

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
        System.out.println(command);
        response.setContentType("text/html;charset=UTF-8");
        if (command != null && !"".equals(command)) {
            switch (command){
                case "Filme.criar":
                    System.out.println("criar");
                    request.getRequestDispatcher("WEB-INF/jsp/gerente/CriarFilme.jsp").forward(request, response);
                    break;
                case "Filme.inserir":
                    this.idDir = buscaIdDir(this.diretor);
                    if (idDir == -1) {
                        ddao.create(new Diretor(this.diretor));
                        this.idDir = buscaIdDir(this.diretor);
                        
                    }
                    break;
                default:
                    request.getRequestDispatcher("WEB-INF/erro.jsp").forward(request, response);
                
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
    public int buscaIdDir(String nome) {
        for (Diretor diretor1 : ddao.read()) {
            if (nome == diretor1.getNome()) {
                return diretor1.getPk();
            }
        }
        return -1;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        System.out.println("recibi o comando GET PORRA :"+request.getParameter("command"));
        command = request.getParameter("command");
        
        if(command.equals("Filme.criar"))
            System.out.println("ENTROU EM FILME.CRIAR NO DOGET =D ");
        
        
                
        
        
        
    
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
        
        System.out.println("recibi o comando POST PORRA :"+request.getParameter("command"));
        command = request.getParameter("command");
        if(command.equals("Filme.inserir")){
            System.out.println("ENTROU EM FILME.CRIAR NO DOPOST!!! =D =D <3  ");
        
        
        this.titulo = request.getParameter("titulo");
        this.duracao = Integer.parseInt(request.getParameter("duracao"));
        System.out.println(request.getParameter("duracao"));
        this.classificacao = request.getParameter("classificacao");
        System.out.println(classificacao);
        this.diretor = request.getParameter("diretor");
        System.out.println(diretor);
        if(request.getParameter("estreia").equals("on"))
            this.estreia = true;
        else
            this.estreia = false;
        System.out.println(estreia);
        this.genero = request.getParameter("genero");
        System.out.println(genero);
        processRequest(request, response);
    }
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
