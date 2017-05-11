package com.jee.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 * Created by Antoine on 16/03/2017.
 */
public class Member  {
    private String nom;
    private String prenom;
    private String email;
    private String dateNaissance;
    private String telephone;
    private String sexe;
    private String password;
    private String pays;


    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getEmail(){
        return this.email;
    }

    public String getDateNaissance(){
        return this.dateNaissance;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public String getSexe(){
        return this.sexe;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPays(){
        return this.pays;
    }

    public void setNom( String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public void setSexe(String sexe){
        this.sexe = sexe;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPays(String pays){
        this.pays = pays;
    }


    public Member(String nom,String prenom,String email,String dateNaissance,String telephone,String sexe,String password,String pays){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        this.sexe = sexe;
        this.password = password;
        this.pays = pays;
    }
}
