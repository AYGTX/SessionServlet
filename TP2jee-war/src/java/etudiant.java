/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author starinfo
 */
public class etudiant  {
    private  String login;
    private String password;
    private String nom,prenom,cin,groupe,genre;

    public etudiant(String login, String password, String nom, String prenom, String cin, String groupe, String genre) {
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.groupe = groupe;
        this.genre = genre;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getGenre() {
        return genre;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    
   
    
    
    
  
    
}
