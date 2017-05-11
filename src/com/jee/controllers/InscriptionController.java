package com.jee.controllers;

import com.jee.beans.Member;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Antoine on 30/03/2017.
 */
public class InscriptionController {

    public static final String NOM = "nom";
    public static final String PRENOM = "prenom";
    public static final String EMAIL = "email";
    public static final String DATENAISSANCE = "dateNaissance";
    public static final String TELEPHONE = "telephone";
    public static final String SEXE = "sexe";
    public static final String PASSWORD = "password";
    public static final String PAYS = "pays";
    public static Map<String, String> erreurs = new HashMap<String, String>();

    public Map<String, String> getErreurs(){return erreurs;}

    public static Member creationMembre(HttpServletRequest req){
        String nom = req.getParameter(InscriptionController.NOM);
        String prenom = req.getParameter(InscriptionController.PRENOM);
        String email = req.getParameter(InscriptionController.EMAIL);
        String dateNaissance = req.getParameter(InscriptionController.DATENAISSANCE);
        String telephone = req.getParameter(InscriptionController.TELEPHONE);
        String sexe = req.getParameter(InscriptionController.SEXE);
        String password = req.getParameter(InscriptionController.PASSWORD);
        String pays = req.getParameter(InscriptionController.PAYS);

        Member membre = new Member(nom, prenom, email, dateNaissance, telephone, sexe, password, pays);

        validate(membre);
        return membre;
    }

    public static void validate(Member membre){
        valideNom(membre.getNom());
        validePrenom(membre.getPrenom());
        valideEmail(membre.getEmail());
        valideDateNaissance(membre.getDateNaissance());
        valideTelephone(membre.getTelephone());
        valideSexe(membre.getSexe());
        validePassword(membre.getPassword());
    }

    public static boolean valideNom(String nom){
        if(nom == null || nom.isEmpty()){
            erreurs.put(NOM, "Le nom de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean validePrenom(String prenom){
        if(prenom == null || prenom.isEmpty()){
            erreurs.put(PRENOM, "Le prenom de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean valideEmail(String email){
        if(email == null || email.isEmpty()){
            erreurs.put(EMAIL, "L'email de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean valideDateNaissance(String dateNaissance){
        if(dateNaissance == null || dateNaissance.isEmpty()){
            erreurs.put(DATENAISSANCE, "La date de naissance de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean valideTelephone(String telephone){
        if(telephone == null || telephone.isEmpty()){
            erreurs.put(TELEPHONE, "Le telephone de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean valideSexe(String sexe){
        if(sexe == null || sexe.isEmpty()){
            erreurs.put(SEXE, "Le sexe de l'utilisateur doit etre renseigné");
        }

        return true;
    }

    public static boolean validePassword(String password){
        if(password == null || password.isEmpty()){
            erreurs.put(PASSWORD, "Le mot de passe de l'utilisateur doit etre renseigné");
        }

        return true;
    }



}
