package lr5_new;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShipManagementForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    LR5_New lr5Obj = new LR5_New();
    String populateTableSql = "SELECT * FROM Spaceships";
    
    
    public ShipManagementForm() 
    {    
        initComponents(); 
        connectionObj = lr5Obj.connect();
        populateTableMethod(); 
        selectShipIdMethod();
        selectStationMethod();
        changePilotRaceMethod();   
        selectSearchFieldMethod();
    }
    
    private void changePilotRaceMethod()
    {
        try 
        {
            String sql = "SELECT * FROM Races";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String raceName = resultSetObj.getString("RaceName");
                racesPilotsListComboBox.addItem(raceName);          
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
    
    private void populateTableMethod()
    {
        try 
        {
            PreparedStatement populTableStatObj = connectionObj.prepareStatement(populateTableSql);
            resultSetObj = populTableStatObj.executeQuery();
            shipsInOuterSpaceTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void selectShipIdMethod()
    {
        try 
        {
            String sql = "SELECT * FROM Spaceships";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String shipId = resultSetObj.getString("ShipId");
                choseShipIdComboBox.addItem(shipId);          
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void selectStationMethod()
    {
        try 
        {
            String sql = "SELECT * FROM SpaceshipsStations";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String stationName = resultSetObj.getString("StationName");
                stationsListComboBox.addItem(stationName);          
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void selectSearchFieldMethod()
    {
        try 
        {
            String sql = "SELECT * FROM Spaceships";            
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            ResultSetMetaData resultSetMetaDataObj = resultSetObj.getMetaData();
            int columnCount = resultSetMetaDataObj.getColumnCount();

            // The column count starts from 1
            for (int i = 1; i <= columnCount; i++ ) 
            {
                String name = resultSetMetaDataObj.getColumnName(i);
                searchFieldComboBox.addItem(name);
              
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ShipManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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

        createShipButton = new javax.swing.JButton();
        choseShipIdLabel = new javax.swing.JLabel();
        changePilotLabel = new javax.swing.JLabel();
        changeNameLabel = new javax.swing.JLabel();
        changeWeightLabel = new javax.swing.JLabel();
        choseShipIdComboBox = new javax.swing.JComboBox<>();
        changeNameTextField = new javax.swing.JTextField();
        changeWeightTextField = new javax.swing.JTextField();
        racesPilotsListComboBox = new javax.swing.JComboBox<>();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shipsInOuterSpaceTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();
        stationsListComboBox = new javax.swing.JComboBox<>();
        changeStationLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        repopulateTableButton7 = new javax.swing.JButton();
        searchFieldComboBox = new javax.swing.JComboBox<>();

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

        choseShipIdLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        choseShipIdLabel.setText("Chose Ship Id");

        changePilotLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changePilotLabel.setText("Change Pilot");

        changeNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeNameLabel.setText("Change Name");

        changeWeightLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeWeightLabel.setText("Change Weight");

        choseShipIdComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        choseShipIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choseShipIdComboBoxActionPerformed(evt);
            }
        });

        changeNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        changeWeightTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        racesPilotsListComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        stationsListComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        changeStationLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeStationLabel.setText("Change Station");

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ShipId", "ShipName", "ShipWeight", "PilotRace", "SpaceShipStation" }));

        sortLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        sortLabel.setText("Sort");

        sortButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel.setText("Search Field");

        searchLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel1.setText("Search Pattern");

        searchPatternTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        repopulateTableButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repopulateTableButton7.setText("Repopulate Table");
        repopulateTableButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repopulateTableButton7ActionPerformed(evt);
            }
        });

        searchFieldComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choseShipIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeStationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changePilotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changeWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(choseShipIdComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(changeNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addComponent(racesPilotsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stationsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(removeShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repopulateTableButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchFieldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(choseShipIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choseShipIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchFieldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(changeWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(racesPilotsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changePilotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(changeStationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stationsListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShipActionPerformed
        // TODO add your handling code here:              
        CreateShipForm form = new CreateShipForm();
        form.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_createShipActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed
        // TODO add your handling code here:       
        String sql = "UPDATE Spaceships SET ShipName = ? , " + "ShipWeight = ? , " +  "PilotRace = ? , " +  "SpaceShipStation = ?  " + "WHERE ShipId = ?";
        String selectedShipId = (String) choseShipIdComboBox.getSelectedItem();
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setString(1, changeNameTextField.getText());
            prepparedStatObj.setInt(2, Integer.parseInt(changeWeightTextField.getText()));
            prepparedStatObj.setString(3, racesPilotsListComboBox.getSelectedItem().toString());
            prepparedStatObj.setString(4, stationsListComboBox.getSelectedItem().toString());
            prepparedStatObj.setString(5, selectedShipId);
            prepparedStatObj.executeUpdate();
            populateTableMethod();
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
    }//GEN-LAST:event_acceptChangesButtonActionPerformed

    private void quitShipManagementFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitShipManagementFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitShipManagementFormActionPerformed

    private void choseShipIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choseShipIdComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choseShipIdComboBoxActionPerformed

    private void removeShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeShipButtonActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM Spaceships WHERE ShipId = ?";  
        String selectedRow = shipsInOuterSpaceTable.getModel().getValueAt(shipsInOuterSpaceTable.getSelectedRow(), 0).toString();
        
        try
        {
                prepparedStatObj = connectionObj.prepareStatement(sql);
                prepparedStatObj.setString(1, selectedRow);
                prepparedStatObj.executeUpdate();
                populateTableMethod();
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
    }//GEN-LAST:event_removeShipButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        String selectedColumn = sortComboBox.getSelectedItem().toString();
        String sqlSort = "SELECT * FROM Spaceships ORDER BY " + selectedColumn;

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSort);
            resultSetObj = prepparedStatObj.executeQuery();
            shipsInOuterSpaceTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        }
        catch (SQLException e)
        {
            System.out.println("sorting went wrong");
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
    }//GEN-LAST:event_sortButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchedColumn = searchFieldComboBox.getSelectedItem().toString();
        String searchPattern = searchPatternTextField.getText();
        String sqlSearch = "SELECT * FROM Spaceships WHERE " + searchedColumn + " LIKE ?";

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSearch);        
            prepparedStatObj.setString(1, "%" + searchPattern + "%");
            resultSetObj = prepparedStatObj.executeQuery();
            shipsInOuterSpaceTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        }
        catch (SQLException e)
        {
            System.out.println("seraching went wrong");
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
    }//GEN-LAST:event_searchButtonActionPerformed

    private void repopulateTableButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repopulateTableButton7ActionPerformed
        // TODO add your handling code here:
        populateTableMethod();
    }//GEN-LAST:event_repopulateTableButton7ActionPerformed

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
    private javax.swing.JLabel changeStationLabel;
    private javax.swing.JLabel changeWeightLabel;
    private javax.swing.JTextField changeWeightTextField;
    private javax.swing.JComboBox<String> choseShipIdComboBox;
    private javax.swing.JLabel choseShipIdLabel;
    private javax.swing.JButton createShipButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JComboBox<String> racesPilotsListComboBox;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JButton repopulateTableButton7;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFieldComboBox;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JTable shipsInOuterSpaceTable;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> stationsListComboBox;
    // End of variables declaration//GEN-END:variables
}
