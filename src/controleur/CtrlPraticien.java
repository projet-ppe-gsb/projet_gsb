/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vue.F_MEDICAMENT;
import vue.F_PRATICIEN;



/**
 *
 * @author btssio
 */
public class CtrlPraticien implements ActionListener{
    private F_PRATICIEN vue; // LA VUE
    CtrlPrincipal ctrlPrincipal;
    
     public CtrlPraticien(F_PRATICIEN vue, CtrlPrincipal leControleurPrincipal) {
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
            ctrlPrincipal.afficherVisiteur(vue);
        }
        if (source == vue.getjButtonSuivant()) {
            ctrlPrincipal.afficherMedicament(vue);
        }
    }

    public F_PRATICIEN getVue() {
        return vue;
    }

    public void setVue(F_PRATICIEN vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
   
}
