/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.Menu_General;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlMenu implements ActionListener {

    private Menu_General vue;
    CtrlPrincipal ctrlPrincipal;



    public CtrlMenu(Menu_General vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        vue.getjToggleButtonVisiteurs().addActionListener(this);
        vue.getjToggleButtonComptesRendus().addActionListener(this);
        vue.getjToggleButtonPraticiens().addActionListener(this);
        vue.getjToggleButtonMedicaments().addActionListener(this);
        vue.getjButtonDeconnexion().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjToggleButtonVisiteurs()) {
            vue.getjToggleButtonVisiteurs().setSelected(false);
            ctrlPrincipal.afficherVisiteur(vue);
        }
        if (source == vue.getjToggleButtonMedicaments()) {
            vue.getjToggleButtonMedicaments().setSelected(false);
            ctrlPrincipal.afficherMedicament(vue);
        }
        if (source == vue.getjToggleButtonPraticiens()) {
            vue.getjToggleButtonPraticiens().setSelected(false);
            ctrlPrincipal.afficherPraticien(vue);
        }
        if (source == vue.getjToggleButtonComptesRendus()) {
            vue.getjToggleButtonComptesRendus().setSelected(false);
            ctrlPrincipal.afficherRapportVisite(vue);
        }
        if (source == vue.getjButtonDeconnexion()) {
            vue.getjButtonDeconnexion().setSelected(false);
            ctrlPrincipal.afficherConnexion(vue);
        }
    }

    public Menu_General getVue() {
        return vue;
    }

    public void setVue(Menu_General vue) {
        this.vue = vue;
    }
}