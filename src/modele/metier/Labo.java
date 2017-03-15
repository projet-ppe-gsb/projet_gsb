/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class Labo {
    
    //attributs
    private String lab_code;
    private String lab_nom;
    private String lab_chefVente;
    
    //constructeur
    
    public Labo(String lab_code, String lab_nom, String lab_chefVente){
        this.lab_code = lab_code;
        this.lab_nom = lab_nom;
        this.lab_chefVente = lab_chefVente;
                
    }
    //getter 

    public String getLab_code() {
        return lab_code;
    }

    public String getLab_nom() {
        return lab_nom;
    }

    public String getLab_chefVente() {
        return lab_chefVente;
    }
    
    //setter

    public void setLab_code(String lab_code) {
        this.lab_code = lab_code;
    }

    public void setLab_nom(String lab_nom) {
        this.lab_nom = lab_nom;
    }

    public void setLab_chefVente(String lab_chefVente) {
        this.lab_chefVente = lab_chefVente;
    }
    
    //toString
    
    
    @Override
    public String toString() {
        return "Labo{" + "lab_code=" + lab_code + ", lab_nom=" + lab_nom + "lab_chefVente" + lab_chefVente +"}";
    }
    
}
