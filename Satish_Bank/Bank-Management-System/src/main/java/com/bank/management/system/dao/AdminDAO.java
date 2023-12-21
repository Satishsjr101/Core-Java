package com.bank.management.system.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

import com.bank.management.system.dto.AdminDTO;
import com.bank.management.system.util.DBUtil;
import com.mysql.cj.xdevapi.Result;

public class AdminDAO {

	DBUtil dbUtil = new DBUtil();

	public AdminDAO() {

	}

	final private String INSERT_ADMIN_DETAIL = "insert into admin(first_name,last_name,email,password) values(?,?,?,?)";

	final private String FIND_ADMIN_DETAIL_BY_EMAIL_PASSWORD = "select * from admin where email = ? and password = ?";

	public int adminRegistration(AdminDTO AdminDTO) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;	
		Connection connection = null;
		PreparedStatement pstmt = null;

		System.out.println("Enter Admin First Name");
		String firstName = sc.next();
		AdminDTO.setFirstName(firstName);

		System.out.println("Enter Admin Last Name");
		String lastName = sc.next();
		AdminDTO.setLastName(lastName);

		System.out.println("Enter Admin Email");
		String email = sc.next();

		System.out.println("Enter Admin Password");
		String t = String.valueOf(random.nextInt(10000));
		AdminDTO.setPassword(t);

//		if (AdminDTO.getEmail() != null && AdminDTO.getEmail().equalsIgnoreCase(email)) {
//			System.out.println("Admin is Already Exist this Email Address");
		if (user_exist(email)) {
			System.out.println("Admin is Already Exist this Email Address");

		} else {
			try {
				AdminDTO.setEmail(email);
				connection = dbUtil.getConnection();
				pstmt = connection.prepareStatement(INSERT_ADMIN_DETAIL);

				pstmt.setString(1, AdminDTO.getFirstName());
				pstmt.setString(2, AdminDTO.getLastName());
				pstmt.setString(3, AdminDTO.getEmail());
				pstmt.setString(4, AdminDTO.getPassword());

				count = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dbUtil.close(connection, pstmt);
			}
		}
		return count;
	}

	public String adminLogin() throws Exception {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println("Enter Admin Email");
		String email = sc.next();

		System.out.println("Enter Admin Password");
		String password = sc.next();

		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(FIND_ADMIN_DETAIL_BY_EMAIL_PASSWORD);

			pstmt.setString(1, email);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				return email;
			} else {
				return null;
			}

		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(connection, pstmt, rs);
		
		}

	}

	public boolean user_exist(String email) {
		Connection connection = null;
		String query = "SELECT * FROM user WHERE email = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void viewAllAccount() {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
	    String sql = "SELECT * FROM Customer join Account ON Customer.Customer_Id = Account.customer_id";
        try {
        	connection = dbUtil.getConnection();
             pstmt = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pstmt.executeQuery();
            viewParticularAccount(rs);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void viewParticularAccount() {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstmt = null;
		   try {
			   
               System.out.println("Please Enter Account number");
               String acc = sc.next();

               connection = dbUtil.getConnection();

            String   sql = "SELECT * FROM Customer join Account ON Customer.Customer_Id = Account.customer_id WHERE Account_number = ?";
               PreparedStatement cust = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               cust.setString(1, acc);

               ResultSet rs = cust.executeQuery();
               if (rs != null) {
                   viewParticularAccount(rs);
               } else {
                   throw new Exception();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
		   
	}
	public void viewParticularAccount(ResultSet rs) {
        try {

            while (rs.next()) {
            	
            	
            	
//            	System.out.println("\n");
//				System.out.println("First Name " + rs.getString("first_name"));
//				System.out.println("Last Name " + rs.getString("last_name"));
//				System.out.println("Mobile Number " + rs.getString("phone_number"));
//				System.out.println("Address " + rs.getString("address"));
//				System.out.println("Account Number " + rs.getString("account_number"));
//				System.out.println("Balance " + rs.getString("cuurrent_balance"));
//				System.out.println("IFSC Code " + rs.getString("ifsc_code"));
//				System.out.println("Date " + rs.getString("date_opened"));
//				System.out.println("\n");

                String fname = rs.getString("first_name");
                String lname = rs.getString("last_name");
                String Address = rs.getString("phone_number");
                String acc = rs.getString("address");
                String acc_type = rs.getString("account_number");
                String bal = rs.getString("cuurrent_balance");
                String ifsc = rs.getString("ifsc_code");
                Date date = rs.getDate("date_opened");

                System.out.println(
                        "\nName : " + fname + " " + lname
                        + "\nAddress : " + Address
                        + "\nAccount No : " + acc
                        + "\nAccount Type : " + acc_type
                        + "\nCurrent Balance : " + bal
                        + "\nAccount opening Date : " + date
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void adminUpdate() {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = dbUtil.getConnection();
			System.out.println("Do you want to Change your user name y/n");
			char c = sc.next().charAt(0);
			if (c == 'y' || c == 'Y') {
				String sql = "update admin set email = ?";
				
			} else {

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
