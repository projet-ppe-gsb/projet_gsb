/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class F_MEDICAMENT extends javax.swing.JFrame {

    /**
     * Creates new form F_MEDICAMENT
     */
    public F_MEDICAMENT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldComposition = new javax.swing.JTextField();
        jTextFieldNomComm = new javax.swing.JTextField();
        jTextFieldPrix = new javax.swing.JTextField();
        jLabelPrix = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelFamille = new javax.swing.JLabel();
        jButtonSuivant = new javax.swing.JButton();
        jButtonPrecedent = new javax.swing.JButton();
        jLabelMediacament = new javax.swing.JLabel();
        jTextFieldFamille = new javax.swing.JTextField();
        jLabelEffet = new javax.swing.JLabel();
        jLabelComposition = new javax.swing.JLabel();
        jTextFieldContreIndications = new javax.swing.JTextField();
        jTextFieldCode = new javax.swing.JTextField();
        jLabelNomComm = new javax.swing.JLabel();
        jButtonFermer = new javax.swing.JButton();
        jTextFieldEffet1 = new javax.swing.JTextField();
        JLabelContreIndications = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldComposition);
        jTextFieldComposition.setBounds(180, 130, 420, 20);
        jPanel1.add(jTextFieldNomComm);
        jTextFieldNomComm.setBounds(180, 90, 420, 20);
        jPanel1.add(jTextFieldPrix);
        jTextFieldPrix.setBounds(180, 310, 90, 20);

        jLabelPrix.setText("Prix échantillon");
        jPanel1.add(jLabelPrix);
        jLabelPrix.setBounds(30, 310, 72, 20);

        jLabelCode.setText("Code");
        jPanel1.add(jLabelCode);
        jLabelCode.setBounds(30, 70, 25, 14);

        jLabelFamille.setText("Famille");
        jPanel1.add(jLabelFamille);
        jLabelFamille.setBounds(30, 110, 32, 14);

        jButtonSuivant.setText("Suivant");
        jPanel1.add(jButtonSuivant);
        jButtonSuivant.setBounds(330, 350, 120, 23);

        jButtonPrecedent.setText("Précédent");
        jPanel1.add(jButtonPrecedent);
        jButtonPrecedent.setBounds(180, 350, 140, 23);

        jLabelMediacament.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelMediacament.setText("Médicaments");
        jPanel1.add(jLabelMediacament);
        jLabelMediacament.setBounds(260, 0, 106, 40);
        jPanel1.add(jTextFieldFamille);
        jTextFieldFamille.setBounds(180, 110, 420, 20);
        jTextFieldFamille.getAccessibleContext().setAccessibleParent(jTextFieldNomComm);

        jLabelEffet.setText("Effets indésidrables");
        jPanel1.add(jLabelEffet);
        jLabelEffet.setBounds(30, 180, 94, 14);

        jLabelComposition.setText("Composition");
        jPanel1.add(jLabelComposition);
        jLabelComposition.setBounds(30, 130, 58, 14);

        jTextFieldContreIndications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContreIndicationsActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldContreIndications);
        jTextFieldContreIndications.setBounds(180, 230, 420, 80);
        jPanel1.add(jTextFieldCode);
        jTextFieldCode.setBounds(180, 70, 160, 20);

        jLabelNomComm.setText("Nom Commercial");
        jPanel1.add(jLabelNomComm);
        jLabelNomComm.setBounds(30, 90, 78, 14);

        jButtonFermer.setText("Fermer");
        jPanel1.add(jButtonFermer);
        jButtonFermer.setBounds(490, 350, 120, 23);
        jPanel1.add(jTextFieldEffet1);
        jTextFieldEffet1.setBounds(180, 150, 420, 80);

        JLabelContreIndications.setText("Contre Indications");
        jPanel1.add(JLabelContreIndications);
        JLabelContreIndications.setBounds(30, 250, 130, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldContreIndicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContreIndicationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContreIndicationsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_MEDICAMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_MEDICAMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_MEDICAMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_MEDICAMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_MEDICAMENT().setVisible(true);
            }
        });
    }

    public JLabel getJLabelContreIndications() {
        return JLabelContreIndications;
    }

    public JButton getjButtonFermer() {
        return jButtonFermer;
    }

    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }

    public JLabel getjLabelCode() {
        return jLabelCode;
    }

    public JLabel getjLabelComposition() {
        return jLabelComposition;
    }

    public JLabel getjLabelEffet() {
        return jLabelEffet;
    }

    public JLabel getjLabelFamille() {
        return jLabelFamille;
    }

    public JLabel getjLabelMediacament() {
        return jLabelMediacament;
    }

    public JLabel getjLabelNomComm() {
        return jLabelNomComm;
    }

    public JLabel getjLabelPrix() {
        return jLabelPrix;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextFieldCode() {
        return jTextFieldCode;
    }

    public JTextField getjTextFieldComposition() {
        return jTextFieldComposition;
    }

    public JTextField getjTextFieldContreIndications() {
        return jTextFieldContreIndications;
    }

    public JTextField getjTextFieldEffet1() {
        return jTextFieldEffet1;
    }

    public JTextField getjTextFieldFamille() {
        return jTextFieldFamille;
    }

    public JTextField getjTextFieldNomComm() {
        return jTextFieldNomComm;
    }

    public JTextField getjTextFieldPrix() {
        return jTextFieldPrix;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelContreIndications;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelComposition;
    private javax.swing.JLabel jLabelEffet;
    private javax.swing.JLabel jLabelFamille;
    private javax.swing.JLabel jLabelMediacament;
    private javax.swing.JLabel jLabelNomComm;
    private javax.swing.JLabel jLabelPrix;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldComposition;
    private javax.swing.JTextField jTextFieldContreIndications;
    private javax.swing.JTextField jTextFieldEffet1;
    private javax.swing.JTextField jTextFieldFamille;
    private javax.swing.JTextField jTextFieldNomComm;
    private javax.swing.JTextField jTextFieldPrix;
    // End of variables declaration//GEN-END:variables
}
