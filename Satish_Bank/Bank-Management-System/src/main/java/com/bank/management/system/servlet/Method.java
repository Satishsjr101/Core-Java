package com.bank.management.system.servlet;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import com.bank.management.system.dao.AccountDAO;
import com.bank.management.system.dao.AdminDAO;
import com.bank.management.system.dto.AdminDTO;
import com.bank.management.system.dto.CustomerDTO;
import com.bank.management.system.dto.TransactionDTO;
import com.bank.management.system.service.EmailSender;
import com.bank.management.system.dto.AccountDTO;
import com.bank.management.system.util.DBUtil;
import com.bank.management.system.service.EmailSender;
import java.util.Random;
import java.security.DrbgParameters.NextBytes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Method {

	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	AdminDAO a = new AdminDAO();
	AdminDTO adminDTO = new AdminDTO();
	CustomerDTO customerDTO = new CustomerDTO();
	AccountDTO accountDTO = new AccountDTO();
	TransactionDTO transactionDTO = new TransactionDTO();
	DBUtil dbUtil = new DBUtil();
	Validation d = new Validation();

	final private String INSERT_CUSTOMER_DETAIL = "insert into customer(first_name,last_name,date_of_birth,email,phone_number,address,aadhar_number,pan_number) values(?,?,?,?,?,?,?,?)";

	final private String INSERT_ACCOUNT_DETAIL = "insert into account(account_number,account_type,cuurrent_balance,date_opened,customer_id,ifsc_code,pin) values(?,?,?,?,?,?,?)";

	final private String FIND_PARTICULAR_ACCOUNT = "select customer.first_name,customer.last_name,customer.phone_number,customer.address ,account.account_number,account.cuurrent_balance,account.ifsc_code,account.date_opened from customer inner join account on customer.customer_id = account.customer_id";

	public void adminLogin() throws Exception {
		String email = a.adminLogin();
		while (true) {
			if (email != null) {
				System.out.println();
				System.out.println("Admin Logged In!");

//				if(!AccountDAO.account_exist(email)) {
//					System.out.println();
//					System.out.println("1.Open New Bank Account ");
//					
//				}
				System.out.println("\t\t\t\t\t\t\tLOGIN SUCCESSFULL");
				while (true) {
					System.out.print(
							"\t\t\t=============================================================================\n");
					System.out.print("\t\t\t\t\t\tWELCOME TO ADMIN DASHBOARD\n");
					System.out.print(
							"\t\t\t=============================================================================\n");
					System.out.println("\t\t\t1. Create New Account");
					System.out.println("\t\t\t2. View Particular Account");
					System.out.println("\t\t\t3. List Of All Education Loan Users: ");
					System.out.println("\t\t\t4. Remove/Block account");
					System.out.println("\t\t\t5. View all account list");

					System.out.println("\t\t\t6. Exit");
					System.out.print("\n\t\t\tPlease Choose An Option: ");
					int ch = sc.nextInt();

					switch (ch) {
					case 1:
						newAccount();
						break;

					case 2:
						a.viewAllAccount();
						break;

					case 3:
						a.viewParticularAccount();
						break;

					case 4:
//						removeBlock();
						break;

					case 5:
//						updateAdminDetail();
						break;

					case 6:
						System.exit(0);

					}
					System.out.print("\t\t\tDo you want to perform any operation of admin(yes/no): ");
					sc.nextLine();
					String t1 = sc.nextLine();
					if (t1.equalsIgnoreCase("no")) {
						break;
					}
				}

			}

		}
	}

//  

	public int newAccount() throws Exception {
		Scanner sc = new Scanner(System.in);
		EmailSender email = new EmailSender();
		int count = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Fist Name : ");
		customerDTO.setFirstName(sc.nextLine());

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Last Name : ");
		customerDTO.setLastName(sc.nextLine());

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Date Of Birth[dd/MM/YYY] : ");
		customerDTO.setDob(sc.nextLine());

		System.out.println("Enter Your Email");
		customerDTO.setEmail(sc.nextLine());

		// Email code;
		email.setEmail(customerDTO.getEmail());

		boolean b = true;
		while (b) {
			System.out.print("\t\t\t\t\t\t\tPlease Enter Your MOblie : ");
			String number = sc.next();
			d.Number(number);
		}

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Address : ");
		customerDTO.setAddress(sc.nextLine());

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Aadhar Number : ");
		customerDTO.setAadharNumber(sc.nextLine());

		System.out.print("\t\t\t\t\t\t\tPlease Enter Your Pan Number : ");
		customerDTO.setPanNumber(sc.nextLine());

//		System.out.println("Enter Your Customer Id");
//		int a = sc.nextInt();

//		if (AccountDAO.account_exist1(a)) {
//			System.out.println("Admin is Already Exist this Email Address");
//
//		} else {
//			accountDTO.setCustomerId(a);

		accountDTO.setAccountType("Saving");
		System.out.println(" Your Account Type Saving");
		accountDTO.getDate();
		System.out.println("Date is Generated" + accountDTO.getDate());

		accountDTO.setAccountNumber(String.valueOf(random.nextInt(1000000000)));
		System.out.println("Account Number Generated Successfull ");

		accountDTO.setIfscCode("SBI2003");

		accountDTO.setPin(random.nextInt(10000));
		System.out.println("Your Account Pin Genreted Succefull");

		System.out.print("\t\t\t\t\t\t\tPlease Enter Initial Amout 1000 : ");
		accountDTO.setAccountBalance(sc.nextDouble());

		while (accountDTO.getAccountBalance() < 1000) {
			System.out.print("\t\t\t\t\t\t\tPlease Deposit Amount Greater Than 500: ");
			accountDTO.setAccountBalance(sc.nextDouble());
		}

//		System.out.println("Enter Your Email");
//		cu.email = s.next();
//		email.setEmail(cu.email);
		String r1 = "This is Your Account Number: " + accountDTO.getAccountNumber() + "\t\n This is Your IFSC Code: "
				+ accountDTO.getIfscCode() + "\t\nThis is Your Pin: " + accountDTO.getPin();
		email.createAndSendEmail("riteshpatil930286@gmail.com", "Test email subject", r1);

		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(INSERT_CUSTOMER_DETAIL);

			pstmt1 = connection.prepareStatement(INSERT_ACCOUNT_DETAIL);

			pstmt.setString(1, customerDTO.getFirstName());
			pstmt.setString(2, customerDTO.getLastName());
			pstmt.setString(3, customerDTO.getDob());
			pstmt.setString(4, customerDTO.getEmail());
			pstmt.setString(5, customerDTO.getMobile());
			pstmt.setString(6, customerDTO.getAddress());
			pstmt.setString(7, customerDTO.getAadharNumber());
			pstmt.setString(8, customerDTO.getPanNumber());

			count = pstmt.executeUpdate();

//				System.out.println(customerDTO.getAadharNumber()+" aadhar");
			PreparedStatement ps = connection.prepareStatement(
					"SELECT customer_id from Customer where aadhar_number = '" + customerDTO.getAadharNumber() + "'");
			ResultSet rs = ps.executeQuery();

			int id = 0;
			if (rs.next())
				id = rs.getInt("customer_id");
			System.out.println(id + " iddd");

			pstmt1.setString(1, accountDTO.getAccountNumber());
			pstmt1.setString(2, accountDTO.getAccountType());
			pstmt1.setDouble(3, accountDTO.getAccountBalance());
			pstmt1.setDate(4, accountDTO.getDate());
			pstmt1.setInt(5, id);
			pstmt1.setString(6, accountDTO.getIfscCode());
			pstmt1.setInt(7, accountDTO.getPin());

			if (rs != null)
				count = pstmt1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(connection, pstmt);
		}

//		}

		return count;
	}

	public void viewAllAccount1() throws SQLException {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {
			System.out.println("Ritesh");
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(FIND_PARTICULAR_ACCOUNT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("\n");
				System.out.println("First Name " + rs.getString("first_name"));
				System.out.println("Last Name " + rs.getString("last_name"));
				System.out.println("Mobile Number " + rs.getString("phone_number"));
				System.out.println("Address " + rs.getString("address"));
				System.out.println("Account Number " + rs.getString("account_number"));
				System.out.println("Balance " + rs.getString("cuurrent_balance"));
				System.out.println("IFSC Code " + rs.getString("ifsc_code"));
				System.out.println("Date " + rs.getString("date_opened"));
				System.out.println("\n");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(connection, pstmt, rs);
		}

	}

	public void transferMoney() throws Exception {
		Scanner sc = new Scanner(System.in);

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println("Enter Sender Account Number");
		String SenderAccountNumber = sc.nextLine();

		System.out.println("Enter Your Account Pin");
		int pin = sc.nextInt();

		System.out.println("Enter Receiver Account Number");
//		sc.next();
		String ReceiverAccountNumber = sc.next();

		String sql = "SELECT * FROM ACCOUNT Where account_number = ?";

		connection = dbUtil.getConnection();
		pstmt = connection.prepareStatement("SELECT * FROM ACCOUNT Where account_number = ?");
		pstmt.setString(1, ReceiverAccountNumber);

		ResultSet rs1 = pstmt.executeQuery();

//		rs = pstmt.executeQuery();
////		int x = pstmt.executeUpdate();
		int receiverAccountId = 0;

		if (rs1.next()) {
			receiverAccountId = rs1.getInt("account_id");
		}
//		if (rs.next())
//			receiverAccountId = rs.getInt("account_id");
//		else 
//			System.out.println("not found");
//		System.out.println("accountid"+ receiverAccountId);
		if (receiverAccountId != 0) {

			System.out.println("Please Enter A Amount How Much You Want To Transfer : ");
			double amount = sc.nextDouble();

			try {
//				connection.setAutoCommit(false);
				if (ReceiverAccountNumber != null && SenderAccountNumber != null) {
					connection = dbUtil.getConnection();

					pstmt = connection.prepareStatement("select * from account where account_number = ? and pin = ?");
					pstmt.setString(1, SenderAccountNumber);
					pstmt.setInt(2, pin);

					rs = pstmt.executeQuery();

					if (rs.next()) {
						double currentBalance = rs.getDouble("cuurrent_balance");
						int accountId = rs.getInt("account_id");
						transactionDTO.setAccountId(accountId);

						if (amount <= currentBalance) {

							// Write debit and credit queries
							String debit = "update account set cuurrent_balance = cuurrent_balance - ? where account_number = ?";
							String credit = "update account set cuurrent_balance = cuurrent_balance + ? where account_number = ?";

							// Debit and Credit prepared Statements
							PreparedStatement debitPstmt = connection.prepareStatement(debit);
							PreparedStatement creditPstmt = connection.prepareStatement(credit);

							// Set Values for debit and credit prepared statements
							creditPstmt.setDouble(1, amount);
							creditPstmt.setString(2, ReceiverAccountNumber);

							debitPstmt.setDouble(1, amount);
							debitPstmt.setString(2, SenderAccountNumber);

							int rowsAffected1 = debitPstmt.executeUpdate();
							int rowsAffected2 = creditPstmt.executeUpdate();

							if (rowsAffected1 > 0 && rowsAffected2 > 0) {
								System.out.println("Transaction Successful!");
								System.out.println("Rs." + amount + " Transferred Successfully");

								String transaction = "insert into transactions(date_time,creditAmount,debitAmount,detail,account_number) values(date_time,?,?,?,?)";
								pstmt = connection.prepareStatement(transaction);

//								pstmt.setDate(1, transactionDTO.getDate());
//								pstmt.setInt(2, transactionDTO.getAccountId());
								pstmt.setDouble(1, amount);
								pstmt.setDouble(2, 0.0);
								pstmt.setString(3, "Money sent to " + ReceiverAccountNumber + "");
								pstmt.setString(4, SenderAccountNumber);
								int c = pstmt.executeUpdate();

//							
								String transaction1 = "insert into transactions(date_time,creditAmount,debitAmount,detail,account_number) values(date_time,?,?,?,?)";
								pstmt = connection.prepareStatement(transaction1);

//								pstmt.setDate(1, transactionDTO.getDate());
//								pstmt.setInt(2, transactionDTO.getAccountId());
								pstmt.setDouble(1, 0.0);
								pstmt.setDouble(2, amount);
								pstmt.setString(3, "Money Receive from " + SenderAccountNumber + "");
								pstmt.setString(4, ReceiverAccountNumber);
								int c1 = pstmt.executeUpdate();
								System.out.println("rrr");

								return;

							} else {
								System.out.println("Transaction Failed");
								connection.rollback();
								connection.setAutoCommit(true);
							}

						} else {
							System.out.println("Insufficient Balance!");
						}

					} else {
						System.out.println("Invalid Security Pin!");
					}

				} else {
					System.out.println("Invalid account number");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Account Number Not Exist");
		}
		connection.setAutoCommit(true);
	}

	public void transaction(String date_time, int account_id, double credit_amount, double debit_amount, String detail,
			Connection connection, PreparedStatement pstmt) throws SQLException {

		String transaction = "insert into transaction(date_time,account_id,credit_amount,debit_amount,detail)value(?,?,?,?,?)";
		pstmt = connection.prepareStatement(transaction);

		pstmt.setDate(1, transactionDTO.getDate());
		pstmt.setInt(2, account_id);
		pstmt.setDouble(3, credit_amount);
		pstmt.setDouble(4, debit_amount);
		pstmt.setString(5, detail);
	}

	public void viewTransactionDetail() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		connection = dbUtil.getConnection();
		pstmt = connection.prepareStatement("select * from transactions");

		rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println("Debit Amount : " + rs.getDate("date_time"));
			System.out.println("Debit Amount : " + rs.getDouble("creditAmount"));
			System.out.println("Debit Amount : " + rs.getDouble("debitAmount"));
			System.out.println("Debit Amount : " + rs.getString("detail"));
			System.out.println("Debit Amount : " + rs.getDate("account_number"));

		}

	}

}
