// Vue

package vue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.CtrlVisiteur;

/**
 *
 * @author btssio
 */

public class F_VISITEUR extends javax.swing.JFrame {
    DefaultComboBoxModel modeleListeVisiteurs;
    
    /**
     * Creates new form F_VISITEUR
     */
    public F_VISITEUR() {
        initComponents();
        
        modeleListeVisiteurs = new DefaultComboBoxModel();
        jComboBoxChercher.setModel(modeleListeVisiteurs);
       
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
        jLabelVisiteur = new javax.swing.JLabel();
        jLabelChercher = new javax.swing.JLabel();
        jComboBoxChercher = new javax.swing.JComboBox();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jLabelVille = new javax.swing.JLabel();
        jLabelSecteur = new javax.swing.JLabel();
        jLabelLabo = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldLabo = new javax.swing.JTextField();
        jTextFieldAdresse = new javax.swing.JTextField();
        jTextFieldCodePostal = new javax.swing.JTextField();
        jTextFieldVille = new javax.swing.JTextField();
        jButtonPrecedent1 = new javax.swing.JButton();
        jButtonSuivant1 = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jTextFieldPrenom1 = new javax.swing.JTextField();
        jTextFieldSecteur1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabelVisiteur.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelVisiteur.setText("Visiteur");
        jPanel1.add(jLabelVisiteur);
        jLabelVisiteur.setBounds(250, 10, 137, 23);

        jLabelChercher.setText("Visiteur");
        jPanel1.add(jLabelChercher);
        jLabelChercher.setBounds(12, 48, 110, 21);

        jComboBoxChercher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChercherActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxChercher);
        jComboBoxChercher.setBounds(130, 48, 220, 21);

        jLabelNom.setText("Nom");
        jPanel1.add(jLabelNom);
        jLabelNom.setBounds(12, 89, 90, 14);

        jLabelPrenom.setText("Prenom");
        jPanel1.add(jLabelPrenom);
        jLabelPrenom.setBounds(12, 120, 100, 14);

        jLabelAdresse.setText("Adresse");
        jPanel1.add(jLabelAdresse);
        jLabelAdresse.setBounds(12, 157, 110, 14);

        jLabelVille.setText("Ville");
        jPanel1.add(jLabelVille);
        jLabelVille.setBounds(12, 194, 100, 14);

        jLabelSecteur.setText("Secteur");
        jPanel1.add(jLabelSecteur);
        jLabelSecteur.setBounds(12, 234, 100, 14);

        jLabelLabo.setText("Labo");
        jPanel1.add(jLabelLabo);
        jLabelLabo.setBounds(10, 270, 90, 14);
        jPanel1.add(jTextFieldNom);
        jTextFieldNom.setBounds(130, 87, 146, 20);
        jPanel1.add(jTextFieldLabo);
        jTextFieldLabo.setBounds(130, 270, 146, 20);
        jPanel1.add(jTextFieldAdresse);
        jTextFieldAdresse.setBounds(130, 155, 410, 20);
        jPanel1.add(jTextFieldCodePostal);
        jTextFieldCodePostal.setBounds(130, 192, 39, 20);
        jPanel1.add(jTextFieldVille);
        jTextFieldVille.setBounds(200, 190, 93, 20);

        jButtonPrecedent1.setText("Précédent");
        jPanel1.add(jButtonPrecedent1);
        jButtonPrecedent1.setBounds(130, 320, 150, 23);

        jButtonSuivant1.setText("Suivant");
        jPanel1.add(jButtonSuivant1);
        jButtonSuivant1.setBounds(330, 320, 160, 23);

        jButtonFermer.setText("Fermer");
        jPanel1.add(jButtonFermer);
        jButtonFermer.setBounds(387, 370, 90, 23);
        jPanel1.add(jTextFieldPrenom1);
        jTextFieldPrenom1.setBounds(130, 118, 146, 20);
        jPanel1.add(jTextFieldSecteur1);
        jTextFieldSecteur1.setBounds(130, 230, 146, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxChercherActionPerformed

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
            java.util.logging.Logger.getLogger(F_VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_VISITEUR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonPrecedent1;
    private javax.swing.JButton jButtonSuivant1;
    private javax.swing.JComboBox jComboBoxChercher;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelChercher;
    private javax.swing.JLabel jLabelLabo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSecteur;
    private javax.swing.JLabel jLabelVille;
    private javax.swing.JLabel jLabelVisiteur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCodePostal;
    private javax.swing.JTextField jTextFieldLabo;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom1;
    private javax.swing.JTextField jTextFieldSecteur1;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables
    public JButton getjButtonFermer() {
        return jButtonFermer;
    }

    public JButton getjButtonPrecedent1() {
        return jButtonPrecedent1;
    }

    public JButton getjButtonSuivant1() {
        return jButtonSuivant1;
    }

    public JComboBox getjComboBoxChercher() {
        return jComboBoxChercher;
    }

    public JTextField getjTextFieldLabo() {
        return jTextFieldLabo;
    }

    public JTextField getJTextFieldSecteur() {
        return jTextFieldSecteur1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextFieldAdresse() {
        return jTextFieldAdresse;
    }

    public JTextField getjTextFieldCodePostal() {
        return jTextFieldCodePostal;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public JTextField getjTextFieldPrenom() {
        return jTextFieldPrenom1;
    }

    public JTextField getjTextFieldVille() {
        return jTextFieldVille;
    }
}
