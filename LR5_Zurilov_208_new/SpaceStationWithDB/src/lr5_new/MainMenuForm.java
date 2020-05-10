package lr5_new;

public class MainMenuForm extends javax.swing.JFrame {
    
    public MainMenuForm() 
    {         
        initComponents();              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stationManagementButton = new javax.swing.JButton();
        shipCrewManagementButton = new javax.swing.JButton();
        exitApplicationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setLocation(new java.awt.Point(350, 320));
        setName("mainWindowFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(350, 320));

        stationManagementButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        stationManagementButton.setText("Station Management");
        stationManagementButton.setMaximumSize(new java.awt.Dimension(200, 50));
        stationManagementButton.setMinimumSize(new java.awt.Dimension(200, 50));
        stationManagementButton.setPreferredSize(new java.awt.Dimension(200, 50));
        stationManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationMangementActionPerformed(evt);
            }
        });

        shipCrewManagementButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        shipCrewManagementButton.setText("Ship's Management");
        shipCrewManagementButton.setMaximumSize(new java.awt.Dimension(220, 50));
        shipCrewManagementButton.setMinimumSize(new java.awt.Dimension(220, 50));
        shipCrewManagementButton.setPreferredSize(new java.awt.Dimension(400, 500));
        shipCrewManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipsManagementActionPerformed(evt);
            }
        });

        exitApplicationButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        exitApplicationButton.setText("Exit");
        exitApplicationButton.setMaximumSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.setMinimumSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.setPreferredSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitApplicationButtonshipsManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(shipCrewManagementButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(stationManagementButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitApplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(stationManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(shipCrewManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(exitApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stationMangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationMangementActionPerformed
        StationsManagementForm form = new StationsManagementForm();
        form.setVisible(true);
    }//GEN-LAST:event_stationMangementActionPerformed

    private void shipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipsManagementActionPerformed
       
        ShipManagementForm form = new ShipManagementForm();
        form.setVisible(true);
    }//GEN-LAST:event_shipsManagementActionPerformed

    private void exitApplicationButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitApplicationButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitApplicationButtonshipsManagementActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitApplicationButton;
    private javax.swing.JButton shipCrewManagementButton;
    private javax.swing.JButton stationManagementButton;
    // End of variables declaration//GEN-END:variables
}
