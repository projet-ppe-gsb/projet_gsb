/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vue.F_MEDICAMENT;

/**
 *
 * @author btssio
 */
public class CtrlMedicament implements ActionListener{
    private F_MEDICAMENT vue; // LA VUE
    CtrlPrincipal ctrlPrincipal;
    
     public CtrlMedicament (F_MEDICAMENT vue, CtrlPrincipal leControleurPrincipal) {
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
            ctrlPrincipal.afficherPraticien(vue);
        }
        if (source == vue.getjButtonSuivant()) {
            ctrlPrincipal.afficherRapportVisite(vue);
        }
    }

    public F_MEDICAMENT getVue() {
        return vue;
    }

    public void setVue(F_MEDICAMENT vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    
}
