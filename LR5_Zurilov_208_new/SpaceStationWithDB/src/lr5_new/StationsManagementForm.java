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

public class StationsManagementForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    LR5_New lr5Obj = new LR5_New();
    String populateTableSql = "SELECT * FROM SpaceshipsStations";
    
    
    public StationsManagementForm() 
    {    
        initComponents(); 
        connectionObj = lr5Obj.connect();
        populateTableMethod(); 
        selectStationIdMethod();
        changeManagerRaceMethod();
        selectSearchFieldMethod();
    }

    void populateTableMethod()
    {
        try 
        {
            PreparedStatement populTableStatObj = connectionObj.prepareStatement(populateTableSql);
            resultSetObj = populTableStatObj.executeQuery();
            spaceStationsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(StationsManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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
    
    void selectStationIdMethod()
    {
        try 
        {
            String sql = "SELECT * FROM SpaceshipsStations";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String stationId = resultSetObj.getString("StationId");
                stationIdComboBox.addItem(stationId);          
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(StationsManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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
           
    void selectSearchFieldMethod()
    {
        try 
        {
            String sql = "SELECT * FROM SpaceshipsStations";            
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
            Logger.getLogger(StationsManagementForm.class.getName()).log(Level.SEVERE, null, ex);
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

        createStationButton = new javax.swing.JButton();
        changeShipsLimitLabel = new javax.swing.JLabel();
        changeNameLabel = new javax.swing.JLabel();
        changeWeightLimitLabel = new javax.swing.JLabel();
        changeNameTextField = new javax.swing.JTextField();
        changeWeightLimitTextField = new javax.swing.JTextField();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        spaceStationsTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();
        sortComboBox = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        repopulateTableButton7 = new javax.swing.JButton();
        searchFieldComboBox = new javax.swing.JComboBox<>();
        changeShipsLimitTextField = new javax.swing.JTextField();
        stationIdComboBox = new javax.swing.JComboBox<>();
        stationIdLabel = new javax.swing.JLabel();
        racesManagersListComboBox = new javax.swing.JComboBox<>();
        changeManagerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ships Management");
        setLocation(new java.awt.Point(350, 200));
        setName(""); // NOI18N

        createStationButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        createStationButton.setText("Create Station");
        createStationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShipActionPerformed(evt);
            }
        });

        changeShipsLimitLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeShipsLimitLabel.setText("Change Ships Limit");

        changeNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeNameLabel.setText("Change Name");

        changeWeightLimitLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        changeWeightLimitLabel.setText("Change Weight Limit");

        changeNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        changeWeightLimitTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        spaceStationsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(spaceStationsTable);

        removeShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removeShipButton.setText("Remove");
        removeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeShipButtonActionPerformed(evt);
            }
        });

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StationId", "StationName", "StationWeightLimit", "ShipsLimit", "StationManagerRace" }));

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

        changeShipsLimitTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        stationIdComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        stationIdLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        stationIdLabel.setText("Select Id");

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
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeWeightLimitLabel)
                                    .addComponent(stationIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeShipsLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(changeShipsLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(changeWeightLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(racesManagersListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(changeNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(stationIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(createStationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchFieldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createStationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stationIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stationIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchFieldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(changeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeWeightLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeWeightLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeShipsLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeShipsLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(racesManagersListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShipActionPerformed
        // TODO add your handling code here:
        CreateStationForm form = new CreateStationForm();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createShipActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed
        // TODO add your handling code here:       

        String sql = "UPDATE SpaceshipsStations SET StationName = ? , " + "StationWeightLimit = ? , " +  "ShipsLimit = ? , " +  "StationManagerRace = ? , " 
                + "WHERE StationId = ?";
        String selectedStationId = (String) stationIdComboBox.getSelectedItem();
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setString(1, changeNameTextField.getText());
            prepparedStatObj.setInt(2, Integer.parseInt(changeWeightLimitTextField.getText()));
            prepparedStatObj.setInt(3, Integer.parseInt(changeShipsLimitTextField.getText()));
            prepparedStatObj.setString(4, racesManagersListComboBox.getSelectedItem().toString());
            prepparedStatObj.setString(5, selectedStationId);
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

    private void removeShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeShipButtonActionPerformed
        // TODO add your handling code here:
        String sqlDelete = "DELETE FROM SpaceshipsStations WHERE StationId = ?";  
//        String sqlUpdate = "UPDATE Spaceships " +
//                "SET SpaceShipStation = 'Open Space'" +
//                "WHERE SpaceShipStation = ?";
        String selectedRow = spaceStationsTable.getModel().getValueAt(spaceStationsTable.getSelectedRow(), 0).toString();
        //String thisStationName = spaceStationsTable.getModel().getValueAt(spaceStationsTable.getSelectedRow(), 1).toString();
        try
        {
                prepparedStatObj = connectionObj.prepareStatement(sqlDelete);
                prepparedStatObj.setString(1, selectedRow);
                prepparedStatObj.executeUpdate();
                populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }          
        
//        try
//        {
//                prepparedStatObj = connectionObj.prepareStatement(sqlUpdate);
//                prepparedStatObj.setString(1, thisStationName);
//                prepparedStatObj.executeUpdate();
//                populateTableMethod();
//        } 
//        catch (SQLException e) 
//        {
//            System.out.println(e.getMessage());
//        }     
    }//GEN-LAST:event_removeShipButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        String selectedColumn = sortComboBox.getSelectedItem().toString();
        String sqlSort = "SELECT * FROM SpaceshipsStations ORDER BY " + selectedColumn;

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSort);
            resultSetObj = prepparedStatObj.executeQuery();
            spaceStationsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        }
        catch (Exception e)
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
        String sqlSearch = "SELECT * FROM SpaceshipsStations WHERE " + searchedColumn + " LIKE ?";

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSearch);        
            prepparedStatObj.setString(1, "%" + searchPattern + "%");
            resultSetObj = prepparedStatObj.executeQuery();
            spaceStationsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        }
        catch (Exception e)
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
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StationsManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StationsManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JLabel changeManagerLabel;
    private javax.swing.JLabel changeNameLabel;
    private javax.swing.JTextField changeNameTextField;
    private javax.swing.JLabel changeShipsLimitLabel;
    private javax.swing.JTextField changeShipsLimitTextField;
    private javax.swing.JLabel changeWeightLimitLabel;
    private javax.swing.JTextField changeWeightLimitTextField;
    private javax.swing.JButton createStationButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JComboBox<String> racesManagersListComboBox;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JButton repopulateTableButton7;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFieldComboBox;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JTable spaceStationsTable;
    private javax.swing.JComboBox<String> stationIdComboBox;
    private javax.swing.JLabel stationIdLabel;
    // End of variables declaration//GEN-END:variables
}
