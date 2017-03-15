package controleur;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CtrlPrincipal {

    CtrlMenu ctrlMenu;
    CtrlPraticien ctrlPraticien;
    CtrlVisiteur ctrlVisiteur;
    CtrlPrincipal ctrlPrincipal;
    CtrlRapportVisite ctrlRapportVisite;
    CtrlMedicament ctrlMedicament;

    public CtrlMenu getCtrlMenu() {
        return ctrlMenu;
    }

    public void setCtrlMenu(CtrlMenu ctrlMenu) {
        this.ctrlMenu = ctrlMenu;
    }

    public CtrlPraticien getCtrlPraticien() {
        return ctrlPraticien;
    }

    public void setCtrlPraticien(CtrlPraticien ctrlPraticien) {
        this.ctrlPraticien = ctrlPraticien;
    }

    public CtrlRapportVisite getCtrlRapportVisite() {
        return ctrlRapportVisite;
    }

    public void setCtrlRapportVisite(CtrlRapportVisite ctrlRapportVisite) {
        this.ctrlRapportVisite = ctrlRapportVisite;
    }

    public CtrlMedicament getCtrlMedicament() {
        return ctrlMedicament;
    }

    public void setCtrlMedicament(CtrlMedicament ctrlMedicament) {
        this.ctrlMedicament = ctrlMedicament;
    }


    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }

    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    public void afficherVisiteur(JFrame laVue) {
        laVue.setVisible(false);
        this.ctrlVisiteur.getVue().setVisible(true);
    }
    public void afficherPraticien(JFrame laVue) {
        laVue.setVisible(false);
        this.ctrlPraticien.getVue().setVisible(true);
    }
    public void afficherMedicament(JFrame laVue) {
        laVue.setVisible(false);
        this.ctrlMedicament.getVue().setVisible(true);
    }
    public void afficherRapportVisite(JFrame laVue) {
        laVue.setVisible(false);
        this.ctrlRapportVisite.getVue().setVisible(true);
    }
    
    public void afficherMenu(JFrame laVue) {
        laVue.setVisible(false);
        this.ctrlMenu.getVue().setVisible(true);
    }

    public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }

}
    
    
    

    
    

}
