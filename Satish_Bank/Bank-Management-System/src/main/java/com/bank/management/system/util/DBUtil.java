package com.bank.management.system.util;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {

	final private String URL = "jdbc:mysql://localhost:3306/bank_management_system";
	final private String USERNAME = "root";
	final private String PASSWORD = "root";
	final private String DRIVER = "com.mysql.cj.jdbc.Driver";

	public Connection getConnection() throws Exception {
		Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//		System.out.println("Connection Successful");
		return connection;
	}

	public void close(Connection conn, PreparedStatement pstm, ResultSet rs) throws SQLException {

		if (rs != null)
			rs.close();

		if (pstm != null)
			pstm.close();

		if (conn != null)
			conn.close();

	}

	public void close(Connection conn, PreparedStatement pstm) throws SQLException {

		close(conn, pstm, null);

	}

	public void close(PreparedStatement pstm) throws SQLException {

		close(null, pstm, null);

	}
}
