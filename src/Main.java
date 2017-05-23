import vue.*;
import controleur.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modele.dao.Jdbc;

/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jdbc.creer();
        
        try {
            Jdbc.getInstance().connecter();
            JOptionPane.showMessageDialog(null, "Connexion - Connexion réussie");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Connexion - Classe JDBC non trouvée");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Connexion - Echec de connexion");
        }
        
        CtrlPrincipal leControleurPrincipal = new CtrlPrincipal();
        
        Menu_General laVueMenu_General = new Menu_General();
        CtrlMenu leControleurMenu = new CtrlMenu(laVueMenu_General, leControleurPrincipal);
        leControleurPrincipal.setCtrlMenu(leControleurMenu);
        
        F_VISITEUR laVueVisiteur = new F_VISITEUR();
        CtrlVisiteur leControleurVisiteur = new CtrlVisiteur(laVueVisiteur, leControleurPrincipal);
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

        F_CONNEXION laVueConnexion = new F_CONNEXION();
        CtrlConnexion leControleurConnexion = new CtrlConnexion(laVueConnexion, leControleurPrincipal);
        leControleurPrincipal.setCtrlConnexion(leControleurConnexion);
        
        // afficher la vue
        laVueConnexion.setVisible(true);
        
        

    }

}