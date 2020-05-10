package spacestationapp;

// import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;  
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class StationsManagementForm extends javax.swing.JFrame {
    DefaultTableModel model;
    
    public StationsManagementForm() {              
        
        initComponents();
        model = (DefaultTableModel) stationsManagementTable.getModel();
        
        for (int i = 0; i < Data.stationsList.size(); i++)
        {
            String stationName = Data.stationsList.get(i).stationName;
            int stationWeightLimit = Data.stationsList.get(i).stationWeightLimit;
            int stationShipsLimit = Data.stationsList.get(i).shipsLimit;
            
            Object[] data = {stationName, stationWeightLimit, stationShipsLimit};
            model.insertRow(i, data);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quitButton = new javax.swing.JButton();
        createStationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stationsManagementTable = new javax.swing.JTable();
        enterNameTextField = new javax.swing.JTextField();
        enterWeightLimitTextField = new javax.swing.JTextField();
        enterShipsLimitTextField = new javax.swing.JTextField();
        manageStationButton = new javax.swing.JButton();
        stationNameLabel = new javax.swing.JLabel();
        stationWeightLimitLabel = new javax.swing.JLabel();
        stationShipsLimitLabel = new javax.swing.JLabel();
        removeStationButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stations Management");
        setBounds(new java.awt.Rectangle(200, 200, 507, 555));
        setName(""); // NOI18N

        quitButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        quitButton.setText("Quit");
        quitButton.setPreferredSize(new java.awt.Dimension(100, 30));
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        createStationButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        createStationButton.setText("Create Station");
        createStationButton.setPreferredSize(new java.awt.Dimension(100, 30));
        createStationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStationActionPerformed(evt);
            }
        });

        stationsManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Station name", "Ships limit", "Weight limit"
            }
        ));
        jScrollPane1.setViewportView(stationsManagementTable);

        enterNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        enterWeightLimitTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        enterShipsLimitTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        manageStationButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manageStationButton.setText("Manage Station");
        manageStationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStationActionPerformed(evt);
            }
        });

        stationNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        stationNameLabel.setText("Name");

        stationWeightLimitLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        stationWeightLimitLabel.setText("Weight Limit");

        stationShipsLimitLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        stationShipsLimitLabel.setText("Ships Limit");

        removeStationButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        removeStationButton1.setText("Remove Station");
        removeStationButton1.setActionCommand("Remove Station");
        removeStationButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStationButton1manageStationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(createStationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stationNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stationWeightLimitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stationShipsLimitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterShipsLimitTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterWeightLimitTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addComponent(manageStationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeStationButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(stationNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterWeightLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stationWeightLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterShipsLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stationShipsLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(createStationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(manageStationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(removeStationButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStationActionPerformed
        // TODO add your handling code here:
        String stationName = enterNameTextField.getText();
        int stationWeightLimit = Integer.parseInt(enterWeightLimitTextField.getText());
        int stationShipsLimit = Integer.parseInt(enterShipsLimitTextField.getText());  
        Data.stationsList.add(new SpaceshipStation(stationName, stationWeightLimit, stationShipsLimit));       
        
        for (int i = Data.stationsList.size()-1; i < Data.stationsList.size(); i++)
        {       
            Object[] data = {stationName, stationWeightLimit, stationShipsLimit};
            model.insertRow(i, data);
        }
    }//GEN-LAST:event_createStationActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void manageStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStationActionPerformed
        // TODO add your handling code here:
        ManageStationForm form = new ManageStationForm();
        form.setVisible(true);
    }//GEN-LAST:event_manageStationActionPerformed

    private void removeStationButton1manageStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStationButton1manageStationActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = stationsManagementTable.getSelectedRows();       
        for (int i = selectedRows.length - 1; i >= 0; i--) 
        {
            model.removeRow(selectedRows[i]);
            Data.stationsList.remove(i);
        }
    }//GEN-LAST:event_removeStationButton1manageStationActionPerformed

    
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
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */                
        java.awt.EventQueue.invokeLater(() -> {
            new StationsManagementForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createStationButton;
    private javax.swing.JTextField enterNameTextField;
    private javax.swing.JTextField enterShipsLimitTextField;
    private javax.swing.JTextField enterWeightLimitTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageStationButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton removeStationButton1;
    private javax.swing.JLabel stationNameLabel;
    private javax.swing.JLabel stationShipsLimitLabel;
    private javax.swing.JLabel stationWeightLimitLabel;
    private javax.swing.JTable stationsManagementTable;
    // End of variables declaration//GEN-END:variables
}
