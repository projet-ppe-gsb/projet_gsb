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
public class Secteur {
    
    //attributs
    private String sec_code;
    
    private String sec_libelle;
    
    
    //constructeurs
       
    public Secteur(String sec_code, String sec_libelle){
        this.sec_code = sec_code;
        this.sec_libelle = sec_libelle;
    }
    
    //toString Getter Setter
    @Override
    public String toString() {
        return "Secteur{" + "sec_code=" + sec_code + ", sec_libellé=" + sec_libelle + '}';
    }

    public String getSec_code() {
        return sec_code;
    }

    public void setSec_code(String sec_code) {
        this.sec_code = sec_code;
    }

    public String getSec_libelle() {
        return sec_libelle;
    }

    public void setSec_libelle(String sec_libelle) {
        this.sec_libelle = sec_libelle;
    }
}