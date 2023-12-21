/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermethod;

import com.passwordactivationcode.Validation;
import connectivitycode.DataBaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import testadminoperation.AccountCreation;
import java.sql.Statement;

/**
 *
 * @author Parth
 */
public class CustomerAccess {

    private static final String RESET = "\u001B[0m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    Scanner sc = new Scanner(System.in);

    public void viewAccount(Connection con, String pas) {
        try {
            PreparedStatement ps = con.prepareStatement("select * from customer where Password = '" + pas + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(YELLOW + "\n\t\t\t\t\t\t WELCOME TO THE CUSTOMER PAGE" + RESET);
                System.out.println("\n\t\t  Account number      : " + rs.getString("AccNo"));
                System.out.println("\n\t\t  Customer Name       : " + rs.getString("Name"));
                System.out.println("\n\t\t  Father's Name       : " + rs.getString("Father_name"));
                System.out.println("\n\t\t  Address             : " + rs.getString("Address"));
                System.out.println("\n\t\t  Mobile No.          : " + rs.getString("Mobile"));
                System.out.println("\n\t\t  Issue Date & Time   : " + rs.getString("Issue_date"));
                System.out.println(YELLOW + "\n\t\t=========================================================" + RESET);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

//    void applyLoan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    

    public void transferMoney(Connection con, String password, String acc) {
        // code fo transfer money from one account to another
        Scanner sc = new Scanner(System.in);
        try {

            
            String accountno = Validation.accNo();
            
            if(acc.equals(accountno)){
                System.out.println("You can't transfer money to self account");
            }else{
                
            double amount = Validation.amount();
            
            System.out.print("Enter password : ");
            String pass = sc.next();
            
            PreparedStatement p = con.prepareStatement("select * from customer where AccNo = '" + accountno + "'");
            ResultSet r = p.executeQuery();
            
            String accno = "";
            Double recbal = 0.0;
            String name1 = "";
            while (r.next()) {
                accno = r.getString("AccNo");
                recbal = r.getDouble("Balance");
                name1 = r.getString("Name");
//                boolean flag = r.getBoolean("isBlock");
            }
            if (accno.equals(accountno)) {
                
                PreparedStatement ps = con.prepareStatement("select * from customer where Password = '" + pass + "'");
                ResultSet rs = ps.executeQuery();
                
                double balance = 0;
                String name = "";
                String date = AccountCreation.dtf.format(AccountCreation.now);
                String accountno1 = "";
                boolean flag = true;
                
                while (rs.next()) {
                    balance = rs.getDouble("Balance");
                    name = rs.getString("Name");
                    accountno1 = rs.getString("AccNo");
                    if (balance > amount) {    
                        balance -= amount;
                        recbal += amount;
                        //Sender*
                        ps = con.prepareStatement("update customer set Balance = " + balance + "where AccNo = '" + acc + "'");
                        ps.execute();
                        //Receiver*
                        ps = con.prepareStatement("update customer set Balance = " + recbal + "where AccNo = '" + accountno + "'");
                        ps.execute();

                    } else {
                        System.out.println("Insufficient Balance");
                        flag = false;
                    }
                }
                if (flag) {
                    ps = con.prepareStatement("insert into transaction(AccNo,Date_Time,Dr_Cr,Amount,Balance,Receiver_name) values(?,?,?,?,?,?)");
                    ps.setString(1, accountno1);
                    ps.setString(2, date);
                    ps.setString(3, "Debit");
                    ps.setDouble(4, amount);
                    ps.setDouble(5, balance);
                    ps.setString(6, name1);
                    ps.execute();
                    ps = con.prepareStatement("insert into transaction(AccNo,Date_Time,Dr_Cr,Amount,Balance,Receiver_name) values(?,?,?,?,?,?)");
                    ps.setString(1, accountno);
                    ps.setString(2, date);
                    ps.setString(3, "Credit");
                    ps.setDouble(4, amount);
                    ps.setDouble(5, recbal);
                    ps.setString(6, name);
                    ps.execute();
                    System.out.println("Transfer Money Successfully.....");
                }
            } else {
                System.out.println("This account not exist");
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void transactionHistory(Connection con, String acc) {
        // code for transaction History
        try {
            PreparedStatement ps = con.prepareStatement("select * from transaction where AccNo = '" + acc + "'");
            ResultSet rs = ps.executeQuery();
            System.out.println(YELLOW + "\t\t=========================================================================" + RESET);
            System.out.println(YELLOW + "\t\t|				 |					|		   |			|			  |");
            System.out.println("\t\t|    Date and Time     |  	 Name	 	|  Dr./Cr. |   Amount   |  Ava. Balance   | ");
            System.out.println(YELLOW + "\t\t=========================================================================" + RESET);
            while (rs.next()) {
                System.out.println("\n\t\t|  " + rs.getString("Date_Time") + " \t    " + rs.getString("Receiver_name") + "\t\t" + rs.getString("Dr_Cr") + "\t    " + rs.getDouble("Amount") + "\t   " + rs.getDouble("Balance"));
            }
            System.out.println(YELLOW + "\n\t\t======================================================================" + RESET);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void updateDetails(Connection con) {
        try {
            System.out.println("\n\t\t what do you want to update : ");
            System.out.println("\t\t Press 1. for update Mobile No. ");
            System.out.println("\t\t Press 2. for update the address ");
            System.out.println("\t\t Press 3. for change password ");
            System.out.print("\t\t Select your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    updateMobile(con);
                    break;
                case 2:
                    updateAddress(con);
                    break;
                case 3:
                    updatePassword(con);
                default:
                    System.out.println("\t\t Invalid selcetion ");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateAddress(Connection con) {
        // update address
        try {
            System.out.print("Enter Old Address : ");
            sc.nextLine();
            String addold = sc.nextLine();
            System.out.print("Enter New Address : ");
            String address = sc.nextLine();
            PreparedStatement ps = con.prepareStatement(
                    "update customer set Address = '" + address + "'" + " where Address = '" + addold + "'");
            if (ps.execute()) {
                System.out.println("Update successfully....");
            } else {
                System.out.println("update failed ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMobile(Connection con) {
        // update user mobile number
        try {
            System.out.print("Enter Old Contact : ");
            sc.nextLine();
            String mobold = Validation.Contact(sc);
            System.out.print("Enter New Contact : ");
            String mobile = Validation.Contact(sc);
            PreparedStatement ps = con
                    .prepareStatement("update customer set Mobile = '" + mobile + "'" + " where Mobile = '" + mobold + "'");
            if (ps.execute()) {
                System.out.println("Update successfully....");
            } else {
                System.out.println("update failed ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updatePassword(Connection con) {
        // update user mobile number
        try {
            System.out.print("Enter Old Password : ");
            String pasold = sc.next();
            System.out.print("Enter New Password : ");
            String password = sc.next();
            PreparedStatement ps = con.prepareStatement(
                    "update customer set Mobil = '" + password + "'" + " where Address = '" + pasold + "'");
            if (ps.execute()) {
                System.out.println("Update successfully....");
            } else {
                System.out.println("update failed ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(Connection con, String acc, String pas) {
        // code for login the cutomer
//        boolean flag = true;
        try {
            PreparedStatement ps = con.prepareStatement("select * from customer where accno = '"+acc+"'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return acc.equals(rs.getString("AccNo")) && pas.equals(rs.getString("Password")) && false == rs.getBoolean("isBlock");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return false;
    }

    public void applyLoan(String acc) throws SQLException {
        String accNo = null;
        while (true) {
            Connection con = DataBaseConnectivity.getConnection();
            Statement st = null;
            try {
                st = con.createStatement();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(CustomerAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            ResultSet rs = null;
            try {
                rs = st.executeQuery("select * from  customer where AccNo='" + acc + "'");
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(CustomerAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            while (rs.next()) {
                try {
                    accNo = rs.getString("AccNo");
                } catch (Exception ex) {
                    //   Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (accNo.equals(acc)) {
                System.out.println("\t\t\t1)Personal Loan\t\t2)Education Loan\t   3) Exit  ");
                System.out.println("\t\t\t-----------------\t-----------------\t-----------------");
                System.out.print("\t\t\t\tEnter the choice: ");
                int n = sc.nextInt();
                int x = -1;
                switch (n) {
                    case 1 -> {
                        System.out.println("\n\n\t\t\t\t\t\t-----------------");
                        System.out.println("\t\t\t\t\t\t  Personal Loan");
                        System.out.println("\t\t\t\t\t\t-----------------");
                        System.out.println(
                                "\t\t\t*Loan offer Starting from Min.RS 50,000/- to Max.RS 5,00,000/-\n\n\t\t\t* Interest rate Starting from Min.12%\n\n\t\t\t* Age between 21 to 57 \n\n\t\t\t* Loan Repayment period from Min.18 months tp Max.36 months\n\n\t\t\t* Processing charges: 2% of the amount (Min.RS 1000/- Max.RS 10,000)\n");
                        System.out.println("\t\t\t\t-----------------\t-----------------");
                        System.out.println("\t\t\t\t     (1)YES  \t\t     (2)NO");
                        System.out.println("\t\t\t\t-----------------\t-----------------");
                        System.out.print("\t\t\t\tEnter the choice: ");
                        int n1 = sc.nextInt();
                        switch (n1) {
                            case 1 -> {
                                System.out.println("\t\t\t\tApply for loan Enter the details: ");
                                boolean forName = true;
                                String name = null;
                                char ch = '\u0000';
                                sc.nextLine();
                                while (forName) {
                                    System.out.print("\t\t Enter name:");
                                    name = sc.nextLine();
                                    for (int i = 0; i < name.length(); i++) {
                                        ch = name.charAt(i);
                                    }
                                    if (!Character.isLetter(ch)) {
                                        System.out.println(RED + "\t\tPlease enter the valid name " + RESET);
                                        continue;
                                    }
                                    forName = false;
                                }
                                // Mobile Number
                                String mb = Validation.Contact(sc);
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                // Aadhar Card
                                String ad = Validation.aadhar();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                String pn = null;
                                boolean flag = true;
                                while (flag) {
                                    System.out.print("\t\t Enter your PAN No. ");
                                    pn = sc.next();
                                    if (!Validation.validatePAN(pn)) {
                                        System.out.print("\t\t \tYou have entered incorrec PAN re-enter again \n");
                                        continue;
                                    }
                                    flag = false;
                                }
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the  age: ");
                                int ag = Validation.age(sc);
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the your salary:");
                                int salary = sc.nextInt();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the Amount for loan: ");
                                double am = sc.nextDouble();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                String date = AccountCreation.dtf.format(AccountCreation.now);
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the Duration(number of year) of loan:");
                                int Duration = Validation.Duration(sc);
                                double Interest = (am * 12) / 100;
                                double m = Duration * 12;
                                double emi = (am + Interest) / m;
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tyour loan monthly EMI: ");
                                System.out.printf("%.3f", emi);
                                if ((ag >= 21 && ag <= 57) && (am >= 50000 && am <= 500000) && emi < salary) {
                                    String sql = "insert into Loan(acc,Name,Mobile,Address,Pan_card,Age,Salary,Amount,date,Duration,Interest,m,emi) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                    PreparedStatement ps = con.prepareStatement(sql);
                                    ps.setString(1, accNo);

                                    ps.setString(2, name);
                                    ps.setString(3, mb);
                                    ps.setString(4, ad);
                                    ps.setString(5, pn);
                                    ps.setInt(6, ag);
                                    ps.setDouble(7, salary);
                                    ps.setDouble(8, am);
                                    ps.setString(9, date);
                                    ps.setInt(10, Duration);
                                    ps.setDouble(11, Interest);
                                    ps.setDouble(12, m);
                                    ps.setDouble(13, emi);

                                    x = ps.executeUpdate();

                                    System.out.println("\n\t\t\t\tLOAN IS SUCCESSFULLY PASSED... ");
                                    break;
                                } else {
                                    System.out.println("\t\t\t\tLOAN IS FAILED... ");
                                }
                            }

                            case 2 ->
                                System.out.println("\t\t\t\tYour are Exit personal loan page..");
                            default ->
                                System.out.println(
                                        "\t\t\t\tInvalid choice");

                        }
                    }
                    case 2 -> {
                        System.out.println("\n\n\t\t\t\t\t\t-----------------");
                        System.out.println("\t\t\t\t\t\t  Education Loan");
                        System.out.println("\t\t\t\t\t\t-----------------");
                        System.out.println(
                                "\t\t\t*Loan offer Starting from Min.RS 50,000/- to Max.RS 1Cr./-\n\n\t\t\t* Age 18 to 25 \n\n\t\t\t* Interest rate Starting from Min.10%\n\n\t\t\t* Loan Repayment period from Min.18 months tp Max.36 months\n\n\t\t\t* Processing charges: 2% of the amount (Min.RS 1000/- Max.RS 10,000)");
                        System.out.println("\t\t\t\t-----------------\t-----------------");
                        System.out.println("\t\t\t\t     (1)YES  \t\t     (2)NO");
                        System.out.println("\t\t\t\t-----------------\t-----------------");
                        System.out.print("\t\t\t\tEnter the choice: ");
                        int n2 = sc.nextInt();

                        switch (n2) {

                            case 1 -> {
                                System.out.println("\t\t\t\tApply for loan Enter the details ");
                                System.out.print("\t\t\t\tEnter the moblie number: ");
                                String mb = sc.next();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the Adhar Number: ");
                                String ad = sc.next();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tLetter for principle: ");
                                char ch1 = sc.next().charAt(0);
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the  age: ");
                                int ag = sc.nextInt();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the Amount for loan: ");
                                double am = sc.nextDouble();
                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                System.out.print("\t\t\t\tEnter the Duration(number of year) of loan:");
                                int Duration = sc.nextInt();

                                System.out.println(
                                        "\t\t\t\t-------------------------------------------");
                                double Interest = (am * 10) / 100;
                                double m = Duration * 12;
                                double emi = (am + Interest) / m;
                                System.out.print("\t\t\t\tyour loan monthly EMI: ");
                                System.out.printf("%.3f", emi);
                                if ((ag >= 18 && ag <= 25) && (am >= 50000 && am <= 10000000)
                                        && (ch1 == 'y' || ch1 == 'Y')) {
                                    System.out
                                            .println(GREEN + "\n\t\t\t\t LOAN IS SUCCESSFULLY PASSED... " + RESET);

                                    break;
                                } else {
                                    System.out.println(RED + "\t\t\t\tLOAN IS FAILED... " + RESET);
                                }
                            }
                            case 2 ->
                                System.out.println("\t\t\t\tYour are Exit Education loan page..");
                        }
                    }
                    case 3 ->{
                         System.exit(0);
                    }
                }
            } else {
                System.out.println(RED + "\t\t\t Invalid Account" + RESET);
                //break;

            }
        }
    }
    public void loanStatement(Connection con, String password, String acc) {
          try {
            PreparedStatement ps = con.prepareStatement("select * from loan where Acc = '" + acc + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
          //      System.out.println(YELLOW + "\n\t\t\t\t\t\t WELCOME TO THE CUSTOMER PAGE" + RESET);
                System.out.println("\n\t\t  Account number   : " + rs.getString("Acc"));
                System.out.println("\n\t\t  Customer Name    : " + rs.getString("Name"));
                System.out.println("\n\t\t  Loan Amount      : " + rs.getDouble("Amount"));
                System.out.println("\n\t\t  Issue Date       : " + rs.getString("date"));
                System.out.println("\n\t\t  Duration .       : " + rs.getInt("duration")+" year");
                System.out.println("\n\t\t  Interest         : " + rs.getDouble("Interest")+" Rs.");
                System.out.println("\n\t\t  EMI              : " + rs.getDouble("emi"));
                System.out.println(YELLOW + "\n\t\t=========================================================" + RESET);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
