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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jButtonQuitter = new javax.swing.JToggleButton();
        jButtonConnexion = new javax.swing.JToggleButton();
        jTextFieldStatut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        setTitle("Connexion à l'application GSB");

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/logogsb.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 70);

        jLabel2.setText("Date d'embauche:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 160, 130, 14);

        jLabel3.setText("Nom: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 100, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Connexion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 40, 130, 22);
        jPanel1.add(jTextFieldDate);
        jTextFieldDate.setBounds(230, 160, 150, 20);
        jPanel1.add(jTextFieldNom);
        jTextFieldNom.setBounds(230, 100, 150, 20);

        jButtonQuitter.setText("Quitter");
        jPanel1.add(jButtonQuitter);
        jButtonQuitter.setBounds(320, 250, 105, 23);

        jButtonConnexion.setText("Connexion");
        jPanel1.add(jButtonConnexion);
        jButtonConnexion.setBounds(160, 220, 105, 23);

        jTextFieldStatut.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jTextFieldStatut);
        jTextFieldStatut.setBounds(120, 190, 260, 0);

        jLabel4.setText("E4: Nom: swiss - Date: 18-jun-2003");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 270, 320, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JToggleButton jButtonConnexion;
    private javax.swing.JToggleButton jButtonQuitter;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JLabel jTextFieldStatut;
    // End of variables declaration//GEN-END:variables

    public JToggleButton getjButtonConnexion() {
        return jButtonConnexion;
    }

    public void setjButtonConnexion(JToggleButton jButtonConnexion) {
        this.jButtonConnexion = jButtonConnexion;
    }

    public JToggleButton getjButtonQuitter() {
        return jButtonQuitter;
    }

    public void setjButtonQuitter(JToggleButton jButtonQuitter) {
        this.jButtonQuitter = jButtonQuitter;
    }

    public JTextField getjTextFieldDate() {
        return jTextFieldDate;
    }

    public void setjTextFieldDate(JTextField jTextFieldDate) {
        this.jTextFieldDate = jTextFieldDate;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public void setjTextFieldStatut(JLabel jTextFieldStatut) {
        this.jTextFieldStatut = jTextFieldStatut;
    }

}
