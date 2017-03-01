/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import vue.F_CONNEXION;
import vue.Menu_General;
import vue.F_VISITEUR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modele.metier.Visiteur;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author btssio
 */
public class CtrlVisiteur {
    private F_VISITEUR vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
    private String login;

    public CtrlVisiteur(F_VISITEUR vue, String login) {
        this.vue = vue;
        this.login = login;
    }
    public CtrlVisiteur(F_VISITEUR vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
    }

     public F_VISITEUR getVue() {
        return vue;
    }

    public void setVue(F_VISITEUR vue) {
        this.vue = vue;
    }
   
    
}


