/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;


/**
 *
 * @author btssio
 */
public class Menu_General extends javax.swing.JFrame {

    /**
     * Creates new form Menu_General
     */
    public Menu_General() {
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
        jLabelTitreGestionCR = new javax.swing.JLabel();
        jLabelComptesRendus = new javax.swing.JLabel();
        jLabelVisiteurs = new javax.swing.JLabel();
        jLabelPraticiens = new javax.swing.JLabel();
        jLabelMedicaments = new javax.swing.JLabel();
        jLabelQuitter = new javax.swing.JLabel();
        jToggleButtonComptesRendus = new javax.swing.JToggleButton();
        jToggleButtonVisiteurs = new javax.swing.JToggleButton();
        jToggleButtonPraticiens = new javax.swing.JToggleButton();
        jToggleButtonMedicaments = new javax.swing.JToggleButton();
        jToggleButtonQuitter = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RAPPORT_VISITE");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jLabelTitreGestionCR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitreGestionCR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitreGestionCR.setText("Gestion des comptes rendus");
        jPanel1.add(jLabelTitreGestionCR);
        jLabelTitreGestionCR.setBounds(190, 10, 406, 28);

        jLabelComptesRendus.setText("Comptes Rendus");
        jPanel1.add(jLabelComptesRendus);
        jLabelComptesRendus.setBounds(370, 100, 119, 15);

        jLabelVisiteurs.setText("Visiteurs");
        jPanel1.add(jLabelVisiteurs);
        jLabelVisiteurs.setBounds(370, 150, 63, 15);

        jLabelPraticiens.setText("Praticiens");
        jPanel1.add(jLabelPraticiens);
        jLabelPraticiens.setBounds(370, 200, 71, 15);

        jLabelMedicaments.setText("Medicaments");
        jPanel1.add(jLabelMedicaments);
        jLabelMedicaments.setBounds(370, 250, 94, 15);

        jLabelQuitter.setText("Quitter");
        jPanel1.add(jLabelQuitter);
        jLabelQuitter.setBounds(370, 300, 50, 15);

        jToggleButtonComptesRendus.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        jToggleButtonComptesRendus.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jToggleButtonComptesRendus);
        jToggleButtonComptesRendus.setBounds(330, 90, 24, 25);

        jToggleButtonVisiteurs.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        jToggleButtonVisiteurs.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jToggleButtonVisiteurs);
        jToggleButtonVisiteurs.setBounds(330, 140, 24, 25);

        jToggleButtonPraticiens.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        jToggleButtonPraticiens.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jToggleButtonPraticiens);
        jToggleButtonPraticiens.setBounds(330, 190, 24, 25);

        jToggleButtonMedicaments.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        jToggleButtonMedicaments.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jToggleButtonMedicaments);
        jToggleButtonMedicaments.setBounds(330, 240, 24, 25);

        jToggleButtonQuitter.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledForeground"));
        jToggleButtonQuitter.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jToggleButtonQuitter);
        jToggleButtonQuitter.setBounds(330, 290, 24, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/GSB Small.PNG"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 100, 250, 160);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 50, 440, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComptesRendus;
    private javax.swing.JLabel jLabelMedicaments;
    private javax.swing.JLabel jLabelPraticiens;
    private javax.swing.JLabel jLabelQuitter;
    private javax.swing.JLabel jLabelTitreGestionCR;
    private javax.swing.JLabel jLabelVisiteurs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButtonComptesRendus;
    private javax.swing.JToggleButton jToggleButtonMedicaments;
    private javax.swing.JToggleButton jToggleButtonPraticiens;
    private javax.swing.JToggleButton jToggleButtonQuitter;
    private javax.swing.JToggleButton jToggleButtonVisiteurs;
    // End of variables declaration//GEN-END:variables
}