/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author finde
 */
public class Praticien {
    
    String numero;
    String nom;
    String prenom;
    String adresse;
    String cp;
    String ville;
    String coef;
    
    TypePraticien type;
    
    public Praticien(String unNumero, String unNom, String unPrenom, String uneAdresse, String unCP, String uneVille, String unCoeff, TypePraticien unType) {
        
        this.numero = unNumero;
        this.nom = unNom;
        this.prenom = unPrenom;
        this.adresse = uneAdresse;
        this.cp = unCP;
        this.ville = uneVille;
        this.coef = unCoeff;
        
        this.type = unType;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCoef() {
        return coef;
    }

    public void setCoef(String coef) {
        this.coef = coef;
    }

    public TypePraticien getType() {
        return type;
    }

    public void setType(TypePraticien type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return this.nom + " " + this.prenom;
    }
    
}
