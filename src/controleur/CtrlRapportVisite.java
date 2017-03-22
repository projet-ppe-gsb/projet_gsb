/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vue.F_MEDICAMENT;
import vue.F_VISITEUR;
import vue.RAPPORT_VISITE;

/**
 *
 * @author btssio
 */


public class CtrlRapportVisite implements ActionListener{
    private RAPPORT_VISITE vue; // LA VUE
    CtrlPrincipal ctrlPrincipal;
    
     public CtrlRapportVisite(RAPPORT_VISITE vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjButtonFermer()) {
            ctrlPrincipal.afficherMenu(vue);
        }
        if (source == vue.getjButtonPrecedent()) {
            ctrlPrincipal.afficherMedicament(vue);
        }
        if (source == vue.getjButtonSuivant()) {
            ctrlPrincipal.afficherVisiteur(vue);
        }
    }
//getter
    public RAPPORT_VISITE getVue() {
        return vue;
    }
    
    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }
    
//setter    
    public void setVue(RAPPORT_VISITE vue) {
        this.vue = vue;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
   
    
    
    
    
    
    
}
