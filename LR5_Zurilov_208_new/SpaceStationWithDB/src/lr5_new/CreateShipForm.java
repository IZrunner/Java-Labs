package lr5_new;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateShipForm extends javax.swing.JFrame {    
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    LR5_New lr5Obj = new LR5_New();
    //ShipManagementForm shipManagementForm = new ShipManagementForm();
    
    public CreateShipForm() 
    {             
        initComponents();  
        connectionObj = lr5Obj.connect();
        choseRaceMethod();
    }

    private void choseRaceMethod()
    {
        try 
        {
            String sql = "SELECT * FROM Races";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String raceName = resultSetObj.getString("RaceName");
                pilotsRacesListCreateShipComboBox.addItem(raceName);          
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Cannot fill the combobox");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setShipNameLabel = new javax.swing.JLabel();
        setShipWeightLabel = new javax.swing.JLabel();
        chosePilotRaceLabel = new javax.swing.JLabel();
        pilotsRacesListCreateShipComboBox = new javax.swing.JComboBox<>();
        setShipsNameTextField = new javax.swing.JTextField();
        setShipWeightTextField = new javax.swing.JTextField();
        createShipButton = new javax.swing.JButton();
        quitCreateShipButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Ship");
        setLocation(new java.awt.Point(400, 275));
        setName("someFrame"); // NOI18N

        setShipNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setShipNameLabel.setText("Set Name");

        setShipWeightLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setShipWeightLabel.setText("Set Weight");

        chosePilotRaceLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        chosePilotRaceLabel.setText("Chose Pilot Race");

        pilotsRacesListCreateShipComboBox.setEditable(true);
        pilotsRacesListCreateShipComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        pilotsRacesListCreateShipComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotsRacesListCreateShipComboBoxActionPerformed(evt);
            }
        });

        setShipsNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setShipWeightTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(setShipWeightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(setShipNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chosePilotRaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setShipsNameTextField)
                            .addComponent(setShipWeightTextField)
                            .addComponent(pilotsRacesListCreateShipComboBox, 0, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(quitCreateShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setShipNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setShipsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setShipWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setShipWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilotsRacesListCreateShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chosePilotRaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(quitCreateShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewShipActionPerformed
        // TODO add your handling code here:
        int shipsWeight = 0;
        try
        {        
            shipsWeight = Integer.parseInt(setShipWeightTextField.getText());       
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Not an integer value");
            return;
        }
        String shipsName = setShipsNameTextField.getText();
        String pilotRace = pilotsRacesListCreateShipComboBox.getSelectedItem().toString();
        String defaultStationNsme = "Open Space";
        String sqlInsertNewShip = "INSERT INTO Spaceships(ShipName, ShipWeight, PilotRace, SpaceShipStation) VALUES(?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewShip); 
            pstmt.setString(1, shipsName);
            pstmt.setInt(2, shipsWeight);
            pstmt.setString(3, pilotRace);
            pstmt.setString(4, defaultStationNsme);
            pstmt.executeUpdate(); 
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        ShipManagementForm shipManagementForm = new ShipManagementForm();
        shipManagementForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createNewShipActionPerformed

    private void quitCreateShipFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitCreateShipFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ShipManagementForm shipManagementForm = new ShipManagementForm();
        shipManagementForm.setVisible(true);
    }//GEN-LAST:event_quitCreateShipFormActionPerformed

    private void pilotsRacesListCreateShipComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilotsRacesListCreateShipComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilotsRacesListCreateShipComboBoxActionPerformed

    
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
            java.util.logging.Logger.getLogger(CreateShipForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateShipForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateShipForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateShipForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateShipForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chosePilotRaceLabel;
    private javax.swing.JButton createShipButton;
    private javax.swing.JComboBox<String> pilotsRacesListCreateShipComboBox;
    private javax.swing.JButton quitCreateShipButton;
    private javax.swing.JLabel setShipNameLabel;
    private javax.swing.JLabel setShipWeightLabel;
    private javax.swing.JTextField setShipWeightTextField;
    private javax.swing.JTextField setShipsNameTextField;
    // End of variables declaration//GEN-END:variables
}
