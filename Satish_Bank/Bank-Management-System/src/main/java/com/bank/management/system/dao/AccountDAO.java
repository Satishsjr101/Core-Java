package com.bank.management.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.management.system.dto.AdminDTO;
import com.bank.management.system.util.DBUtil;
import com.mysql.cj.xdevapi.Result;

public class AccountDAO {

	DBUtil dbUtil = new DBUtil();
	
	public AccountDAO() {

	}

	final private static String FIND_ACCOUNT_NUMBER = "SELECT account_number from Account WHERE email = ?";

	public static boolean account_exist(String email) {

		Connection connection = null;
		
//        String query = "SELECT account_number from Accounts WHERE email = ?";
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(FIND_ACCOUNT_NUMBER);
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
	
	final private static String FIND_ACCOUNT_EXIST = "SELECT * from customer WHERE customer_id = ?";

	public static boolean account_exist1(int customer_id) throws Exception {

		Connection connection = null;

//        String query = "SELECT account_number from Accounts WHERE email = ?";
		try {
			DBUtil dbUtil = new DBUtil();
			connection = dbUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(FIND_ACCOUNT_EXIST);
			preparedStatement.setInt(1, customer_id);
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
}
