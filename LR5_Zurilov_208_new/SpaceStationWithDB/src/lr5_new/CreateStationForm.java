package lr5_new;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateStationForm extends javax.swing.JFrame {    
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    LR5_New lr5Obj = new LR5_New();
    
    public CreateStationForm() 
    {             
        initComponents();  
        connectionObj = lr5Obj.connect();
        changeManagerRaceMethod();
    }
    
    private void changeManagerRaceMethod()
    {
        try 
        {
            String sql = "SELECT * FROM Races";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String raceName = resultSetObj.getString("RaceName");
                racesManagersListComboBox.addItem(raceName);          
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Cannot fill the combobox");
        }
        finally
        {
            if(prepparedStatObj != null) 
            {
                try {
                    prepparedStatObj.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setStationNameLabel = new javax.swing.JLabel();
        setStationWeightLimitLabel = new javax.swing.JLabel();
        setShipsLimitLabel = new javax.swing.JLabel();
        setStationNameTextField = new javax.swing.JTextField();
        setStationWeightLimitTextField = new javax.swing.JTextField();
        createShipButton = new javax.swing.JButton();
        quitCreateShipButton = new javax.swing.JButton();
        setShipsLimitTextField = new javax.swing.JTextField();
        racesManagersListComboBox = new javax.swing.JComboBox<>();
        changeManagerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Ship");
        setLocation(new java.awt.Point(400, 275));
        setName("someFrame"); // NOI18N

        setStationNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setStationNameLabel.setText("Set Name");

        setStationWeightLimitLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setStationWeightLimitLabel.setText("Set Weight Limit");

        setShipsLimitLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setShipsLimitLabel.setText("Set Ships Limit");

        setStationNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setStationWeightLimitTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        createShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        createShipButton.setText("Create");
        createShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewShipActionPerformed(evt);
            }
        });

        quitCreateShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        quitCreateShipButton.setText("Quit");
        quitCreateShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitCreateShipFormActionPerformed(evt);
            }
        });

        setShipsLimitTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        racesManagersListComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        changeManagerLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeManagerLabel.setText("Change Pilot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setStationWeightLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setStationNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setShipsLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setStationNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setStationWeightLimitTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setShipsLimitTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(racesManagersListComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(quitCreateShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setStationNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setStationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setStationWeightLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setStationWeightLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setShipsLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setShipsLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(racesManagersListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(quitCreateShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewShipActionPerformed
        // TODO add your handling code here:       
        String stationName = setStationNameTextField.getText();
        int stationWeightLimit = Integer.parseInt(setStationWeightLimitTextField.getText());
        int stationShipsLimit = Integer.parseInt(setShipsLimitTextField.getText());
        String stationManagerRace = racesManagersListComboBox.getSelectedItem().toString();       
        String sqlInsertNewShip = "INSERT INTO SpaceshipsStations(StationName, StationWeightLimit, ShipsLimit, StationManagerRace) VALUES(?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewShip); 
            pstmt.setString(1, stationName);
            pstmt.setInt(2, stationWeightLimit);
            pstmt.setInt(3, stationShipsLimit);
            pstmt.setString(4, stationManagerRace);            
            pstmt.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(prepparedStatObj != null) 
            {
                try {
                    prepparedStatObj.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        StationsManagementForm stationsManagementForm = new StationsManagementForm();
        stationsManagementForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createNewShipActionPerformed

    private void quitCreateShipFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitCreateShipFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
        StationsManagementForm stationsManagementForm = new StationsManagementForm();
        stationsManagementForm.setVisible(true);
    }//GEN-LAST:event_quitCreateShipFormActionPerformed

    
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
            java.util.logging.Logger.getLogger(CreateStationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateStationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateStationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateStationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateStationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changeManagerLabel;
    private javax.swing.JButton createShipButton;
    private javax.swing.JButton quitCreateShipButton;
    private javax.swing.JComboBox<String> racesManagersListComboBox;
    private javax.swing.JLabel setShipsLimitLabel;
    private javax.swing.JTextField setShipsLimitTextField;
    private javax.swing.JLabel setStationNameLabel;
    private javax.swing.JTextField setStationNameTextField;
    private javax.swing.JLabel setStationWeightLimitLabel;
    private javax.swing.JTextField setStationWeightLimitTextField;
    // End of variables declaration//GEN-END:variables
}
