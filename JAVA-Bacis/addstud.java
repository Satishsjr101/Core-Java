import java.sql.*;

public class addstud {
    public static void main(String args[]) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection("JDBC:ODBC:B5DSN");
            System.out.println("Connected");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
