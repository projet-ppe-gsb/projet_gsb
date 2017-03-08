/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.Menu_General;
import controleur.CtrlPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vue.F_VISITEUR;

public class CtrlMenu implements ActionListener {

    private Menu_General vue;
    CtrlVisiteur ctrlVisiteur;
    CtrlPrincipal ctrlPrincipal;



    public CtrlMenu(Menu_General vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        vue.getjToggleButtonVisiteurs().addActionListener(this);
        vue.getjToggleButtonComptesRendus().addActionListener(this);
        vue.getjToggleButtonPraticiens().addActionListener(this);
        vue.getjToggleButtonMedicaments().addActionListener(this);
        vue.getjToggleButtonQuitter().addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjToggleButtonVisiteurs()) {
            ctrlPrincipal.afficherVisiteur();
        }
        if (source == vue.getjToggleButtonMedicaments()) {
            ctrlPrincipal.afficherMedicament();
        }
        if (source == vue.getjToggleButtonPraticiens()) {
            ctrlPrincipal.afficherPraticien();
        }
        if (source == vue.getjToggleButtonComptesRendus()) {
            ctrlPrincipal.afficherRapportVisite();
        }
        if (source == vue.getjToggleButtonQuitter()) {
            ctrlPrincipal.quitterApplication();
        }
        
    }
    
     public Menu_General getVue() {
        return vue;
    }

    public void setVue(Menu_General vue) {
        this.vue = vue;
    }
}
