package info_bank;

import java.sql.Statement;
import connectivitycode.DataBaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Admin {

    Scanner input = new Scanner(System.in);

    public static int createAccount(Customer cus) {
        int x = -1;
        Connection con = null;
        try {
            con = DataBaseConnectivity.getConnection();
            String sql = "insert into Customer(AccNo, name,Father_name,address,email,Mobile,IFSC,Issue_Date,balance,Password,DOB,PAN,aadhar,isBlock) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, cus.getAccNo() + "");
            pre.setString(2, cus.getName());
            pre.setString(3, cus.getfName());
            pre.setString(4, cus.getAddress());
            pre.setString(5, cus.getEmail());
            pre.setString(6, cus.getMobile());
            pre.setString(7, "SBIN0030134");
            pre.setString(8, cus.getIssueDate());
            pre.setDouble(9, cus.getBalance());
            pre.setString(10, cus.getPassword());
            pre.setString(11, cus.getDOB());
            pre.setString(12, cus.getPAN());
            pre.setString(13, cus.getAadhar());
            pre.setBoolean(14, false);

            x = pre.executeUpdate();

            PreparedStatement p = con.prepareStatement("insert into transaction(AccNo,Date_Time,Dr_Cr,Amount,Balance,Receiver_name) values(?,?,?,?,?,?)");
            p.setString(1, cus.getAccNo() + "");
            p.setString(2, cus.getIssueDate());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return x;
    }

    void viewParticularAccount() {
        Connection con = null;
        String acc = null;
        try {
            con = DataBaseConnectivity.getConnection();
            Statement statement = con.createStatement();
            System.out.print("\t\t Enter the account ");
            String accNum = input.next();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from customer where AccNo ='" + accNum + "'");
            while (resultSet.next()) {
                System.out.println("\n\t\t Account number    : " + resultSet.getString("AccNo"));
                acc = resultSet.getString("AccNo");
                System.out.println("\n\t\t IFSC Code         : " + resultSet.getString("IFSC"));
                System.out.println("\n\t\t Customer Name     : " + resultSet.getString("Name"));
                System.out.println("\n\t\t Father's Name     : " + resultSet.getString("Father_Name"));
                System.out.println("\n\t\t DOB               : " + resultSet.getString("DOB"));
                System.out.println("\n\t\t Address           : " + resultSet.getString("Address"));
                System.out.println("\n\t\t Mobile No.        : " + resultSet.getLong("Mobile"));
                System.out.println("\n\t\t e-mail id         : " + resultSet.getString("Email"));
                System.out.println("\n\t\t Issue Date & Time : " + resultSet.getString("Issue_Date"));
                System.out.println("\n\t\t Balance           : " + resultSet.getDouble("Balance"));
                System.out.println("\n\t\t isBlock or Not    : " + resultSet.getBoolean("isBlock"));
                //System.out.println("\n\t\t Password          : " + resultSet.getString("Password"));
            }
            con.close();
            if (acc == null) {
                System.out.println("\t\t\t Invalid account Number ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void removeBlockAccount() {
        Connection con = null;
        try {
            con = DataBaseConnectivity.getConnection();
            System.out.println("\t\t Enter the Customer Account No. : ");
            long accNo = input.nextLong();
            PreparedStatement pre = con.prepareStatement("update customer set isBlock = ? where accno = ?");
            System.out.print("\t\t Do you want to block the account ? \n\t\t press 'y' if yes : ");
            String ch = input.next();
            if (ch.toLowerCase().equals("y")) {
                pre.setLong(2, accNo);
                pre.setBoolean(1, true);
            } else {
                pre.setLong(2, accNo);
                pre.setBoolean(1, false);
            }
            int i = pre.executeUpdate();
            if (ch.toLowerCase().equals("y")) {
                System.out.println("\t\t Blocked sucessfully!");
            } else {
                System.out.println("\t\t Not a Block ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void viewAllAccount() {
        Connection con = null;
        try {
            con = DataBaseConnectivity.getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from customer");
            int i = 1;
            while (resultSet.next()) {
                System.out.println("\n\t\t\t\t" + i + ". Account Details");
                System.out.println("\t\t Account number    : " + resultSet.getLong("AccNo"));
                System.out.println("\t\t Customer Name     : " + resultSet.getString("Name"));
                System.out.println("\t\t Address           : " + resultSet.getString("Address"));
                System.out.println("\t\t Mobile No.        : " + resultSet.getLong("Mobile"));
                System.out.println("\t\t e-mail id         : " + resultSet.getString("Email"));
                System.out.println("\t\t Issue Date & Time : " + resultSet.getString("Issue_Date"));
                i++;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean login(Connection con, String username, String password) {
        // code for login the admin
        try {
            PreparedStatement ps = con.prepareStatement("select * from Admin where Username = '" + username + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return username.equals(rs.getString("Username")) && password.equals(rs.getString("Password"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return false;
    }
}
