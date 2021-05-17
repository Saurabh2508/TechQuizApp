/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh Rajput
 */
public class DBConnection {
     private static Connection conn;
        static
        {
            try
            {
                Class.forName("oracle.jdbc.OracleDriver");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-E8UL19VK:1521/xe","exam","student");
                JOptionPane.showMessageDialog(null, "Connected successfully to the DB");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Cannot connect to the the DB");
                ex.printStackTrace();
                System.exit(1);
            }
    }
        public static Connection getConnection()
        {
            return conn;
        }
        public static void closeConnection()
        {
            try
            {
                conn.close();
                JOptionPane.showMessageDialog(null, "Disconnected successfully to the DB");
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Connot Disconnect with the DB");
                ex.printStackTrace();
            }
        }
}
