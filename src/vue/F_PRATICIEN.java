/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class F_PRATICIEN extends javax.swing.JFrame {

    /**
     * Creates new form F_PRACTICIEN
     */
    public F_PRATICIEN() {
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
        jLabelChercher = new javax.swing.JLabel();
        jComboBoxChercher = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNum = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jLabelVille = new javax.swing.JLabel();
        jLabelCoeffNot = new javax.swing.JLabel();
        jLabelLieuEx = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldAdresse = new javax.swing.JTextField();
        jTextFieldVille = new javax.swing.JTextField();
        jTextFieldCP1 = new javax.swing.JTextField();
        jTextFieldCoefNot = new javax.swing.JTextField();
        jComboLieuEx = new javax.swing.JComboBox();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jLabelTitre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabelChercher.setText("Praticien:");
        jPanel1.add(jLabelChercher);
        jLabelChercher.setBounds(90, 50, 110, 14);

        jPanel1.add(jComboBoxChercher);
        jComboBoxChercher.setBounds(250, 50, 250, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(12, 94, 817, 10);

        jLabelNum.setText("Numéro: ");
        jPanel1.add(jLabelNum);
        jLabelNum.setBounds(90, 150, 130, 14);
        jPanel1.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(250, 150, 64, 20);

        jLabelNom.setText("Nom: ");
        jPanel1.add(jLabelNom);
        jLabelNom.setBounds(90, 180, 130, 14);

        jLabelPrenom.setText("Prénom: ");
        jPanel1.add(jLabelPrenom);
        jLabelPrenom.setBounds(90, 210, 120, 14);

        jLabelAdresse.setText("Adresse: ");
        jPanel1.add(jLabelAdresse);
        jLabelAdresse.setBounds(90, 240, 140, 14);

        jLabelVille.setText("Ville: ");
        jPanel1.add(jLabelVille);
        jLabelVille.setBounds(90, 270, 140, 14);

        jLabelCoeffNot.setText("COEFF. Notoriete: ");
        jPanel1.add(jLabelCoeffNot);
        jLabelCoeffNot.setBounds(90, 300, 150, 14);

        jLabelLieuEx.setText("Lieu d'exercice:");
        jPanel1.add(jLabelLieuEx);
        jLabelLieuEx.setBounds(90, 330, 150, 14);
        jPanel1.add(jTextFieldNom);
        jTextFieldNom.setBounds(250, 180, 131, 20);
        jPanel1.add(jTextFieldPrenom);
        jTextFieldPrenom.setBounds(250, 210, 131, 20);
        jPanel1.add(jTextFieldAdresse);
        jTextFieldAdresse.setBounds(250, 240, 131, 20);
        jPanel1.add(jTextFieldVille);
        jTextFieldVille.setBounds(350, 270, 135, 20);
        jPanel1.add(jTextFieldCP1);
        jTextFieldCP1.setBounds(250, 270, 80, 20);
        jPanel1.add(jTextFieldCoefNot);
        jTextFieldCoefNot.setBounds(250, 300, 135, 20);

        jPanel1.add(jComboLieuEx);
        jComboLieuEx.setBounds(250, 330, 228, 20);

        jButtonPrecedent.setText("Précédent");
        jPanel1.add(jButtonPrecedent);
        jButtonPrecedent.setBounds(120, 380, 130, 23);

        jButtonSuivant.setText("Suivant");
        jPanel1.add(jButtonSuivant);
        jButtonSuivant.setBounds(290, 380, 120, 23);

        jButtonFermer.setText("Fermer");
        jPanel1.add(jButtonFermer);
        jButtonFermer.setBounds(430, 380, 120, 23);

        jLabelTitre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelTitre.setText("Praticiens");
        jPanel1.add(jLabelTitre);
        jLabelTitre.setBounds(240, 10, 79, 24);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(F_PRATICIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_PRATICIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_PRATICIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_PRATICIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_PRATICIEN().setVisible(true);
            }
        });
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

    public JComboBox getjComboBoxChercher() {
        return jComboBoxChercher;
    }

    public JComboBox getjComboLieuEx() {
        return jComboLieuEx;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabelAdresse() {
        return jLabelAdresse;
    }

    public JLabel getjLabelChercher() {
        return jLabelChercher;
    }

    public JLabel getjLabelCoeffNot() {
        return jLabelCoeffNot;
    }

    public JLabel getjLabelLieuEx() {
        return jLabelLieuEx;
    }

    public JLabel getjLabelNom() {
        return jLabelNom;
    }

    public JLabel getjLabelNum() {
        return jLabelNum;
    }

    public JLabel getjLabelPrenom() {
        return jLabelPrenom;
    }

    public JLabel getjLabelTitre() {
        return jLabelTitre;
    }

    public JLabel getjLabelVille() {
        return jLabelVille;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JTextField getjTextFieldAdresse() {
        return jTextFieldAdresse;
    }

    public JTextField getjTextFieldCP1() {
        return jTextFieldCP1;
    }

    public JTextField getjTextFieldCoefNot() {
        return jTextFieldCoefNot;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public JTextField getjTextFieldNumero() {
        return jTextFieldNumero;
    }

    public JTextField getjTextFieldPrenom() {
        return jTextFieldPrenom;
    }

    public JTextField getjTextFieldVille() {
        return jTextFieldVille;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxChercher;
    private javax.swing.JComboBox jComboLieuEx;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelChercher;
    private javax.swing.JLabel jLabelCoeffNot;
    private javax.swing.JLabel jLabelLieuEx;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelVille;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCP1;
    private javax.swing.JTextField jTextFieldCoefNot;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables
}
