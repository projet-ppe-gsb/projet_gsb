package controleur;

import javax.swing.JOptionPane;

public class CtrlPrincipal {

    CtrlMenu ctrlMenu;
    CtrlPraticien ctrlRapportVisite;
    CtrlVisiteur ctrlVisiteur;
    CtrlPrincipal ctrlPrincipal;

//    public void afficherVisiteur() {
//        this.ctrlVisiteur.getVue().setVisible(true);
//        this.ctrlMenu.getVue().setVisible(false);
//    }

    public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }

}
    
    
    

    
    

}
