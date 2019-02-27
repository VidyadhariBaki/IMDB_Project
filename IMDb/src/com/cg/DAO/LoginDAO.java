package com.cg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.connection.ConnectionFactory;
import com.cg.pojo.RegistrationDetails;

public class LoginDAO {

	public static boolean Login(String username, String password) throws SQLException {
		boolean status = false;
		Connection conn = ConnectionFactory.getConnection();
     
		String query = "select * from Registration where username= ? and password= ? ";
		RegistrationDetails reg = null;
        PreparedStatement pStatement = conn.prepareStatement(query);
        pStatement.setString(5, username);
		pStatement.setString(6, password);
		ResultSet rs = pStatement.executeQuery();
		status = rs.next();
		return status;

	}
}
