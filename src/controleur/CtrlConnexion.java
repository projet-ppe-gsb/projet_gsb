package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vue.F_CONNEXION;
import modele.dao.DAOConnexion;
import vue.Menu_General;


public class CtrlConnexion implements ActionListener {

    private F_CONNEXION vue;
    
    CtrlPrincipal ctrlPrincipal;
    
    public CtrlConnexion(F_CONNEXION vue, CtrlPrincipal leControleurPrincipal) {
        
        this.vue = vue;
        
        vue.getjButtonConnexion().addActionListener(this);
        vue.getjButtonQuitter().addActionListener(this);
        vue.getjTextFieldDate().addActionListener(this);
        vue.getjTextFieldNom().addActionListener(this);
        
        this.ctrlPrincipal = leControleurPrincipal;
    }

    public F_CONNEXION getVue() {
        return this.vue;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object source = e.getSource();
        
        if(source == vue.getjButtonQuitter()) {
            int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (rep == JOptionPane.YES_OPTION) {
                // mettre fin à l'application
                System.exit(0);
            }
        }
        
        if(source == vue.getjButtonConnexion()) {
            
            try {
                if(testConnexion(vue.getjTextFieldNom().getText(),vue.getjTextFieldDate().getText())) {
                    vue.dispose();
                    Menu_General vueMenu = new Menu_General();
                    vueMenu.setVisible(true);                  
                    CtrlMenu menu = new CtrlMenu(vueMenu,ctrlPrincipal);
                } else {
                    JOptionPane.showMessageDialog(vue,"Merci de vérifier le mot de passe entré ou l'identifiant.","Identifiants incorrects",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                System.out.println("Erreur:" + ex);
            }
        }
    }
    
    private boolean testConnexion(String nom, String date) throws SQLException, ClassNotFoundException {
        
        if(DAOConnexion.checkIds(nom, date)) {
            return true;
        } else {
            return false;
        }  
    }
   
}
