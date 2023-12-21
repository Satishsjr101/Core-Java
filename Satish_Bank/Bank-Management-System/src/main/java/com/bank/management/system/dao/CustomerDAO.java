package com.bank.management.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

import com.bank.management.system.dto.AdminDTO;
import com.bank.management.system.dao.CustomerDAO;
import com.bank.management.system.util.DBUtil;
import com.bank.management.system.servlet.Method;
import com.mysql.cj.xdevapi.Result;

public class CustomerDAO {

	DBUtil dbUtil = new DBUtil();
	Method m = new Method();

	public CustomerDAO() {

	}

	final private String INSERT_ADMIN_DETAIL = "insert into admin(first_name,last_name,email,password) values(?,?,?,?)";

	final private String FIND_CUSTOMER_DETAIL_BY_EMAIL_PASSWORD = "select * from customer join account on customer.customer_id = account.customer_id where email = ? and pin = ?";

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

	public String customerLogin1() throws Exception {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println("Enter Customer Email");
		String email = sc.next();

		System.out.println("Enter Customer Password");
		String password = sc.next();

		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(FIND_CUSTOMER_DETAIL_BY_EMAIL_PASSWORD);

			pstmt.setString(1, email);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				return email;
			}
			return null;

		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(connection, pstmt, rs);

		}

	}

	public void customerLogin() throws Exception {
		Scanner sc = new Scanner(System.in);
		CustomerDAO c = new CustomerDAO();
		String email = customerLogin1();
		String t;
		int ch;
		while (true) {
			if (email != null) {
			System.out.println();
				System.out.println("\t\t\t\t\t\t\tCustomer Logged In!");

//				if(!AccountDAO.account_exist(email)) {
//					System.out.println();
//					System.out.println("1.Open New Bank Account ");
//					
//				}

				System.out.println("");
				// System.out.println( "\t\t\t\t\t\t\t\t\t1. Create New Account" +
				// reset);
				System.out.println("\t\t\t\t\t\t\t1. Check Your Balance");
				System.out.println("\t\t\t\t\t\t\t2. Transfer Money");
				System.out.println("\t\t\t\t\t\t\t3. Transfer Money");
				System.out.println("\t\t\t\t\t\t\t4. Transfer Money");
				System.out.println("\t\t\t\t\t\t\t5. Check Your All Last Transaction");
				System.out.println("\t\t\t\t\t\t\t6. Delete Account");
				System.out.println("\t\t\t\t\t\t\t7. Apply For Loan");
				System.out.println("\t\t\t\t\t\t\t8. Update Your Account");
				System.out.println("\t\t\t\t\t\t\t9. Exit");
				System.out.print("\n\n\t\t\t\t\t\t\tPlease Choose An Option: ");
				ch = sc.nextInt();

				switch (ch) {
				// case 1:
				// newAccount();
				// break;
				case 1:
		                  checkBalance();
					break;
				case 2:
							m.transferMoney();
					break;
				case 3:
//		                    deposit();
					break;
				case 4:
//		                    transferMoney();
					break;
				case 5:
//		                    checkAllLastTransaction();
					break;
				case 6:
//		                    deleteAccount();
					break;
				case 7:
//		                    applyLoan();
					break;
				case 8:
//		                    updateAccount();
					break;
				case 9:
					System.exit(0);
				}

				System.out.print("\t\t\t\t\t\t\t\tDo You Want To Continue[Y/N]: ");
				sc.nextLine();
				t = sc.nextLine();

				if (t.equals("n")) {
					break;
				}
			}else {
				System.out.println("else");
			}

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
	
	public void checkBalance() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("Enter Your Pin");
		int pin = sc.nextInt();
		
		
		connection = dbUtil.getConnection();
		pstmt = connection.prepareStatement("select first_name,last_name,phone_number,account_number,ifsc_code,cuurrent_balance from customer join account on customer.customer_id = account.customer_id where  pin = ?");
		
		pstmt.setInt(1, pin);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("First Name : "+rs.getString("first_name"));
			System.out.println("Last Name : "+rs.getString("last_name"));
			System.out.println("Mobile Number : "+rs.getString("phone_number"));
			System.out.println("Account Number : "+rs.getString("account_number"));
			System.out.println("IFSC Code : "+rs.getString("ifsc_code"));
			System.out.println("Current Balance : "+rs.getDouble("cuurrent_balance"));
		}
		
	}

}
