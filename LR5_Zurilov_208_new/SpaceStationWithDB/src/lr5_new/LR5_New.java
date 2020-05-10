/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr5_new;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER_PC
 */
public class LR5_New 
{
    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:SpaceManagement.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection success");
        } catch (SQLException e) {
            System.out.println("Connection failure");
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException 
    {
        // TODO code application logic here
        LR5_New obj = new LR5_New();
        obj.connect();
        MainMenuForm mainMenuFormObj = new MainMenuForm();
        mainMenuFormObj.setVisible(true);
    }
    
}
