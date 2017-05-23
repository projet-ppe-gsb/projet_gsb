package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoPraticien;
import modele.metier.Praticien;
import vue.F_PRATICIEN;
import vue.Menu_General;

public class CtrlPraticien implements ActionListener {
    
    private final F_PRATICIEN vue;
    private List<Praticien> lesPraticiens;
    private Praticien unPraticien;
    
    CtrlPrincipal ctrlPrincipal;
    Menu_General vueMenu;

    private boolean modeRapportVisite; // La fenêtre est affichée depuis Rapport Visite
    
    public CtrlPraticien(F_PRATICIEN vue, CtrlPrincipal leControleurPrincipal, Praticien Praticien) {

        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        
        vue.getjComboBoxChercher().setEnabled(false);
        vue.getjButtonSuivant().setEnabled(false);
        vue.getjButtonPrecedent().setEnabled(false);
        
        vue.getjTextFieldAdresse().setEnabled(false);
        vue.getjTextFieldCP1().setEnabled(false);
        vue.getjTextFieldCoefNot().setEnabled(false);
        vue.getjTextFieldNom().setEnabled(false);
        vue.getjTextFieldNumero().setEnabled(false);
        vue.getjTextFieldPrenom().setEnabled(false);
        vue.getjTextFieldVille().setEnabled(false);
        
        vue.getjButtonFermer().addActionListener(this);
        
        modeRapportVisite = true;
        
        this.unPraticien = Praticien;
        
        afficherLePraticien();

    }
    
    public CtrlPraticien(F_PRATICIEN vue, CtrlPrincipal leControleurPrincipal) {

        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        afficherLesPraticiens();
        
        vue.getjComboBoxChercher().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);

    }
    
    public final void afficherLePraticien() {
        vue.getjComboBoxChercher().removeAllItems();
        vue.getjComboBoxChercher().addItem(unPraticien);

        vue.getjTextFieldNumero().setText(unPraticien.getNumero());
        vue.getjTextFieldNom().setText(unPraticien.getNom());
        vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
        vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
        vue.getjTextFieldVille().setText(unPraticien.getVille());
        vue.getjTextFieldCP1().setText(unPraticien.getCp());
        vue.getjTextFieldCoefNot().setText(unPraticien.getCoef());
        vue.getjComboLieuEx().removeAllItems();
        vue.getjComboLieuEx().addItem(unPraticien.getType().getLibelle());
    }
        
    public final void afficherLesPraticiens() {
        try {
            lesPraticiens = DaoPraticien.selectAll();
            for (Praticien praticien : lesPraticiens) {
                vue.getjComboBoxChercher().addItem(praticien);
            }
            
            unPraticien = (Praticien) vue.getjComboBoxChercher().getSelectedItem();
            vue.getjTextFieldNumero().setText(unPraticien.getNumero());
            vue.getjTextFieldNom().setText(unPraticien.getNom());
            vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
            vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
            vue.getjTextFieldVille().setText(unPraticien.getVille());
            vue.getjTextFieldCP1().setText(unPraticien.getCp());
            vue.getjTextFieldCoefNot().setText(unPraticien.getCoef());
            vue.getjComboLieuEx().addItem(unPraticien.getType().getLibelle());

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    
    public F_PRATICIEN getVue() {
        return this.vue;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vue.getjComboBoxChercher()) {
            unPraticien = (Praticien) vue.getjComboBoxChercher().getSelectedItem();
            vue.getjTextFieldNumero().setText(unPraticien.getNumero());
            vue.getjTextFieldNom().setText(unPraticien.getNom());
            vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
            vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
            vue.getjTextFieldVille().setText(unPraticien.getVille());
            vue.getjTextFieldCP1().setText(unPraticien.getCp());
            vue.getjTextFieldCoefNot().setText(unPraticien.getCoef());
            vue.getjComboLieuEx().removeAllItems();
            vue.getjComboLieuEx().addItem(unPraticien.getType().getLibelle());
        }

        if (source == vue.getjButtonSuivant()) {
            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i + 1;
            if (z < vue.getjComboBoxChercher().getItemCount()) {
                unPraticien = (Praticien) vue.getjComboBoxChercher().getItemAt(z);
                vue.getjComboBoxChercher().setSelectedIndex(z);
                vue.getjTextFieldNumero().setText(unPraticien.getNumero());
                vue.getjTextFieldNom().setText(unPraticien.getNom());
                vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
                vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
                vue.getjTextFieldVille().setText(unPraticien.getVille());
                vue.getjTextFieldCP1().setText(unPraticien.getCp());
                vue.getjTextFieldCoefNot().setText(unPraticien.getCoef());
                vue.getjComboLieuEx().removeAllItems();
                vue.getjComboLieuEx().addItem(unPraticien.getType().getLibelle());

            }
        }

        if (source == vue.getjButtonPrecedent()) {
            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i - 1;
            if (z >= 0) {
                unPraticien = (Praticien) vue.getjComboBoxChercher().getItemAt(z);
                vue.getjComboBoxChercher().setSelectedIndex(z);
                vue.getjTextFieldNumero().setText(unPraticien.getNumero());
                vue.getjTextFieldNom().setText(unPraticien.getNom());
                vue.getjTextFieldPrenom().setText(unPraticien.getPrenom());
                vue.getjTextFieldAdresse().setText(unPraticien.getAdresse());
                vue.getjTextFieldVille().setText(unPraticien.getVille());
                vue.getjTextFieldCP1().setText(unPraticien.getCp());
                vue.getjTextFieldCoefNot().setText(unPraticien.getCoef());
                vue.getjComboLieuEx().removeAllItems();
                vue.getjComboLieuEx().addItem(unPraticien.getType().getLibelle());
            }
        }

        if (source == vue.getjButtonFermer()) {
            
            if(modeRapportVisite) {
                vue.dispose();
            } else {
                vue.dispose();
                vueMenu = new Menu_General();
                CtrlMenu controlleur = new CtrlMenu(vueMenu, ctrlPrincipal);
                vueMenu.setVisible(true);   
            }
        }
    }
    
}
