


//Database Connectivity
package com.bank.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;

        

public class DatabaseConnection {
    private static Connection con = null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management_system", "root", "root");
               System.out.println("sucess");
               
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
    return con;
}
}

