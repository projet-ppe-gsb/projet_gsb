package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modele.metier.Visiteur;
import vue.F_VISITEUR;
import java.util.List;
import modele.dao.DaoVisiteur;
import modele.metier.Secteur;
import vue.Menu_General;

public class CtrlVisiteur implements ActionListener {

    private final F_VISITEUR vue;
  
    private List<Visiteur> lesVisiteurs;
    private modele.metier.Visiteur unVisiteur;
    private String login;
    CtrlPrincipal ctrlPrincipal;
    
    Menu_General vueMenu;
    
    public CtrlVisiteur(F_VISITEUR vue, CtrlPrincipal leControleurPrincipal) {
        System.out.println ("Controller()");
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        afficherLesVisiteurs();
        
        vue.getjButtonOk().addActionListener(this);
        vue.getjButtonSuivant1().addActionListener(this);
        vue.getjButtonPrecedent1().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);

    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    public final void afficherLesVisiteurs() {
        try {
            lesVisiteurs = DaoVisiteur.selectAll();
            for (Visiteur visiteur : lesVisiteurs) {
                vue.getjComboBoxChercher().addItem(visiteur);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    
    public F_VISITEUR getVue() {
        return this.vue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjButtonOk()) {
            unVisiteur = (Visiteur) vue.getjComboBoxChercher().getSelectedItem();
            vue.getjTextFieldNom().setText(unVisiteur.getNom());
            vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
            vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
            vue.getjTextFieldVille().setText(unVisiteur.getVille());
            vue.getjTextFieldCodePostal().setText(unVisiteur.getCp());
            
            Secteur secteur = unVisiteur.getSecteur();
            if ("".equals(secteur.getSec_code())) {
                vue.getJTextFieldSecteur().setText("Aucun secteur");
            } else {
                vue.getJTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
            }
            vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());
        }

        if (source == vue.getjButtonSuivant1()) {
            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxChercher().getItemCount()) {
                unVisiteur = (Visiteur) vue.getjComboBoxChercher().getItemAt(z);
                vue.getjComboBoxChercher().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
                vue.getjTextFieldVille().setText(unVisiteur.getVille());
                vue.getjTextFieldCodePostal().setText(unVisiteur.getCp());
                Secteur secteur = unVisiteur.getSecteur();
                if ("".equals(secteur.getSec_code())) {
                    vue.getJTextFieldSecteur().setText("Aucun secteur");
                } else {
                    vue.getJTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
                vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());

            }

        }

        if (source == vue.getjButtonPrecedent1()) {
            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i - 1;
            if (z >= 0) {
                unVisiteur = (Visiteur) vue.getjComboBoxChercher().getItemAt(z);
                vue.getjComboBoxChercher().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
                vue.getjTextFieldVille().setText(unVisiteur.getVille());
                vue.getjTextFieldCodePostal().setText(unVisiteur.getCp());
                
                Secteur secteur = unVisiteur.getSecteur();
                if ("".equals(secteur.getSec_code())) {
                    vue.getJTextFieldSecteur().setText("Aucun secteur");
                } else {
                    vue.getJTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
                vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());
            }
        }
        
        if (source == vue.getjButtonFermer()) {
            vue.dispose();
            vueMenu = new Menu_General();
            CtrlMenu controlleur = new CtrlMenu(vueMenu, ctrlPrincipal);
            vueMenu.setVisible(true);
        }
    }
}
