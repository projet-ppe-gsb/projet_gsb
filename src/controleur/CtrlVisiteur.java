package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modele.metier.Visiteur;
import vue.F_VISITEUR;
import java.util.List;
import modele.dao.DaoVisiteur;
import modele.metier.Secteur;

public class CtrlVisiteur implements ActionListener {

    private F_VISITEUR vue;
    private Visiteur modele;
  
    private List<Visiteur> lesVisiteurs;
    private modele.metier.Visiteur unVisiteur;
    private String login;

    public CtrlVisiteur(F_VISITEUR vue) {
        System.out.println ("Controller()");
        this.vue = vue;
        afficherLesVisiteurs();
        
        getVue().getjButtonOk().addActionListener(this);
        getVue().getjButtonSuivant1().addActionListener(this);
        getVue().getjButtonPrecedent1().addActionListener(this);
        getVue().getjButtonFermer().addActionListener(this);

    }
    
    public void addModel(Visiteur m){
        System.out.println("Controller: adding model");
	this.modele = m;
    } //addModel()

    public void addView(F_VISITEUR v){
	System.out.println("Controller: adding view");
	this.vue = v;
    } //addView()

    public final void afficherLesVisiteurs() {
        try {
            lesVisiteurs = DaoVisiteur.selectAll();
            for (Visiteur visiteur : lesVisiteurs) {
                vue.getjComboBoxChercher().addItem(visiteur);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println("test");
        if (source == vue.getjButtonOk()) {
            unVisiteur = (Visiteur) vue.getjComboBoxChercher().getSelectedItem();
            vue.getjTextFieldNom().setText(unVisiteur.getNom());
            vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
            vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
            vue.getjTextFieldVille().setText(unVisiteur.getVille());
            Secteur secteur = unVisiteur.getSecteur();
            if (secteur == null) {
              //  vue.getJTextFieldSecteur().setText("");
            } else {
              //  vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
            }

           // vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());

        }

      /*  if (source == vue.getjButtonSuivant()) {
            int i = vue.getjComboBoxListeVisiteurs().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxListeVisiteurs().getItemCount()) {
                unVisiteur = (MetierVisiteur) vue.getjComboBoxListeVisiteurs().getItemAt(z);
                vue.getjComboBoxListeVisiteurs().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
                vue.getjTextFieldVille().setText(unVisiteur.getVille());
                Secteur secteur = unVisiteur.getSecteur();
                if (secteur == null) {
                    vue.getjTextFieldSecteur().setText("");
                } else {
                    vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }
                vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());

            }

        }

      /*  if (source == vue.getjButtonPrecedent()) {
            int i = vue.getjComboBoxListeVisiteurs().getSelectedIndex();
            int z = i - 1;
            if (z >= 0) {
                unVisiteur = (MetierVisiteur) vue.getjComboBoxListeVisiteurs().getItemAt(z);
                vue.getjComboBoxListeVisiteurs().setSelectedIndex(z);
                vue.getjTextFieldNom().setText(unVisiteur.getNom());
                vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
                vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
                vue.getjTextFieldVille().setText(unVisiteur.getVille());

                Secteur secteur = unVisiteur.getSecteur();
                if (secteur == null) {
                    vue.getjTextFieldSecteur().setText("");
                } else {
                    vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur().getSec_libelle());
                }

                vue.getjTextFieldLabo().setText(unVisiteur.getLabo().getLab_nom());

            }*/

        }

     /*   if (source == vue.getjButtonFermer()) {
            vue.dispose();
            vueMenu = new VueMenu();
            CtrlMenu controllers = new CtrlMenu(vueMenu, );
            vueMenu.setVisible(true);
        }*/
}
