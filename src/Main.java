/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import vue.*;
import controleur.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CtrlPrincipal leControleurPrincipal = new CtrlPrincipal();
        
        Menu_General laVueMenu_General = new Menu_General();
        CtrlMenu leControleurMenu = new CtrlMenu(laVueMenu_General, leControleurPrincipal);
        leControleurPrincipal.setCtrlMenu(leControleurMenu);
        
        F_VISITEUR laVueVisiteur = new F_VISITEUR();
        CtrlVisiteur leControleurVisiteur = new CtrlVisiteur(laVueVisiteur);
        leControleurPrincipal.setCtrlVisiteur(leControleurVisiteur);
        
        F_MEDICAMENT laVueMedicament = new F_MEDICAMENT();
        CtrlMedicament leControleurMedicament = new CtrlMedicament(laVueMedicament, leControleurPrincipal);
        leControleurPrincipal.setCtrlMedicament(leControleurMedicament);
        
        F_PRATICIEN laVuePraticien = new F_PRATICIEN();
        CtrlPraticien leControleurPraticien = new CtrlPraticien(laVuePraticien, leControleurPrincipal);
        leControleurPrincipal.setCtrlPraticien(leControleurPraticien);
        
        RAPPORT_VISITE laVueRapport_visite = new RAPPORT_VISITE();
        CtrlRapportVisite leControleurRapportVisite = new CtrlRapportVisite(laVueRapport_visite, leControleurPrincipal);
        leControleurPrincipal.setCtrlRapportVisite(leControleurRapportVisite);

        // afficher la vue
        laVueMenu_General.setVisible(true);

    }

}
