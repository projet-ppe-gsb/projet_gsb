/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.F_MEDICAMENT;
import vue.F_PRATICIEN;



/**
 *
 * @author btssio
 */
public class CtrlPraticien {
    
     public CtrlPraticien(F_PRATICIEN vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
    }

    public F_PRATICIEN getVue() {
        return vue;
    }

    public void setVue(F_PRATICIEN vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    private F_PRATICIEN vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
}
