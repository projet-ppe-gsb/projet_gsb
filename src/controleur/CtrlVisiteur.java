/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;



import vue.F_VISITEUR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur implements ActionListener{
    private F_VISITEUR vue; // LA VUE
    CtrlPrincipal ctrlPrincipal;
    
   



    public CtrlVisiteur(F_VISITEUR vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        vue.getjButtonPrecedent1().addActionListener(this);
        vue.getjButtonSuivant1().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjButtonFermer()) {
            ctrlPrincipal.afficherMenu(vue);
        }
        if (source == vue.getjButtonPrecedent1()) {
            ctrlPrincipal.afficherRapportVisite(vue);
        }
        if (source == vue.getjButtonSuivant1()) {
            ctrlPrincipal.afficherPraticien(vue);
        }
    }

    public F_VISITEUR getVue() {
        return vue;
    }

    public void setVue(F_VISITEUR vue) {
        this.vue = vue;
    }
   
    
}


