package spacestationapp;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ShipManagementForm extends javax.swing.JFrame {
    DefaultTableModel shipsInOuterSpaceTableModel;
    DefaultComboBoxModel<Spaceship> shipsBoxModel;
    
    public ShipManagementForm() 
    {    
        initComponents(); 
        shipsInOuterSpaceTableModel = (DefaultTableModel) shipsInOuterSpaceTable.getModel();
        shipsBoxModel = new DefaultComboBoxModel<Spaceship>();
        
        for (int i = 0; i < Data.shipsInOuterSpaceList.size(); i++) 
        {
            shipsBoxModel.addElement(Data.shipsInOuterSpaceList.get(i));
        }
        
        for (int i = 0; i < Data.shipsInOuterSpaceList.size(); i++)
        {
            String shipName = Data.shipsInOuterSpaceList.get(i).shipName;
            int shpWeight = Data.shipsInOuterSpaceList.get(i).shipWeight;
            String pilotRace = Data.shipsInOuterSpaceList.get(i).pilot;
           
            Object[] data = {shipName, shpWeight, pilotRace};
            shipsInOuterSpaceTableModel.insertRow(i, data);
        }
        
        choseShipComboBox.setModel(shipsBoxModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createShipButton = new javax.swing.JButton();
        choseShipLabel = new javax.swing.JLabel();
        changePilotLabel = new javax.swing.JLabel();
        changeNameLabel = new javax.swing.JLabel();
        changeWeightLabel = new javax.swing.JLabel();
        choseShipComboBox = new javax.swing.JComboBox<>();
        changeNameTextField = new javax.swing.JTextField();
        changeWeightTextField = new javax.swing.JTextField();
        racesPilotsListComboBox = new javax.swing.JComboBox<>();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shipsInOuterSpaceTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ships Management");
        setLocation(new java.awt.Point(350, 200));
        setName(""); // NOI18N

        createShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        createShipButton.setText("Create Ship");
        createShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShipActionPerformed(evt);
            }
        });

        choseShipLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        choseShipLabel.setText("Chose Ship");

        changePilotLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changePilotLabel.setText("Change Pilot");

        changeNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeNameLabel.setText("Change Name");

        changeWeightLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeWeightLabel.setText("Change Weight");

        choseShipComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        choseShipComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choseShipComboBoxActionPerformed(evt);
            }
        });

        changeNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        changeWeightTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        racesPilotsListComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        racesPilotsListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Robot", "Human", "Turian", "Crogan" }));

        acceptChangesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        acceptChangesButton.setText("Accept Changes");
        acceptChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptChangesButtonActionPerformed(evt);
            }
        });

        quitAcceptChangesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        quitAcceptChangesButton.setText("Quit");
        quitAcceptChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitShipManagementFormActionPerformed(evt);
            }
        });

        shipsInOuterSpaceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Weight", "Pilot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shipsInOuterSpaceTable);

        removeShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removeShipButton.setText("Remove");
        removeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeShipButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(createShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choseShipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(changeWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(changePilotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(changeWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(choseShipComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(changeNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addComponent(racesPilotsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(acceptChangesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choseShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choseShipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(racesPilotsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePilotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShipActionPerformed
        // TODO add your handling code here:
        CreateShipForm form = new CreateShipForm();
        form.setVisible(true);
    }//GEN-LAST:event_createShipActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed
        // TODO add your handling code here:       
        try
        {
        String shipNameFixed = changeNameTextField.getText();
        int shipsWeightFixed = Integer.parseInt(changeWeightTextField.getText());
        String pilotRace = racesPilotsListComboBox.getSelectedItem().toString();       
        Spaceship fixedShipBuff = (Spaceship) choseShipComboBox.getSelectedItem();
        Spaceship fixedShip = fixedShipBuff;
        
        fixedShip.shipName = shipNameFixed;
        fixedShip.shipWeight = shipsWeightFixed;
        fixedShip.pilot = pilotRace;
        
        Data.shipsInOuterSpaceList.remove(fixedShipBuff);
        Data.shipsInOuterSpaceList.add(fixedShip);
        
        Spaceship[] array = new Spaceship[Data.shipsInOuterSpaceList.size()];
        for(int i = 0; i < array.length; i++) 
        {
            array[i] = Data.shipsInOuterSpaceList.get(i);
        }
        choseShipComboBox = new JComboBox(array);   
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Not an integer value");
        }
    }//GEN-LAST:event_acceptChangesButtonActionPerformed

    private void quitShipManagementFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitShipManagementFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitShipManagementFormActionPerformed

    private void choseShipComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choseShipComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choseShipComboBoxActionPerformed

    private void removeShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeShipButtonActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = shipsInOuterSpaceTable.getSelectedRows();       
        for (int i = selectedRows.length - 1; i >= 0; i--) 
        {
            shipsInOuterSpaceTableModel.removeRow(selectedRows[i]);
            shipsBoxModel.removeElementAt(selectedRows[i]);
            Data.shipsInOuterSpaceList.remove(i);
        }
        
        
    }//GEN-LAST:event_removeShipButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShipManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JLabel changeNameLabel;
    private javax.swing.JTextField changeNameTextField;
    private javax.swing.JLabel changePilotLabel;
    private javax.swing.JLabel changeWeightLabel;
    private javax.swing.JTextField changeWeightTextField;
    private javax.swing.JComboBox<Spaceship> choseShipComboBox;
    private javax.swing.JLabel choseShipLabel;
    private javax.swing.JButton createShipButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JComboBox<String> racesPilotsListComboBox;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JTable shipsInOuterSpaceTable;
    // End of variables declaration//GEN-END:variables
}
