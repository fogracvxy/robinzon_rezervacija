/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// spajanje na bazu 
/**
 *
 * @author Spuda
 */
public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306/rezervacijalucica";    
    private static String driverName = "com.mysql.cj.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Konekcija nije uspjela."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nije pronaden."); 
        }
        return con;
    }
}
