/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.dao.DAORapportVisite;
import modele.dao.DaoPraticien;
import modele.metier.Praticien;
import vue.RAPPORT_VISITE;

import modele.metier.RapportVisite;
import vue.F_PRATICIEN;
import vue.Menu_General;


public final class CtrlRapportVisite implements ActionListener{
    
    private RAPPORT_VISITE vue; // LA VUE
    CtrlPrincipal ctrlPrincipal;
    
    private List<RapportVisite> lesRapports;
    private RapportVisite unRapport;
    
    private List<Praticien> lesPraticiens;
    private Praticien unPraticien;
    
    int pos = 0;
    
    Menu_General vueMenu;
    F_PRATICIEN vuePraticien;
    
     public CtrlRapportVisite(RAPPORT_VISITE vue, CtrlPrincipal leControleurPrincipal) {
         
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
        
        vue.getjButtonPrecedent().addActionListener(this);
        vue.getjButtonSuivant().addActionListener(this);
        vue.getjButtonFermer().addActionListener(this);
        vue.getjButtonDetails().addActionListener(this);
        vue.getjButtonSauvegarder().addActionListener(this);
        vue.getjButtonNouveau().addActionListener(this);
        
        vue.getjButtonSauvegarder().setEnabled(false);
        
        try {
            lesRapports = DAORapportVisite.selectAll();
        } catch (Exception e) {
            System.out.println("Erreur: " + e);
        }
        
        vue.getjTextFieldNumRapport().setText(String.valueOf(lesRapports.get(lesRapports.size()  -1).getNumeroRapport())); // On affiche le dernier Rapport
        unRapport = lesRapports.get(lesRapports.size()  -1);
        unPraticien = unRapport.getPraticien();
        
        pos = lesRapports.size();
        
        refreshInfos();
    }
     
    public RAPPORT_VISITE getVue() {
        return this.vue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source == vue.getjButtonPrecedent()) {   
            // On récupère la position du rapport actuel dans la liste "lesRapports"
            int temppos; 
            temppos = pos - 1; 
            
            if(temppos >= 0) { // On vérifie si, en cliquant sur le bouton précédent, on ne dépasse pas la limite du tableau ( < 0)
                // On sélectionne l'élement précédent dans le tableau et on affiche les informations du rapport
                pos--; 
                unRapport = lesRapports.get(pos);
                vue.getjTextFieldNumRapport().setText(String.valueOf(unRapport.getNumeroRapport()));
                
                refreshInfos();
            }
        }

        if(source == vue.getjButtonSuivant()) {
            // On récupère la position du rapport actuel dans la liste "lesRapports"
            int temppos;
            temppos = pos + 1;
            
            if(temppos < lesRapports.size()) { // On vérifie si, en cliquant sur le bouton suivant, on ne dépasse pas la limite du tableau ( > x , x = longueur du tableau)
                // On sélectionne l'élement suivant dans le tableau et on affiche les informations du rapport
                pos++;
                unRapport = lesRapports.get(pos);
                vue.getjTextFieldNumRapport().setText(String.valueOf(unRapport.getNumeroRapport()));
                
                refreshInfos();
            }
        }
        
        if(source == vue.getjButtonDetails()) {
            
            vuePraticien = new F_PRATICIEN();
            CtrlPraticien controlleur = new CtrlPraticien(vuePraticien, ctrlPrincipal, unPraticien);
            vuePraticien.setVisible(true);
        }
        
        if(source == vue.getjButtonNouveau()) {
            
            try {
                // On vide les champs
                vue.getjTextFieldDate().setText("");
                vue.getjTextFieldMotif().setText("");
                vue.getjTextFieldNumRapport().setText("");
                vue.jTextAreaBilan().setText("");
                vue.getjComboBoxPraticien().removeAllItems();
                
                unRapport = null;
                unPraticien = null;
                
                // On affiche les praticiens
                lesPraticiens = DaoPraticien.selectAll();
                } catch (SQLException error) {
                    System.out.println("Erreur: " + error);
                }
            
                for (Praticien praticien : lesPraticiens) {
                    vue.getjComboBoxPraticien().addItem(praticien);
                }
                
                vue.getjTextFieldNumRapport().setText(String.valueOf(lesRapports.get(lesRapports.size() - 1 ).getNumeroRapport() + 1));
        }
        
        if(source == vue.getjButtonFermer()) {
            vue.dispose();
            vueMenu = new Menu_General();
            CtrlMenu controlleur = new CtrlMenu(vueMenu, ctrlPrincipal);
            vueMenu.setVisible(true);
        }
    }
    
    public void refreshInfos() {
        // On raffraichi la liste
        vue.getjComboBoxPraticien().removeAllItems();
        vue.getjComboBoxPraticien().addItem(unRapport.getPraticien());
        
        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatee = formatDate.format(unRapport.getDateRapport());
        
        vue.getjTextFieldDate().setText(dateFormatee);
        vue.getjTextFieldMotif().setText(unRapport.getMotifRapport());
        vue.jTextAreaBilan().setText(unRapport.getBilanRapport());
        
        unPraticien = unRapport.getPraticien();
        
    }
}
