/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;
import java.sql.Date;



/**
 *
 * @author btssio
 */
public class Visiteur {
    
    private String matricule;
    private String nom;
    private String prenom;
    private String adresse; 
    private String cp;
    private String ville;
    private Date date;
  //  private Secteur secteur;
   // private Labo labo;

    

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public Date getDate() {
        return date;
    }

  /*  public Secteur getSecteur() {
        return secteur;
    }
*/
    @Override
    public String toString() {
        return nom + " " + prenom;
    }

   /* public Labo getLabo() {
        return labo;
    }*/

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date date, Secteur secNom, Labo labNom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.date = date;
      //  this.secteur = secNom;
      //  this.labo = labNom;
    }
    
}

