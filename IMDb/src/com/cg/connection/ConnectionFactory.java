package com.cg.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn;

	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orac11g");
			System.out.println("conectin done");
		} catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
		}

		return conn;
	}
//	public static void main(String[] args)
//	
//{
//		System.out.println(ConnectionFactory.getConnection());
//		
//		
//	}

}
