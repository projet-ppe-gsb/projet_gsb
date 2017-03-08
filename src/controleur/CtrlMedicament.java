/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.F_MEDICAMENT;
import vue.F_VISITEUR;

/**
 *
 * @author btssio
 */
public class CtrlMedicament {
    
    public CtrlMedicament(F_MEDICAMENT vue, CtrlPrincipal leControleurPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = leControleurPrincipal;
    }

    public F_MEDICAMENT getVue() {
        return vue;
    }

    public void setVue(F_MEDICAMENT vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    private F_MEDICAMENT vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
}
