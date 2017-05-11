package com.jee.servlets;

import com.jee.beans.Member;
import com.jee.controllers.InscriptionController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Antoine on 16/03/2017.
 */
public class Inscription extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InscriptionController inscriptionController = new InscriptionController();
        Member member = inscriptionController.creationMembre(req);
        req.setAttribute("member", member);
        String message;

        if(inscriptionController.getErreurs().isEmpty()){
            message = "utilisateur créé";
            req.setAttribute("mesage", message);
            this.getServletContext().getRequestDispatcher("/WEB-INF/afficherInscription.jsp").forward(req, resp);
        }
        else{
            req.setAttribute("erreurs", inscriptionController.getErreurs());
            this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(req, resp);
        }
    }
}
