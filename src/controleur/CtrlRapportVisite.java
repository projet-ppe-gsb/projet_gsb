/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.F_MEDICAMENT;
import vue.RAPPORT_VISITE;

/**
 *
 * @author btssio
 */
public class CtrlRapportVisite {
    
     public CtrlRapportVisite(RAPPORT_VISITE vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
    }

    public RAPPORT_VISITE getVue() {
        return vue;
    }

    public void setVue(RAPPORT_VISITE vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    private RAPPORT_VISITE vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
}
