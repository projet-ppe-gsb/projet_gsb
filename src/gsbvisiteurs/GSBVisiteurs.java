
package gsbvisiteurs;

/**
 *
 * @author btssio
 */


import vue.F_CONNEXION;
import vue.Menu_General;
import vue.F_VISITEUR;
import controleur.CtrlConnexion;
import controleur.CtrlMenu;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import controleur.CtrlVisiteur;
import javax.swing.UIManager;
import javax.swing.UIManager.*;



/**
 *
 * @author btssio
 */
public class GSBVisiteurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        F_CONNEXION vue = new F_CONNEXION();
        CtrlConnexion controleur = new CtrlConnexion(vue);
        vue.setVisible(true);       
    }
    
}

    
