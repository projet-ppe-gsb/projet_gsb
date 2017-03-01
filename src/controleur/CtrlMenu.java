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

public class CtrlMenu implements ActionListener {

    private Menu_General vue;
    CtrlVisiteur ctrlVisiteur;
    CtrlPrincipal ctrlPrincipal;

    private String login;
  

    public CtrlMenu(Menu_General vue, String login) {
        this.vue = vue;
        this.login = login;
        vue.getjToggleButtonVisiteurs().addActionListener(this);
        vue.getjToggleButtonComptesRendus().addActionListener(this);
        vue.getjToggleButtonPraticiens().addActionListener(this);
        vue.getjToggleButtonMedicaments().addActionListener(this);
    }
  
    public void afficherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
        this.vue.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjToggleButtonVisiteurs()) {
            afficherVisiteur();
        }

//      
   }
}
