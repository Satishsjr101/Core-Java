/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectivitycode;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * @author Parth
 */
public class DataBaseConnectivity {
      private static Connection con = null;
    public static java.sql.Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Info_Bank?useSSL=false", "root", "Bhola@123");
        } catch (Exception e) {
           e.printStackTrace();
        }
        return con;
    }
}
