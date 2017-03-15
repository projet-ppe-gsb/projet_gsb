package vue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author btssio
 */
public class F_CONNEXION extends javax.swing.JFrame {

    public F_CONNEXION() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelConnexion = new javax.swing.JLabel();
        jTextFieldIdentifiant = new javax.swing.JTextField();
        jTextFieldMDP = new javax.swing.JTextField();
        jToggleButtonOK = new javax.swing.JToggleButton();
        jToggleButtonQuitter = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabelConnexion.setText("IDENTIFIEZ-VOUS");
        jPanel1.add(jLabelConnexion);
        jLabelConnexion.setBounds(300, 150, 180, 20);
        jPanel1.add(jTextFieldIdentifiant);
        jTextFieldIdentifiant.setBounds(300, 190, 120, 30);
        jPanel1.add(jTextFieldMDP);
        jTextFieldMDP.setBounds(300, 240, 120, 30);

        jToggleButtonOK.setText("OK");
        jPanel1.add(jToggleButtonOK);
        jToggleButtonOK.setBounds(450, 240, 54, 25);

        jToggleButtonQuitter.setText("QUITTER");
        jPanel1.add(jToggleButtonQuitter);
        jToggleButtonQuitter.setBounds(620, 390, 91, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/GSB.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 740, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(F_CONNEXION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_CONNEXION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_CONNEXION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_CONNEXION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_CONNEXION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConnexion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldIdentifiant;
    private javax.swing.JTextField jTextFieldMDP;
    private javax.swing.JToggleButton jToggleButtonOK;
    private javax.swing.JToggleButton jToggleButtonQuitter;
    // End of variables declaration//GEN-END:variables

    public String getIdentifiant() {
        return jTextFieldIdentifiant.getText();
    }
    
    public String getMDP() {
        return jTextFieldMDP.getText();
    }

    public JInternalFrame getjInternalFrame1() {
        return jInternalFrame1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabelConnexion() {
        return jLabelConnexion;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextFieldIdentifiant() {
        return jTextFieldIdentifiant;
    }

    public JTextField getjTextFieldMDP() {
        return jTextFieldMDP;
    }

    public JToggleButton getjToggleButtonOK() {
        return jToggleButtonOK;
    }

    public JToggleButton getjToggleButtonQuitter() {
        return jToggleButtonQuitter;
    }
    
    
}
